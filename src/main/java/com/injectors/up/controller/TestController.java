package com.injectors.up.controller;

import com.injectors.up.Request.RequestTest;
import com.injectors.up.model.Test;
import com.injectors.up.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PATCH,RequestMethod.OPTIONS},maxAge = 3600)
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    private TestController(TestService testService){
        this.testService = testService;
    }

    @GetMapping
    public List<Test> getAllTest(){
        return testService.getAllTest();
    }

    @PostMapping
    public Test createTest(@RequestBody RequestTest requestTest){
        return testService.createTest(requestTest);
    }
}
