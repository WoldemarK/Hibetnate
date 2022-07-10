package com.example.hibetnate.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "details")
public class Detail {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToOne(mappedBy = "empDetail", cascade = CascadeType.ALL)
    private Employee employee;

    public Detail(String city, String email, String phoneNumber, Employee employee) {
        this.city = city;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.employee = employee;
    }

    public Detail() {
    }
}
