package com.example.demospringsecurity.security;

public enum ApplicationUserPermission {
    STUDENT_READ("student:read"),
    STUDENT_WRITE("student:write"),
    COURSE_READ("student:read"),
    COURSE_WRITE("student:read");

    private final String permission;
    ApplicationUserPermission(String permission) {
        this.permission=permission;
    }

    public String getPermission() {
        return permission;
    }

}
