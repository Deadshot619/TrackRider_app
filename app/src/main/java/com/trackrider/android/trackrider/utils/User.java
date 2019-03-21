package com.trackrider.android.trackrider.utils;

import java.util.List;

public class User {
    private String email_id;
    private List<String> friends;
    private int room_member;
    private int room_owner;


    public User(){}

    public User(String email_id, List<String> friends, int room_member, int room_owner) {
        this.email_id = email_id;
        this.friends = friends;
        this.room_member = room_member;
        this.room_owner = room_owner;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public int getRoom_member() {
        return room_member;
    }

    public void setRoom_member(int room_member) {
        this.room_member = room_member;
    }

    public int getRoom_owner() {
        return room_owner;
    }

    public void setRoom_owner(int room_owner) {
        this.room_owner = room_owner;
    }
}
