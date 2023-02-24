package com.example.demo.lab5.Service;
import org.springframework.stereotype.Service;

import com.example.demo.lab5.ShedRepository;
import com.example.demo.lab5.CassandraModel.SeduleFormToShedule;
import com.example.demo.lab5.CassandraModel.Shedule;
import com.example.demo.lab5.CassandraModel.SheduleForm;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Service
public class SheduleServiceImpl implements SheduleService{
    private ShedRepository shedRepository;
    private SeduleFormToShedule seduleFormToShedule;

    public SheduleServiceImpl(ShedRepository shedRepository, SeduleFormToShedule seduleFormToShedule){
        this.shedRepository=shedRepository;
        this.seduleFormToShedule=seduleFormToShedule;
    }

    
    @Override
    public Shedule getById(UUID id) {
        return shedRepository.findById(id).orElse(null);
    }

    @Override
    public List<Shedule>listAll() {
        List<Shedule> shedule = new ArrayList<>();
        shedRepository.findAll().forEach(shedule::add); 
        return shedule;
    }
    @Override
    public Shedule saveOrUpdate(Shedule shedule) {
        shedRepository.save(shedule);
        return shedule;
    }


    @Override
    public Shedule saveOrUpdateSheduleForm(SheduleForm sheduleForm) {
        Shedule savedShedule = saveOrUpdate(seduleFormToShedule.convert(sheduleForm));
        return savedShedule;
    }
    
}
