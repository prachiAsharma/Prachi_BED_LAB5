package com.greatlearning.EMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.EMS.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer >{

}
