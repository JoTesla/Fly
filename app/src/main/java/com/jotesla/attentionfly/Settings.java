package com.jotesla.attentionfly;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class Settings extends Activity {
    //Settings Vars
    protected boolean game_is_running = false;

    static SharedPreferences preferences;
    SharedPreferences.Editor prefEditor;

    public static AppSettings appSettings;

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
        preferences = getSharedPreferences(AppSettings.mainFile,MODE_PRIVATE);
        prefEditor = preferences.edit();
    }
    public void onClickApply(View view){
        Intent intent = new Intent(Settings.this, MainActivity.class);
        startActivity(intent);
    }

    public void appRun() {
        //appSettings.field field = new appSettings.field();
    }

    public static AppSettings loadSettings() {
        AppSettings varAppSettings = new AppSettings();
        varAppSettings.field.cols.size = preferences.getInt(varAppSettings.field.cols.name,3);
        varAppSettings.field.rows.size = preferences.getInt(varAppSettings.field.rows.name,3);
        varAppSettings.options.sws.value = preferences.getBoolean(varAppSettings.options.sws.name, false);

        return varAppSettings;
    }

    public static void applySettings(AppSettings appSettings) {

    }

    public static void saveSettings(AppSettings AppSettings){

    }


}
