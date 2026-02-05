package com.hermon_backend_1.hermon_backend_1.controller;

import com.hermon_backend_1.hermon_backend_1.Dto.Request.DonationRequestDto;
import com.hermon_backend_1.hermon_backend_1.Dto.Response.DonationResponseDto;
import com.hermon_backend_1.hermon_backend_1.Entity.DonationEntity;
import com.hermon_backend_1.hermon_backend_1.Service.DonationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/donations")
@RequiredArgsConstructor
@CrossOrigin(origins =  "http://localhost:5173/")
public class DonationController {

    private final DonationService donationService;

    @PostMapping
    public DonationResponseDto createDonation(@RequestBody DonationRequestDto donationRequestDto){
        log.info("Post Api for donation called");
        log.info("incoming Donation:{}",donationRequestDto);
       return donationService.addDonation(donationRequestDto);
    }

    @GetMapping
    public List<DonationEntity> getDonations(){
        log.info("get/api/donation called");
        List<DonationEntity> donationEntities = donationService.getAllDonations();
        log.info("returning donations:{}", donationEntities.size());
        return donationEntities;
    }

}
