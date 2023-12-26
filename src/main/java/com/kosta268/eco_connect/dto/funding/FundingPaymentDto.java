package com.kosta268.eco_connect.dto.funding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kosta268.eco_connect.constant.PaymentStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FundingPaymentDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long paymentId; //결제 번호
    @Column
    private int totalPrice; //총 금액
    @Column
    private LocalDateTime createAt; // 결제 시각
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus; // 결제 상태

}
