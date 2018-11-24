package org.mashup.manage.domain.member.constant;

public enum Team {

    BACKEND(1, "서버"),
    ANDROID(2, "안드로이드"),
    IOS(3, "아이오에스"),
    DESGIGN(4, "디자인");

    private int code;
    private String description;

    Team(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }
}