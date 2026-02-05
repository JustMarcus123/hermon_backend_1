package com.hermon_backend_1.hermon_backend_1.Service;

import com.hermon_backend_1.hermon_backend_1.Dto.Request.DonationRequestDto;
import com.hermon_backend_1.hermon_backend_1.Dto.Response.DonationResponseDto;
import com.hermon_backend_1.hermon_backend_1.Entity.DonationEntity;
import com.hermon_backend_1.hermon_backend_1.Entity.MemberEntity;
import com.hermon_backend_1.hermon_backend_1.Repository.DonationRepository;
import com.hermon_backend_1.hermon_backend_1.Repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DonationService {

    private final DonationRepository donationRepository;
    private final MemberRepository memberRepository;

    //for adding new donations
    public DonationResponseDto addDonation(DonationRequestDto donationRequestDto){
        MemberEntity memberEntity = memberRepository.findById(donationRequestDto.getMember_id())
                        .orElseThrow(()-> new RuntimeException("member not found"));
        DonationEntity donationEntity = DonationEntity.builder()
                .memberEntity(memberEntity)
                .amount(donationRequestDto.getAmount())
                .type(donationRequestDto.getType())
                .donationDate(LocalDateTime.now())
                .build();
        DonationEntity saved = donationRepository.save(donationEntity);

        return DonationResponseDto.builder()
                .id(saved.getId())
                .member_id(memberEntity.getId())
                .name(memberEntity.getName())
                .phone(memberEntity.getPhone())
                .amount(saved.getAmount())
                .type(saved.getType())
                .donationDate(saved.getDonationDate())
                .build();
    }

    // to list out all the donations
    public List<DonationEntity> getAllDonations (){
        return donationRepository.findAll();
    }

}
