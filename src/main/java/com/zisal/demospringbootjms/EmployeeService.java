package com.zisal.demospringbootjms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created on 10/6/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeeDAO employeeDAO;

    public void insertEmployee(Employee employee){
        employeeDAO.save(employee);
    }
}
