package com.example.aloha;

        import androidx.appcompat.app.AppCompatActivity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT = "com.example.profile.EXTRA_TEXT";
    public static final String EXTRA_NUMBER = "com.example.profile.EXTRA_NUMBER";
    public static final String EXTRA_TEXT_TWO = "com.example.profile.EXTRA_TEXT_TWO";
    public static final String EXTRA_TEXT_THREE = "com.example.profile.EXTRA_TEXT_THREE";
   // public static final String EXTRA_MY_IMAGE_DESC      = "com.example.profile.EXTRA_MY_IMAGE_DESC";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();

            }
        });
    }
    public void openActivity2(){

        EditText editText1 = findViewById(R.id.editText1);
        String text1 = editText1.getText().toString();

        EditText editText2 = findViewById(R.id.editText2);
        int number = Integer.parseInt(editText2.getText().toString());

        EditText editText3 = findViewById(R.id.editText3);
        String text3 = editText3.getText().toString();

        EditText editText4 = findViewById(R.id.editText4);
        String text4 = editText4.getText().toString();

       // ImageView imageView = (ImageView)findViewById(R.id.imageView);
       // String image = imageView.getImage(src="@drawable/my_image")


        Intent intent = new Intent(this,Activity2.class);

        intent.putExtra(EXTRA_TEXT,text1);
        intent.putExtra(EXTRA_NUMBER,number);
        intent.putExtra(EXTRA_TEXT_TWO,text3);
        intent.putExtra(EXTRA_TEXT_THREE,text4);
       // intent.putExtra(EXTRA__MY_IMAGE_DESC);

        startActivity(intent);
    }
}




