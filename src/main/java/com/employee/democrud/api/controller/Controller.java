package com.employee.democrud.api.controller;


import com.employee.democrud.db.entity.Employee;
import com.employee.democrud.db.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class Controller {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("{id}")
    public Employee getEmployeeId(@PathVariable("id") Employee employee){
        return employee;
    }
    @GetMapping
    public List<Employee> getByEmployeeByDate(){
        return employeeRepository.findAll();
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
        employee.setUser_date(LocalDateTime.now());
        Employee updatedEmployee = employeeRepository.save(employee);

        return updatedEmployee;
    }

    @PutMapping("{id}")
    public Employee putEmployee(@RequestBody Employee employee, @PathVariable("id") Integer id){
        Employee updatedEmployee = employeeRepository.save(employee);
        return updatedEmployee;
    }

    @DeleteMapping(value = "/{id}")
    public void deleteEmployee(@PathVariable("id") Employee employee){
        employeeRepository.delete(employee);
    }

    @MessageMapping("/changeClient")
    @SendTo("/topic/activity")
    public Employee change (Employee employee){
        employee.setUser_date(LocalDateTime.now());
        return employeeRepository.save(employee);
    }
}
