package com.example.telegramapp;

import android.graphics.drawable.Drawable;

public class ChatModel {
    Drawable avatar;
    String chatName, lastMassage, uGMT, userTime;
    boolean isRead;



    public ChatModel(Drawable avatar, String chatName, String lastMassage, boolean isRead, String uGMT,String userTime ) {
        this.avatar = avatar;
        this.chatName = chatName;
        this.lastMassage = lastMassage;
        this.isRead = isRead;
        this.uGMT = uGMT;
        this.userTime = userTime;
    }
}
