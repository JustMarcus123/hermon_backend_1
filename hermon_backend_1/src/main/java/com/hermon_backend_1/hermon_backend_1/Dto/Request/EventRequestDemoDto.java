package com.hermon_backend_1.hermon_backend_1.Dto.Request;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class EventRequestDemoDto {
    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private String location;
}
