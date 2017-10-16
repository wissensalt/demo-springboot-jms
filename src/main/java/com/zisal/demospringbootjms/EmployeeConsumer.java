package com.zisal.demospringbootjms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created on 10/6/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Component
public class EmployeeConsumer {

    @Autowired
    EmployeeService employeeService;


    @JmsListener(destination = "queueEmployee", containerFactory = "employeeJmsFactory")
    @Transactional
    public void receive(Employee employee){
        System.out.println("Received message : "+employee.toString());
        employeeService.insertEmployee(employee);
    }
}
