package org.mashup.manage.domain.member.constant;

public enum Role {

    MEMBER(1, "동아리원"),
    TEAM_LEADER(2, "팀장"),
    VICE_TEAM_LEADER(3, "부팀장"),
    GENERAL_AFFAIRS(4, "총무"),
    CHIEF(6, "단장"),
    VICE_CHIEF(5, "부단장");

    private int code;
    private String description;

    Role(int code, String description) {
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
