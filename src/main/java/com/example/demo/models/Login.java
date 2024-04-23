package com.example.demo.models;

public class Login {
    private  String user1;
    private int password1;
    private  String user2;
    private int paswword2;

    public Login(String user1, int password1, String user2, int paswword2) {
        this.user1 = user1;
        this.password1 = password1;
        this.user2 = user2;
        this.paswword2 = paswword2;
    }
    public void setUser1(String user1) {
        this.user1 = user1;
    }

    public void setPassword1(int password1) {
        this.password1 = password1;
    }

    public void setUser2(String user2) {
        this.user2 = user2;
    }

    public void setPaswword2(int paswword2) {
        this.paswword2 = paswword2;
    }

    public String getUser() {return user1;}
    public int getPassword() {return password1;}

    public String getUser1() {return user2;}
    public int getPaswword1() {return paswword2;}
}
