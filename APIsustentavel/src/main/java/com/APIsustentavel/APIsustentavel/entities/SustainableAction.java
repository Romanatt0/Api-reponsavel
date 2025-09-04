package com.APIsustentavel.APIsustentavel.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "sustainable_action")
public class SustainableAction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 55)
    private String title;

    @Column(nullable = false, length = 255)
    private String description;

    @Enumerated(EnumType.STRING)
    private ActionType type;

    @Column(name = "realization_date", nullable = false)
    private LocalDate realizationDate;

    @Column(nullable = false)
    private String responsible;
}
