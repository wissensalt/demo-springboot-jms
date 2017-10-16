package com.zisal.demospringbootjms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 10/6/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@RestController
@RequestMapping("/employee")
public class RestEmployee {

    @Autowired
    EmployeeProducer employeeProducer;


    @PostMapping("/insert")
    public void insertEmployee(@RequestBody Employee employee) {
        employeeProducer.sendMessage(employee);
    }
}
