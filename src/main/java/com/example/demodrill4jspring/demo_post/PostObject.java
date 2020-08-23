package com.example.demodrill4jspring.demo_post;

public class PostObject {
    private final String login;
    private final String password;

    public PostObject(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
