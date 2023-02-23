package com.example.demo.Service;
import java.util.List;
import java.util.UUID;

import com.example.demo.CassandraModel.Shedule;
import com.example.demo.CassandraModel.SheduleForm;

public interface SheduleService {
    List<Shedule> listAll();
    Shedule getById(UUID id);
    Shedule saveOrUpdate(Shedule shedule);
    Shedule saveOrUpdateSheduleForm(SheduleForm sheduleForm);
}
