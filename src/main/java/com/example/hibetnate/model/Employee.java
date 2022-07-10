package com.example.hibetnate.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "salary")
    private Long salary;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "details_id")
    private Detail empDetail;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    private Department department;

    public Employee(String name, String surname, Long salary, Detail empDetail, Department department) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.empDetail = empDetail;
        this.department = department;
    }

    public Employee() {
    }
}
