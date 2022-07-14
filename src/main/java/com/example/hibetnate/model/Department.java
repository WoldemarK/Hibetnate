package com.example.hibetnate.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "departments")
public class Department {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "department_name")
    private String departmentName;

    @Column(name = "maxSalary")
    private Long maxSalary;

    @Column(name = "minSalary")
    private Long minSalary;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.DETACH,
            CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "department")
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "department_id")
    private List<Employee> employeeList;

    public Department(String departmentName, Long maxSalary, Long minSalary) {
        this.departmentName = departmentName;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public Department() {
    }
}
