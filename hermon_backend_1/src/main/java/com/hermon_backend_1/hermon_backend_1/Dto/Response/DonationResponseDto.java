package com.hermon_backend_1.hermon_backend_1.Dto.Response;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Builder
public class DonationResponseDto {
    private Long id;
    private Long member_id;
    private String name;
    private String phone;
    private BigDecimal amount;
    private String type;
    private LocalDateTime donationDate;
}
