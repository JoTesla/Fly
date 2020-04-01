package com.jotesla.attentionfly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //поместить загрузку настроек при запуске
    }
    public void onClickGo(View view){
        Switch start_w_settings = (Switch) findViewById(R.id.start_w_saved);
        boolean e = start_w_settings.isChecked();
        Intent intent;
        if (e) {
            intent = new Intent(MainActivity.this, GameField.class);
        }
        else
        {
            intent = new Intent(MainActivity.this, settings.class);
        }

        startActivity(intent);
    }
}
