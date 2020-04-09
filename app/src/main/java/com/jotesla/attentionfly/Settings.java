package com.jotesla.attentionfly;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
//import android.view.WindowManager;
import android.widget.RadioButton;
import android.widget.Switch;

public class Settings extends Activity {
    //Settings Vars
    private boolean game_is_running = false;
    //private Switch start_w_settings;
    private RadioButton radio3x3;
    private RadioButton radio4x4;
    private SharedPreferences pref;
    private SharedPreferences.Editor prefEditor;


    public void gameStart(){
        game_is_running = true;
    }

    public void gameStop(){
        game_is_running = false;
    }

    public boolean isGameRunning(){
        return game_is_running;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
    }

    @Override
    protected void onStart() {
        super.onStart();
        //start_w_settings = findViewById(R.id.start_w_saved);
        radio3x3 =  findViewById(R.id.radioButton);
        radio4x4 =  findViewById(R.id.radioButton2);

        pref = getSharedPreferences("Global",MODE_PRIVATE);
        int i = pref.getInt("field_size",3);
        switch (i){
            case 3: radio3x3.setChecked(true); break;
            case 4: radio4x4.setChecked(true); break;
        }
        //start_w_settings.setChecked(pref.getBoolean("start_w_settings",false));
    }

    public void onClickApply(View view){

        //start_w_settings = findViewById(R.id.start_w_saved);
        radio3x3 =  findViewById(R.id.radioButton);
        radio4x4 =  findViewById(R.id.radioButton2);
        pref = getSharedPreferences("Global",MODE_PRIVATE);
        prefEditor = pref.edit();
        int i = 3;
        if (radio3x3.isChecked()){i=3;}
        if (radio4x4.isChecked()){i=4;}
        prefEditor.putInt("field_size",i);
        //prefEditor.putBoolean("start_w_settings",start_w_settings.isChecked());
        prefEditor.apply();
        //Intent intent = new Intent(Settings.this, MainActivity.class);
        //startActivity(intent);
        finish();
    }

}
