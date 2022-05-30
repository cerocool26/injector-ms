package com.injectors.up.service;

import com.injectors.up.Request.RequestTest;
import com.injectors.up.mapping.TestMapper;
import com.injectors.up.model.Test;
import com.injectors.up.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    private TestRepository testRepository;

   @Autowired
    private  TestMapper testMapper;

    public TestService(TestRepository testRepository){
        this.testRepository = testRepository;
    }

    public List<Test> getAllTest(){
        return testRepository.findAll();
    }

    public Test createTest(RequestTest requestTest){
        return testRepository.save(testMapper.getTestForCreated(requestTest));
    }
}
