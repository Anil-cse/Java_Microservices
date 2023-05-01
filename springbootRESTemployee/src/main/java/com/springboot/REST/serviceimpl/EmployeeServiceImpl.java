package com.springboot.REST.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.REST.exception.IdNotFoundException;
import com.springboot.REST.modal.Employee;
import com.springboot.REST.repository.EmployeeRepository;
import com.springboot.REST.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(Employee employee) {
		Employee savedEmployee = employeeRepository.save(employee);
		return savedEmployee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Long employeeId){
		// TODO Auto-generated method stub
		Optional<Employee> employeeFromRepo = employeeRepository.findById(employeeId);
		if(employeeFromRepo.isPresent())
		{
			return employeeFromRepo.get();
		}
		else
		{
			throw new IdNotFoundException("id is not found for given id");
		}
		
	}

	@Override
	public Employee updateEmployeeById(Long employeeId, Employee employee) {
		Optional<Employee> employeeFromDb = employeeRepository.findById(employeeId);
		Employee updatedEmployee = null;
		if (employeeFromDb.isPresent()) {
			Employee employeeromRepo = employeeFromDb.get();
			employeeromRepo.setDepartment(employee.getDepartment());
			employeeromRepo.setName(employee.getName());
			updatedEmployee = employeeRepository.save(employeeromRepo);
		}
		else
		{
			throw new IdNotFoundException("id is not found for updation");
		}
		return updatedEmployee;
	}

	@Override
	public void deleteEmployeeById(Long employeeId) {
		if(!employeeRepository.existsById(employeeId))
		{
			throw new IdNotFoundException("id is not found to delete the record");
		}
		employeeRepository.deleteById(employeeId);
	}

}