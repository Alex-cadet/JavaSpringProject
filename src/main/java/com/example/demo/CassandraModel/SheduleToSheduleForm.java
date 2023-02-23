package com.example.demo.CassandraModel;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SheduleToSheduleForm implements Converter<Shedule, SheduleForm>{
    
    @Override
    public SheduleForm convert(Shedule shedule) {
        SheduleForm sheduleForm = new SheduleForm();
        sheduleForm.setId(shedule.getId());
        sheduleForm.setMovie(shedule.getMovie());
        sheduleForm.setMinPrice(shedule.getMinPrice());
        sheduleForm.setFormat(shedule.getFormat());
        return sheduleForm;
    }
}
