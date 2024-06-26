package com.chobolevel.springbootdeveloper.service;

import com.chobolevel.springbootdeveloper.config.jwt.TokenProvider;
import com.chobolevel.springbootdeveloper.domain.User;
import com.chobolevel.springbootdeveloper.repository.RefreshTokenRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Duration;

@Service
@Transactional
@RequiredArgsConstructor
public class TokenService {

    private final TokenProvider tokenProvider;
    private final RefreshTokenService refreshTokenService;
    private final UserService userService;

    // 토큰 재발급 메서드
    public String createNewAccessToken(String refreshToken) {
        // 토큰 유효성 검증에 실패한 경우 예외 발생
        if (!tokenProvider.validToken(refreshToken)) {
            throw new IllegalArgumentException("Unexpected token");
        }
        Long userId = refreshTokenService.findByRefreshToken(refreshToken).getUserId();
        User user = userService.findById(userId);

        return tokenProvider.generateToken(user, Duration.ofHours(2));
    }

}
