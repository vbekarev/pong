package ru.vbekarev.pong.model;

import java.io.Serializable;

public class PingDto implements Serializable {
    private String message;

    public PingDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
