package com.example.hibetnate.Service;

import com.example.hibetnate.Repository.EmployeeRepo;
import com.example.hibetnate.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    public Employee addEmployee(Employee emp) {
        return employeeRepo.save(emp);
    }

    public void deleteById(Long id) {
        employeeRepo.deleteById(id);
    }

    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    public Optional<Employee> getByIdEmp(Long id) {
        return employeeRepo.findById(id);
    }

}

