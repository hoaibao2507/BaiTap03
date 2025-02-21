package com.example.baitap03;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout bg;
    private ArrayList<Integer> arrayList;
    Random random = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bg = (ConstraintLayout) findViewById(R.id.constraintLayout1);
        Switch switchChange = (Switch) findViewById(R.id.switchChange);

        bg.setBackgroundColor(Color.BLUE);
        bg.setBackgroundResource(R.drawable.top_background2);

        arrayList = new ArrayList<>();
        arrayList.add(R.drawable.top_background);
        arrayList.add(R.drawable.top_background1);
        arrayList.add(R.drawable.top_background2);
        arrayList.add(R.drawable.video_call);

        changeBg();

        switchChange.setOnCheckedChangeListener((buttonView, isChecked) -> changeBg());

    }
    private void changeBg() {
        int vitri = random.nextInt(arrayList.size());
        bg.setBackgroundResource(arrayList.get(vitri));
    }
}