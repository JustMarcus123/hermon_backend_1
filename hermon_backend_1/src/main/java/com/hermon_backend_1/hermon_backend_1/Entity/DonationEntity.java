package com.hermon_backend_1.hermon_backend_1.Entity;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "donations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DonationEntity {

@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "member_id", nullable = false)
private MemberEntity memberEntity;

@Column(nullable = false, precision = 10, scale = 2)
private BigDecimal amount;

@Column(nullable = false)
private String type; // for example tithe, offering, donations, etc

    private LocalDateTime donationDate;
}
