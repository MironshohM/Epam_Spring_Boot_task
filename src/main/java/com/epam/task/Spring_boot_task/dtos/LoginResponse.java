package com.epam.task.Spring_boot_task.dtos;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class LoginResponse {
    private String token;

    public LoginResponse(String token) {
        this.token = token;
    }

}