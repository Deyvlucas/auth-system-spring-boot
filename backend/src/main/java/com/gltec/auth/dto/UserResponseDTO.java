package com.gltec.auth.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserResponseDTO {

    private final Long id;
    private final String name;
    private final String email;
}
