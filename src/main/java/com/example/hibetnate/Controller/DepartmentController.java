package com.example.hibetnate.Controller;

import com.example.hibetnate.Service.DepartmentService;
import com.example.hibetnate.model.Department;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService service;

    @GetMapping
    public ResponseEntity<List<Department>> getAllDepartment() {
        List<Department> departments = service.getAllDepartment();
        return new ResponseEntity<>(departments, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Department> createDepartment(@RequestBody Department department) {
        Department dep = service.addDepartment(department);
        return new ResponseEntity<>(dep, HttpStatus.CREATED);
    }
}
