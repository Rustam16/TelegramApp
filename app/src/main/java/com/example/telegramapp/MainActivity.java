package com.example.telegramapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvList;
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvList = findViewById(R.id.rv_list);
        List<ChatModel> list = new ArrayList<>();
        list.add(new ChatModel(getResources().getDrawable(R.drawable.avatar),"Ayn","hello",true," +5","22:43" ));
        list.add(new ChatModel(getResources().getDrawable(R.drawable.avatar),"Ainazar","how are you?",true,"+8","6:24" ));
        list.add(new ChatModel(getResources().getDrawable(R.drawable.avatar),"Aktan","Are you okay?",true ,"+4","2:00"));
        list.add(new ChatModel(getResources().getDrawable(R.drawable.avatar),"Bolot","nice",true,"+3","15:22" ));
        list.add(new ChatModel(getResources().getDrawable(R.drawable.avatar),"Sway Lee","hi",true ,"8+","15:22"));
        list.add(new ChatModel(getResources().getDrawable(R.drawable.avatar),"Azamat","lol",true ,"6+","15:22" ));
        list.add(new ChatModel(getResources().getDrawable(R.drawable.avatar),"Mrcolap","hello",true,"3+","15:22" ));

        rvList.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerAdapter(this, list);
        rvList.setAdapter(adapter);



    }
}