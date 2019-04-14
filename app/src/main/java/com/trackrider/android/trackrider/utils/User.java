package com.trackrider.android.trackrider.utils;

import java.util.HashMap;
import java.util.List;

public class User {
    private String uid;
    private String email_id;
    private List<String> friends;
    private HashMap<String, User> acceptList;  //List user friends
    private int room_member;
    private int room_owner;


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
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

    public HashMap<String, User> getAcceptList() {
        return acceptList;
    }

    public void setAcceptList(HashMap<String, User> acceptList) {
        this.acceptList = acceptList;
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


    public User(){

    }

    public User(String uid, String email_id) {
        this.uid = uid;
        this.email_id = email_id;
        acceptList = new HashMap<>();
    }

}
