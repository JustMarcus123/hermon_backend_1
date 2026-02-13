package com.hermon_backend_1.hermon_backend_1.Repository;

import com.hermon_backend_1.hermon_backend_1.Entity.EventEntityDemo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EventRepositoryDemo extends JpaRepository<EventEntityDemo, Long> {

//    List <EventEntityDemo> findEventsByDate(
//            LocalDate date
//    );
    // this will run a sql query SELECT * FROM eventsDemo where eventsStartDate =? AND eventEndDate =?
    // it will find the events base on the date passed in the frontend

   List<EventEntityDemo> findByStartDateLessThanEqualAndEndDateGreaterThanEqual (
            LocalDate endDate,
            LocalDate startDate
    );
   // this will generate SELECT * FROM eventsDemo WhERE startDate<= ? AND endDate>=?
}
