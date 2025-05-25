package com.auth.authentication.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "login")
@Data

public class user {
    @Id
    @Column(name = "Id")
    private String username;

    @Column(name = "password")
    private String password;

}
