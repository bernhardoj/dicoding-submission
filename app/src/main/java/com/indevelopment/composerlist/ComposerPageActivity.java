package com.indevelopment.composerlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.indevelopment.composerlist.Model.Composer;

public class ComposerPageActivity extends AppCompatActivity {

    public static String COMPOSER = "COMPOSER";

    Composer mComposer;

    ImageView mComposerImage;
    TextView mComposerName, mComposerDetail, mComposerBorn, mComposerDied;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_composer_page);

        Bundle bundle = getIntent().getExtras();

        mComposerName = findViewById(R.id.composer_item_name);
        mComposerDetail = findViewById(R.id.composer_detail);
        mComposerBorn = findViewById(R.id.composer_born);
        mComposerDied = findViewById(R.id.composer_died);
        mComposerImage = findViewById(R.id.composer_item_img);

        if (bundle != null) {
            mComposer = bundle.getParcelable(COMPOSER);

            if (mComposer != null) {
                mComposerName.setText(mComposer.getName());
                mComposerDetail.setText(mComposer.getDetail());
                mComposerBorn.setText(mComposer.getBorn());
                mComposerDied.setText(mComposer.getDied());
                Glide.with(this)
                        .load(mComposer.getPhoto())
                        .into(mComposerImage);
            }
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
