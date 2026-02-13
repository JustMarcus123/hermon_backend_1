package com.hermon_backend_1.hermon_backend_1.controller;

import com.hermon_backend_1.hermon_backend_1.Dto.Request.EventRequestDemoDto;
import com.hermon_backend_1.hermon_backend_1.Entity.EventEntityDemo;
import com.hermon_backend_1.hermon_backend_1.Service.EventServiceDemo;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/eventsdemo")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173/")
public class EventControllerDemo {

    private final EventServiceDemo eventServiceDemo;

    @PostMapping
    public EventEntityDemo createEventDemo(@RequestBody EventRequestDemoDto eventRequestDemoDto){
        return eventServiceDemo.createEventDemo(eventRequestDemoDto);
    }

//    @GetMapping("/date/{date}")
//    public List <EventEntityDemo> getEventByDate(@PathVariable
//                                                     @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
//                                                  LocalDate date){
//        return eventServiceDemo.findEventsByDate(date);
//    }
//


    @GetMapping("/range")
    public  List<EventEntityDemo> getEvents(
            @RequestParam
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
            LocalDate startDate,

            @RequestParam
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
            LocalDate endDate
    ){
        return eventServiceDemo.findByStartDateLessThanEqualAndEndDateGreaterThanEqual(startDate, endDate);
    }

}
