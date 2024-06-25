package com.chobolevel.springbootdeveloper.config.jwt;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TokenProvider {

    private final JwtProperties properties;

}
