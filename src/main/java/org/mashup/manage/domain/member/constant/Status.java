package org.mashup.manage.domain.member.constant;

public enum Status {

    ACTIVATED(1, "활동"),
    DEACTIVATED(2, "휴식"),
    EXITED(3, "탈퇴");

    private int code;
    private String description;

    Status(int code, String description) {
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
