package org.mashup.manage.controller.dto;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.mashup.manage.domain.member.constant.Team;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class MemberResponseDto {

    private String name;
    private String email;
    private Team team;

    public static MemberResponseDto of(String name, String email, Team team) {
        return new MemberResponseDto(name, email, team);
    }
}
