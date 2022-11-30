package com.example.baitaptuan4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Random;

public class LishDish extends AppCompatActivity {
    ListView lsvDish;
    ArrayList<Dish> arr;
    DishAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listdish);
        lsvDish = findViewById(R.id.lsvDish);
        lsvDish.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(LishDish.this,ChiTiet.class));
            }
        });
        arr = new ArrayList<>();

        Random r = new Random();

        arr.add(new Dish(R.drawable.kieu1,10,"Khái Quát Tác Phẩm "));
        arr.add(new Dish(R.drawable.kieu1,r.nextInt(10)*5,"Truyện Kiều 1"));
        arr.add(new Dish(R.drawable.kieu2,r.nextInt(10)*5,"Truyện Kiều 2"));
        arr.add(new Dish(R.drawable.kieu3,r.nextInt(10)*5,"Truyện Kiều 3"));
        arr.add(new Dish(R.drawable.kieu4,r.nextInt(10)*5,"Truyện Kiều 4"));
        arr.add(new Dish(R.drawable.kieu5,r.nextInt(10)*5,"Truyện Kiều 5"));
        arr.add(new Dish(R.drawable.kieu6,r.nextInt(10)*5,"Truyện Kiều 6"));
        arr.add(new Dish(R.drawable.kieu7,r.nextInt(10)*5,"Truyện Kiều 7"));
        arr.add(new Dish(R.drawable.kieu8,r.nextInt(10)*5,"Truyện Kiều 8"));
        arr.add(new Dish(R.drawable.kieu9,r.nextInt(10)*5,"Truyện Kiều 9"));


        adapter = new DishAdapter(this,0,arr);
        lsvDish.setAdapter(adapter);
    }
    public void listMusic(View view)
    {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(LishDish.this, Home.class));
            }
        }, 2000);

    }

}