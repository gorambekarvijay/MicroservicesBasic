package com.masterminds.departmentserivce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masterminds.departmentserivce.entity.Department;
import com.masterminds.departmentserivce.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	public Optional<Department> findDepartmentById(Long departmetId) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(departmetId);
	}
	
	
}
