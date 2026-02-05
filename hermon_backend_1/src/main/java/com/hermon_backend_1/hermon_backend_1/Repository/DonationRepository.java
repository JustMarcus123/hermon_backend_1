package com.hermon_backend_1.hermon_backend_1.Repository;

import com.hermon_backend_1.hermon_backend_1.Entity.DonationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepository extends JpaRepository <DonationEntity, Long> {
}
