package com.example.demo.lab5.CassandraModel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SeduleFormToShedule implements Converter<SheduleForm, Shedule>{

    @Override
    public Shedule convert(SheduleForm sheduleForm) {
        Shedule shedule = new Shedule();
        if (sheduleForm.getId() != null) {
            shedule.setId(sheduleForm.getId());
        }
        shedule.setMovie(sheduleForm.getMovie());
        shedule.setFormat(sheduleForm.getFormat());
        shedule.setStartShaw(sheduleForm.getStartShaw());
        return shedule;
    }
}
