package com.greatlearning.EMS.Service;

import java.util.List;

import com.greatlearning.EMS.Model.Employee;

public interface IService {
	public List<Employee> getAllEmployee();
	
	public void SaveEmployee (Employee emp);
	
	public  Employee getEmployeeById(int Id);
	
	public void deleteEmployeegetEmployeeById(int Id);

}
