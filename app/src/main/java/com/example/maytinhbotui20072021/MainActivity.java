package com.example.maytinhbotui20072021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        int a = 5;
//        int b = 10;
//        int result = a + b;
//        //Kiểm tra giá trị truyền vào
//        //Ctrl + p: xem tham số truyền vào
//        Log.d("BBB",String.valueOf(result));

//        // Math
        //Làm tròn 0.5
//        int value = Math.round(5.5f);
//        Log.d("BBB", "Làm tròn 0.5 =" + value);

        //Làm tròn lên
//        double value1 = Math.ceil(1.00001);
//        double value2 = Math.floor(1.9999);
//        Log.d("BBB","Làm tròn lên " + value2);

//        //Random
//        double value3 = Math.random()*5;
//        Log.d("BBB","Random " + value3);

        // Trị tuyệt đối
        int value4 = Math.abs(-5);
        Log.d("BBB", "Trị tuyệt đối " + value4);
    }
}