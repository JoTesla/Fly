package com.jotesla.attentionfly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickGo(View view){
        //SharedPreferences pref;
        //pref = getSharedPreferences("Global",MODE_PRIVATE);
       // boolean sws = pref.getBoolean("start_w_settings", false);//start_w_settings.isChecked();
        Intent intent;
        int gameEndCode = 0;
       // if (sws) {
            intent = new Intent(MainActivity.this, GameField.class);
            /*
            intent.putExtra("start_w_settings",pref.getBoolean("start_w_settings", false));
            intent.putExtra("field_size",pref.getInt("field_size",3));*/
       // }
       // else {intent = new Intent(MainActivity.this, Settings.class);}
        startActivityForResult(intent, gameEndCode);
    }

}
