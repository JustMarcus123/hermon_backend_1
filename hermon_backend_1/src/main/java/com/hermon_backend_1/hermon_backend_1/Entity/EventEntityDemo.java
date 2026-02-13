package com.hermon_backend_1.hermon_backend_1.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "eventsDemo")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EventEntityDemo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;



    @Column(nullable = false)
    private LocalDate startDate;
    @Column(nullable = false)
    private LocalDate endDate;


    private LocalTime startTime;

    private LocalTime endTime;

    private  String location;

    private LocalDateTime createdAt;
}
