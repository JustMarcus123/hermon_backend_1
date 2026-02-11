package com.hermon_backend_1.hermon_backend_1.Dto.Request;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class EventRequestDto {

    private String title;
    private String description;
    private LocalDate eventDate;
    private LocalTime startTime;
    private LocalTime endTime;
    private String location;

}
