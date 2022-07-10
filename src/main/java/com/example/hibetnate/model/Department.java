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
    private List<Employee> employeeList;

    /**
     * Если такого сотрудника нет то создать его
     * Уточнить так делать можно или логику перенести в Сервис
     *
     * @param employee
     */
    public void addEmployeeDepartment(Employee employee) {
        if (employeeList == null) {
            employeeList = new ArrayList<>();
        }
        employeeList.add(employee);
        employee.setDepartment(this);
    }

    public Department(String departmentName, Long maxSalary, Long minSalary) {
        this.departmentName = departmentName;
        this.maxSalary = maxSalary;
        this.minSalary = minSalary;
    }

    public Department() {
    }
}
