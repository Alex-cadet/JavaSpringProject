package com.example.demo.lab5.Service;
import java.util.List;
import java.util.UUID;

import com.example.demo.lab5.CassandraModel.Shedule;
import com.example.demo.lab5.CassandraModel.SheduleForm;

public interface SheduleService {
    List<Shedule> listAll();
    Shedule getById(UUID id);
    Shedule saveOrUpdate(Shedule shedule);
    Shedule saveOrUpdateSheduleForm(SheduleForm sheduleForm);
}
