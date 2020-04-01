package com.jotesla.attentionfly;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GameField extends Activity {
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
        Intent intent = new Intent(GameField.this, settings.class);
        startActivity(intent);
    }
}
