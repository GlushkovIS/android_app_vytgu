package com.e.getanewcolor;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.e.colordiagram.ColorDiagram;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //определяем объект класса рендом
    Random rand = new Random();
    ColorDiagram randomColor = new ColorDiagram();
    private ConstraintLayout mainLayout;
    private Button button1;
    private Button button2;
    private Button button3;
    private int color1, color2, color3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainLayout = findViewById(R.id.mainLayout);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        generateColor();
    }

    //заполняет кнопки цветами
    public void generateColor() {
        color1 = randomColor.getColor();
        color2 = randomColor.getColor();
        color3 = randomColor.getColor();
        button1.setBackgroundColor(color1);
        button2.setBackgroundColor(color2);
        button3.setBackgroundColor(color3);
    }



    public void on1ButtonClick(View v) {
        mainLayout.setBackgroundColor(color1);
    }

    public void on2ButtonClick(View v) {
        mainLayout.setBackgroundColor(color2);
    }

    public void on3ButtonClick(View v) {
        mainLayout.setBackgroundColor(color3);
    }

    public void on4ButtonClick(View v) {
        generateColor();
    }

}


