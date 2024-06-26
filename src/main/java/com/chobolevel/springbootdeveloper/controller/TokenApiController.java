package com.chobolevel.springbootdeveloper.controller;

import com.chobolevel.springbootdeveloper.dto.AccessTokenResponseDto;
import com.chobolevel.springbootdeveloper.dto.CreateAccessTokenRequestDto;
import com.chobolevel.springbootdeveloper.service.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class TokenApiController {

    private final TokenService tokenService;

    @PostMapping("token")
    public ResponseEntity<AccessTokenResponseDto> createNewAccessToken(@RequestBody CreateAccessTokenRequestDto request) {
        String result = tokenService.createNewAccessToken(request.getRefreshToken());
        return ResponseEntity.ok(new AccessTokenResponseDto(result));
    }

}
