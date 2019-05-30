package com.indevelopment.composerlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.indevelopment.composerlist.Model.Composer;

public class ComposerPageActivity extends AppCompatActivity {

    public static String COMPOSER = "COMPOSER";

    private Composer mComposer;

    TextView mComposerName, mComposerDetail, mComposerBorn, mComposerDied;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_composer_page);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null) {
            mComposer = bundle.getParcelable(COMPOSER);


        }
    }
}
