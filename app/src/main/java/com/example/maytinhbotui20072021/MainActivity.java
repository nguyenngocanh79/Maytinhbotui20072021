package com.example.maytinhbotui20072021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText mEditNumber1, mEditNumber2;
    TextView mTvResult;
    Button mBtnPlus, mBtnMinus, mBtnMul, mBtnDiv;

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

//        // Trị tuyệt đối
//        int value4 = Math.abs(-5);
//        Log.d("BBB", "Trị tuyệt đối " + value4);

        //tham trị
    //Ánh xạ các biến vào vùng nhớ của xml
        mEditNumber1 = findViewById(R.id.editTextNumber01);
        mEditNumber2 = findViewById(R.id.editTextNumber02);
        mTvResult = findViewById(R.id.textviewResult);
        mBtnPlus = findViewById(R.id.buttonPlus);
        mBtnMinus = findViewById(R.id.buttonMinus);
        mBtnMul =findViewById(R.id.buttonMul);
        mBtnDiv = findViewById(R.id.buttonDiv);

        // Thông báo
        Toast.makeText(MainActivity.this, "Xin chào", Toast.LENGTH_SHORT).show();

        //Phép cộng
        mBtnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "Click button plus", Toast.LENGTH_SHORT).show();
                String textNumber1 = mEditNumber1.getText().toString();
                String textNumber2 = mEditNumber2.getText().toString();
                //Log.d("BBB","Text number 1 " + textNumber1);
                //Log.d("BBB","Text number 2 " + textNumber2);

                //Kiểm tra giá trị
                if (textNumber1.equals("") || textNumber2.equals("")) {
                    Toast.makeText(MainActivity.this, "Chưa điền đủ dữ liệu", Toast.LENGTH_SHORT).show();
                    mTvResult.setText("Hãy điền đủ giá trị");
                    return; //thay vì viết else
                }
                //Đã có giá trị
                int number1 = Integer.parseInt(textNumber1);
                int number2 = Integer.parseInt(textNumber2);
                int result = number1 + number2;
                mTvResult.setText("Kết quả cộng: " + result);
            }
        });

        //Phép trừ
        mBtnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textNumber1 = mEditNumber1.getText().toString();
                String textNumber2 = mEditNumber2.getText().toString();

                //Kiểm tra giá trị
                if (textNumber1.equals("") || textNumber2.equals("")) {
                    Toast.makeText(MainActivity.this, "Chưa điền đủ dữ liệu", Toast.LENGTH_SHORT).show();
                    mTvResult.setText("Hãy điền đủ giá trị");
                    return;
                }
                //Đã đủ dữ liệu
                int number1 = Integer.parseInt(textNumber1);
                int number2 = Integer.parseInt(textNumber2);
                int result = number1-number2;
                mTvResult.setText("Kết quả trừ: " + result);
            }
        });

        //Phép nhân
        mBtnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textNumber1 = mEditNumber1.getText().toString();
                String textNumber2 = mEditNumber2.getText().toString();

                //Kiểm tra giá trị
                if (textNumber1.equals("") || textNumber2.equals("")) {
                    Toast.makeText(MainActivity.this, "Chưa điền đủ dữ liệu", Toast.LENGTH_SHORT).show();
                    mTvResult.setText("Hãy điền đủ giá trị");
                    return;
                }
                //Đã đủ dữ liệu
                int number1 = Integer.parseInt(textNumber1);
                int number2 = Integer.parseInt(textNumber2);
                int result = number1*number2;
                mTvResult.setText("Kết quả nhân: " + result);
            }
        });

        //Phép chia
        mBtnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textNumber1 = mEditNumber1.getText().toString();
                String textNumber2 = mEditNumber2.getText().toString();

                //Kiểm tra giá trị
                if (textNumber1.equals("") || textNumber2.equals("")) {
                    Toast.makeText(MainActivity.this, "Chưa điền đủ dữ liệu", Toast.LENGTH_SHORT).show();
                    mTvResult.setText("Hãy điền đủ giá trị");
                    return;
                }
                //Kiểm tra mẫu số
                if (textNumber2.equals("0")) {
                    Toast.makeText(MainActivity.this, "Lỗi, Phép chia cho 0", Toast.LENGTH_SHORT).show();
                    mTvResult.setText("Đổi mẫu số");
                    return;
                }
                //Đã đủ và đúng dữ liệu
                double number1 = Double.parseDouble(textNumber1);
                double number2 = Double.parseDouble(textNumber2);
                double result = number1/number2;
                mTvResult.setText("Kết quả chia: " + result);
            }
        });

    }
}