package com.websarva.eings.sndroid.hellosample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //変数にオブジェクト代入
        Button btClick = findViewById(R.id.btClick);
        HelloListener listner = new HelloListener();
        Button btClear = findViewById(R.id.btClear);

        //ボタンにリスナを設定
        btClick.setOnClickListener(listner);
        btClear.setOnClickListener(listner);
    }
    private class HelloListener implements View

            .OnClickListener{
        @Override
        public void onClick(View view) {

            //情報取得
            EditText input = findViewById(R.id.etName);
            TextView output = findViewById(R.id.tvOutput);

            //idによって条件分岐の処理を書く
            int id = view.getId();

            switch (id){
                case R.id.btClick:
                    //文字を表示
                    String inputStr = input.getText().toString();
                    output.setText(inputStr + "さんこんにちは");
                    break;

                case R.id.btClear:
                    //文字を消去
                    input.setText("");
                    output.setText("");
                    break;
            }




        }
    }


}