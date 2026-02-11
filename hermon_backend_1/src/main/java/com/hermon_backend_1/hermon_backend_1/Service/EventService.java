package com.hermon_backend_1.hermon_backend_1.Service;
import com.hermon_backend_1.hermon_backend_1.Dto.Request.EventRequestDto;
import com.hermon_backend_1.hermon_backend_1.Entity.EventEntity;
import com.hermon_backend_1.hermon_backend_1.Repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor

public class EventService {

    private final EventRepository eventRepository;

    public EventEntity createEvent(EventRequestDto eventRequestDto){

        return eventRepository.save(
                EventEntity.builder()
                        .title(eventRequestDto.getTitle())
                        .description(eventRequestDto.getDescription())
                        .eventDate(eventRequestDto.getEventDate())
                        .startTime(eventRequestDto.getStartTime())
                        .endTime(eventRequestDto.getEndTime())
                        .location(eventRequestDto.getLocation())
                        .createdAt(LocalDateTime.now())
                        .build()
        );
    }

    public List<EventEntity> getEventsByDate(LocalDate localDate){
        return eventRepository.findByEventDate(localDate);
    }

    public List <EventEntity> getEventsForMonth(
            LocalDate start,
            LocalDate end
    ){
        return eventRepository.findByEventDateBetween(start, end);
    }
}
