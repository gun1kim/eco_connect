package com.kosta268.eco_connect.dto.member;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class TokenReissueDto {
    private String accessToken;
    private String refreshToken;
}
