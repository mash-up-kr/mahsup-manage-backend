package org.mashup.manage.domain.notice.constant;

public enum NoticeType {

    PUBLIC(1, "전체"),
    TEAM_STUDY(2, "팀 스터디"),
    PROJECT(3, "프로젝트");

    private int code;
    private String description;

    NoticeType(int code, String description) {
        this.code = code;
        this.description = description;
    }

    private int getCode() {
        return this.code;
    }

    public String getDescription() {
        return description;
    }
}
