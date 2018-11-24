package org.mashup.manage.controller.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.mashup.manage.domain.member.constant.Team;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class MemberRegisterDto {

    private String name;
    private String email;
    private String password;
    private Team team;

    public static MemberRegisterDto of(String name, String email, String password, Team team) {
        return new MemberRegisterDto(name, email, password, team);
    }
}
