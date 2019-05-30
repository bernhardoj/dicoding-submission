package com.indevelopment.composerlist.Adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.indevelopment.composerlist.ComposerPageActivity;
import com.indevelopment.composerlist.Model.Composer;
import com.indevelopment.composerlist.R;

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
        RelativeLayout mParent;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            mComposerImage = itemView.findViewById(R.id.composerImage);
            mComposerName = itemView.findViewById(R.id.composerName);
            mParent = itemView.findViewById(R.id.item_list);
        }

        void bind(Composer composer) {
            mComposerName.setText(composer.getName());
            Glide.with(itemView)
                    .load(composer.getPhoto())
                    .into(mComposerImage);

            mParent.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), ComposerPageActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }

}
