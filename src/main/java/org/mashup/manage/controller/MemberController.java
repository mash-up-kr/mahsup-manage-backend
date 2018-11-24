package org.mashup.manage.controller;

import org.mashup.manage.controller.dto.MemberLoginDto;
import org.mashup.manage.controller.dto.MemberRegisterDto;
import org.mashup.manage.controller.dto.MemberResponseDto;
import org.mashup.manage.domain.member.constant.Team;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class MemberController {

    @PostMapping(value = "/login")
    public ResponseEntity<MemberResponseDto> login(@RequestBody MemberLoginDto memberLoginDto) {
        return ResponseEntity.ok(MemberResponseDto.of(memberLoginDto.getEmail(), memberLoginDto.getEmail(), Team.BACKEND));
    }

    @PostMapping(value = "/register/member")
    public ResponseEntity<MemberResponseDto> register(@RequestBody MemberRegisterDto memberRegisterDto) {
        return ResponseEntity.ok(MemberResponseDto.of(memberRegisterDto.getName(), memberRegisterDto.getEmail(), memberRegisterDto.getTeam()));
    }

    public void logout() {

    }
}
