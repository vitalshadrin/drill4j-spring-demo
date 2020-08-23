package com.example.demodrill4jspring.demo_get;

public class GetObject {
    private final long id;
    private final String content;

    public GetObject(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
