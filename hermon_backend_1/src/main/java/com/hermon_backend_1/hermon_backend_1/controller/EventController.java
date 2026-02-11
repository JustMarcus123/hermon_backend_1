package com.hermon_backend_1.hermon_backend_1.controller;

import com.hermon_backend_1.hermon_backend_1.Dto.Request.EventRequestDto;
import com.hermon_backend_1.hermon_backend_1.Entity.EventEntity;
import com.hermon_backend_1.hermon_backend_1.Service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/events")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")

public class EventController {

private final EventService eventService;

@PostMapping
    public EventEntity createEvent(
        @RequestBody EventRequestDto eventRequestDto
        ){
    return eventService.createEvent(eventRequestDto);
}

@GetMapping("/date/{date}")
    public List <EventEntity> getEventByDate(
            @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
            LocalDate date
){
    return eventService.getEventsByDate(date);
}

@GetMapping("/range")
    public List<EventEntity> getEventsForRange(
            @RequestParam LocalDate start,
            @RequestParam LocalDate end
){
    return eventService.getEventsForMonth(start,end);
}

}
