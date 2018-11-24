package org.mashup.manage;

import org.mashup.manage.domain.notice.NoticeCard;
import org.mashup.manage.domain.notice.constant.NoticeType;
import org.mashup.manage.domain.notice.value.Address;
import org.mashup.manage.repository.NoticeCardDummy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class ManageApplication {

    public static void main(String[] args) {
        NoticeCardDummy.POOL.put(1L, NoticeCard.of(1L,
                "매쉬업 해커톤",
                "안녕하세요 여러분 여러분들이 애타게 기다리시던 해커톤이 이제 3일 앞으로 다가왔습니다",
                NoticeType.PUBLIC,
                LocalDateTime.now(),
                Address.of(37.505002, 126.883793, "서울특별시 구로구 경인로 610 10층"),
                LocalDateTime.now()));

        SpringApplication.run(ManageApplication.class, args);
    }
}
