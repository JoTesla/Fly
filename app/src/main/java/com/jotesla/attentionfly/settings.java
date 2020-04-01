package com.jotesla.attentionfly;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

public class settings extends Activity {
    //Settings Vars
    protected boolean game_is_running;
    SharedPreferences preferences;
    SharedPreferences.Editor prefEditor;

    public static class appSettings{

        public boolean start_w_settings;

        public static class field {
            public final class row {
                public final String name = "field_rows_size";
                public byte size;
            }
            public final class col {
                public final String name = "field_cols_size";
                public byte size;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
    }
    public void onClickApply(View view){
        Intent intent = new Intent(settings.this, MainActivity.class);
        startActivity(intent);
    }

    public void appRun() {
        game_is_running = false;
        appSettings.field field = new appSettings.field();

    }

    public void loadSettings(appSettings AppSettings) {

    }

    public void saveSettings(appSettings AppSettings){

    }

    public void applySettings() {

    }
}
