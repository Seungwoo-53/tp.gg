package com.teamproject.teamproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String deadline;
    private String skil;
    private int frontend;
    private int backend;
    private int design;
    private int fmax;
    private int bmax;
    private int dmax;
    private String description;

}
