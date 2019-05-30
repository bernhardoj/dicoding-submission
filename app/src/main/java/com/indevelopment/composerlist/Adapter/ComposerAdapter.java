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

import java.io.InputStream;
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
            
        }
    }

    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public DownloadImageTask(ImageView bmImage) {
            this.bmImage = bmImage;
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {
            bmImage.setImageBitmap(result);
        }
    }
}
