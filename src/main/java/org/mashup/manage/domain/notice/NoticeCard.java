package org.mashup.manage.domain.notice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.mashup.manage.domain.notice.constant.NoticeType;
import org.mashup.manage.domain.notice.value.Address;

import java.time.LocalDateTime;
import java.util.Objects;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@ToString
public class NoticeCard {

    private Long id;
    private String title;
    private String content;
    private NoticeType type;
    @JsonProperty(value = "meeting_at")
    private LocalDateTime meetingAt;
    private Address location;
    @JsonProperty(value = "noticed_at")
    private LocalDateTime noticedAt;

    public static NoticeCard of(long id, String title, String content, NoticeType type, LocalDateTime meetingAt, Address location, LocalDateTime noticeAt) {
        return new NoticeCard(id, title, content, type, meetingAt, location, noticeAt);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NoticeCard)) return false;
        NoticeCard that = (NoticeCard) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}
