package com.masterminds.departmentserivce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masterminds.departmentserivce.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
