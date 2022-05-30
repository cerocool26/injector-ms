package com.injectors.up.mapping;

import com.injectors.up.Request.RequestTest;
import com.injectors.up.model.Test;
import org.springframework.stereotype.Component;

@Component
public class ImplementTestMapper implements TestMapper {

    @Override
    public Test getTestForCreated(RequestTest requestTest){
        Test test = new Test();

        test.setPrueba(requestTest.getPrueba());
        test.setRangoOperacion(requestTest.getRangoOperacion());
        test.setDatosInyector(requestTest.getDatosInyector());
        test.setTipoInyector(requestTest.getTipoInyector());
        return test;
    }
}
