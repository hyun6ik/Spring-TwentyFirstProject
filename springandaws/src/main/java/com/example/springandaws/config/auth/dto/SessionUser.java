package com.example.springandaws.config.auth.dto;

import com.example.springandaws.domain.user.User;
import lombok.Data;

@Data
public class SessionUser {

    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
