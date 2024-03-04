package com.app.certificationconsultation.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    @NotNull
    private String username;

    @Column(name = "loginCode")
    @NotNull
    private String loginCode;

    @Column(name = "document")
    @NotNull
    private String document;


}
