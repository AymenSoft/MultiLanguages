package com.aymensoft.multilanguages;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnar, btnfr, btnopen;

    //SharedPreferences
    SharedPreferences sharedpreferences;
    public static final String SettingsPreferences = "SettingsPreferences";
    public static final String LanguagePreferences = "LanguagePreferences";
    String Language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //1-read and apply language settings
        sharedpreferences = getSharedPreferences(SettingsPreferences, MODE_PRIVATE);
        Language=sharedpreferences.getString(LanguagePreferences,"fr");
        AppLanguage.setLocale(MainActivity.this,Language);

        setContentView(R.layout.activity_main);

        btnar=(Button)findViewById(R.id.btn_lang_ar);
        btnfr=(Button)findViewById(R.id.btn_lang_fr);
        btnopen=(Button)findViewById(R.id.btn_open);

        btnar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppLanguage.setLocale(MainActivity.this,"ar");
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(LanguagePreferences,"ar");
                editor.apply();
                recreate();
            }
        });

        btnfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppLanguage.setLocale(MainActivity.this,"fr");
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString(LanguagePreferences,"fr");
                editor.apply();
                recreate();
            }
        });

        btnopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });

    }
}
