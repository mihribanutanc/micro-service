package com.example.accountservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@ToString
@Table(name = "accounts")
@Entity
public class Account implements Serializable {

    @Id
    private String id = UUID.randomUUID().toString();

    @Setter
    @Column(name = "uname")
    private String username;

    @Setter
    @Column(name = "name")
    private String name;

    @Setter
    @Column(name = "surname")
    private String surname;

    @Setter
    @Column(name = "email")
    private String email;

    @Setter
    @Column(name = "birth_date")
    private Date birthDate;

    @Setter
    @Column(name = "pwd")
    private String password;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "is_active")
    private Boolean active;

}
