package com.employee.democrud.db.repository;

import com.employee.democrud.db.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//
//    void deleteById(@Param("id") Integer id);

//    @Query(value = "Select c from Employee c where c.name = :name and c.user_date = :user_date")
//    List<Employee> findByEmployeeByDate(@Param("name") String name, @Param("user_date") Date user_date);
}