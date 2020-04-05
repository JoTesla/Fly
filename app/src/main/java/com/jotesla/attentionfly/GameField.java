package com.jotesla.attentionfly;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class GameField extends Activity {
    private static SharedPreferences pref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_field);
    }

    public void onClickStop(View view){
        Intent intent = new Intent(GameField.this, MainActivity.class);
        startActivity(intent);
    }

    public void onClickSettings(View view){
        Intent intent = new Intent(GameField.this, Settings.class);
        pref = getSharedPreferences("Global",MODE_PRIVATE);
        boolean sws = pref.getBoolean("start_w_settings", false);
        intent.putExtra("start_w_settings",pref.getBoolean("start_w_settings", false));
        intent.putExtra("field_size",pref.getInt("field_size",3));

        startActivity(intent);
    }
}
