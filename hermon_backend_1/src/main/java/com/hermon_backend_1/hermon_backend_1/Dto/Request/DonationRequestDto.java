package com.hermon_backend_1.hermon_backend_1.Dto.Request;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter

public class DonationRequestDto {

    private Long member_id;
    private BigDecimal amount;
    private  String type;
}
