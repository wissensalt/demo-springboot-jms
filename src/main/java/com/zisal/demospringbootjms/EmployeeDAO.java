package com.zisal.demospringbootjms;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created on 10/6/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface EmployeeDAO extends JpaRepository<Employee, Long>{
}
