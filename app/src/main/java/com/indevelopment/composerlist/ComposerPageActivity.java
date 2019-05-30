package com.indevelopment.composerlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ComposerPageActivity extends AppCompatActivity {

    public static String COMPOSER = "COMPOSER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_composer_page);
    }
}
