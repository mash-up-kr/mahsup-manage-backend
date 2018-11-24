package org.mashup.manage.controller.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class MemberLoginDto {

    private String email;
    private String password;

    public static MemberLoginDto of(String email, String password) {
        return new MemberLoginDto(email, password);
    }
}
