package com.prasad.webapp_jpa.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Users {

    @Id
    private String id;
    private String username;
    private String email;
    private String message;

    public Users() {
    }

    public Users(String username, String email, String message) {
        this.username = username;
        this.email = email;
        this.message = message;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    public String getmessage() {
        return message;
    }

    public void setmessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", message=" + message +
                '}';
    }
}