package com.example.aloha;

import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        int number = intent.getIntExtra(MainActivity.EXTRA_NUMBER,0);
        String text3 = intent.getStringExtra(MainActivity.EXTRA_TEXT_TWO);
        String text4 = intent.getStringExtra(MainActivity.EXTRA_TEXT_THREE);
        TextView textView1 = findViewById(R.id.textVew1);
        TextView textView2 = findViewById(R.id.textVew2);
        TextView textView3 = findViewById(R.id.textView3);
        TextView textView4 = findViewById(R.id.textView4);
       // ImageView imageView = (ImageView)findViewById(R.id.imageView);
        textView1.setText(text);
       // textView2.setText(number);
       // textView2.setText(" " + number);

        String num = ("" + number);
        textView2.setText(num);

        textView3.setText(text3);
        textView4.setText(text4);
       // imageView.setImage(image);
    }
}

