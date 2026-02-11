package com.hermon_backend_1.hermon_backend_1.Repository;

import com.hermon_backend_1.hermon_backend_1.Entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface EventRepository extends JpaRepository<EventEntity, Long> {

    List<EventEntity> findByEventDate(LocalDate eventDate);

    List <EventEntity> findByEventDateBetween(
      LocalDate start,
      LocalDate end
    );

}
