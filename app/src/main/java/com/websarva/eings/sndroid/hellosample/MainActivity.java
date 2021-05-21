package com.websarva.eings.sndroid.hellosample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //リスナ設定
        Button btClick = findViewById(R.id.btClick);
        HelloListener listner = new HelloListener();

        //ボタンにリスナを設定
        btClick.setOnClickListener(listner);
    }
    private class HelloListener implements View

            .OnClickListener{
        @Override
        public void onClick(View view) {

            
            EditText input = findViewById(R.id.etName);
            TextView output = findViewById(R.id.tvOutput);
            String inputStr = input.getText().toString();
            output.setText(inputStr + "さんこんにちは");

        }
    }


}