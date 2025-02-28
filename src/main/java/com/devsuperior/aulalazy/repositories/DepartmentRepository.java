package com.devsuperior.aulalazy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.devsuperior.aulalazy.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

	@Query("SELECT d FROM Department d JOIN FETCH d.employees e WHERE d.id = :id")
	Department findByIdFetchEmployees(@Param("id") Long id);

}
