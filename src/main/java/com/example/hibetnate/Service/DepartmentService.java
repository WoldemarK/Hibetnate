package com.example.hibetnate.Service;

import com.example.hibetnate.Repository.DepartmentRepo;
import com.example.hibetnate.model.Department;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepo departmentRepo;


    public Department addDepartment(Department department) {
        return departmentRepo.save(department);
    }

    public List<Department> getAllDepartment() {
        return departmentRepo.findAll();
    }
}
