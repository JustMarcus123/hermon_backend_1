package com.hermon_backend_1.hermon_backend_1.Service;

import com.hermon_backend_1.hermon_backend_1.Dto.Request.EventRequestDemoDto;
import com.hermon_backend_1.hermon_backend_1.Entity.EventEntity;
import com.hermon_backend_1.hermon_backend_1.Entity.EventEntityDemo;
import com.hermon_backend_1.hermon_backend_1.Repository.EventRepositoryDemo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor

public class EventServiceDemo {

    private final EventRepositoryDemo eventRepositoryDemo;


    public EventEntityDemo createEventDemo(EventRequestDemoDto eventRequestDemoDto){
        return eventRepositoryDemo.save(
                EventEntityDemo.builder()
                        .title(eventRequestDemoDto.getTitle())
                        .description(eventRequestDemoDto.getDescription())
                        .startDate(eventRequestDemoDto.getStartDate())
                        .endDate(eventRequestDemoDto.getEndDate())
                        .startTime(eventRequestDemoDto.getStartTime())
                        .endTime(eventRequestDemoDto.getEndTime())
                        .location(eventRequestDemoDto.getLocation())
                        .build()
        );
    }

    //for finding event by each date
//    public List <EventEntityDemo> findEventsByDate(
//            LocalDate date
//    ) {
//        return eventRepositoryDemo.findEventsByDate(date);
//    }

    public List <EventEntityDemo> findByStartDateLessThanEqualAndEndDateGreaterThanEqual(
            LocalDate rangeStart,
            LocalDate rangeEnd
    ){
        return eventRepositoryDemo.findByStartDateLessThanEqualAndEndDateGreaterThanEqual(rangeEnd, rangeStart);
    }

}
