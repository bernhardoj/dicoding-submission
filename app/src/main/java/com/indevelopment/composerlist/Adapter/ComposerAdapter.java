package com.indevelopment.composerlist.Adapter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.indevelopment.composerlist.Model.Composer;
import com.indevelopment.composerlist.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

public class ComposerAdapter extends RecyclerView.Adapter<ComposerAdapter.ViewHolder> {

    private ArrayList<Composer> mComposers;

    public ComposerAdapter(ArrayList<Composer> composers) {
        mComposers = composers;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.composer_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(mComposers.get(position));
    }

    @Override
    public int getItemCount() {
        return mComposers.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView mComposerImage;
        TextView mComposerName;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            mComposerImage = itemView.findViewById(R.id.composerImage);
            mComposerName = itemView.findViewById(R.id.composerName);
        }

        void bind(Composer composer) {
            mComposerName.setText(composer.getName());
            Picasso.get().load(composer.getPhoto()).into(mComposerImage, new Callback() {
                @Override
                public void onSuccess() {

                }

                @Override
                public void onError(Exception e) {
                    mComposerImage.setImageDrawable(itemView.getResources().getDrawable(R.drawable.not_found));
                }
            });
        }
    }

}
