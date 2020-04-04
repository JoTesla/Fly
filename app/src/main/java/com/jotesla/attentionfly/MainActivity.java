package com.jotesla.attentionfly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Switch start_w_settings = (Switch) findViewById(R.id.start_w_saved);
    AppSettings appSettings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //поместить загрузку настроек при запуске
        appSettings = Settings.loadSettings();
        start_w_settings.setChecked(appSettings.options.sws.value);
    }
    public void onClickGo(View view){


        boolean e = start_w_settings.isChecked();
        Intent intent;
        if (e) {
            intent = new Intent(MainActivity.this, GameField.class);
        }
        else
        {
            intent = new Intent(MainActivity.this, Settings.class);
        }

        startActivity(intent);
    }
}
