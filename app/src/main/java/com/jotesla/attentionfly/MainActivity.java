package com.jotesla.attentionfly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private static SharedPreferences pref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickGo(View view){
        pref = getSharedPreferences("Global",MODE_PRIVATE);

        boolean sws = pref.getBoolean("start_w_settings", false);//start_w_settings.isChecked();
        Intent intent;
        if (sws) {
            intent = new Intent(MainActivity.this, GameField.class);
            intent.putExtra("start_w_settings",pref.getBoolean("start_w_settings", false));
            intent.putExtra("field_size",pref.getInt("field_size",3));
        }
        else {intent = new Intent(MainActivity.this, Settings.class);}
        startActivity(intent);
    }
/*
    @Override
    protected void onStop() {
        super.onStop();
        start_w_settings = findViewById(R.id.start_w_saved);
        radio3x3 =  findViewById(R.id.radioButton);
        radio4x4 =  findViewById(R.id.radioButton2);
        int i=3;
        if (radio3x3.isChecked()) {i = 3;}
        if (radio4x4.isChecked()) {i = 4;}
        prefEditor = pref.edit();
        prefEditor.putInt("field_size",i);
        prefEditor.putBoolean("start_w_settings",start_w_settings.isChecked());
        prefEditor.apply();
    } */
}
