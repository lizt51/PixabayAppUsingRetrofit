package com.example.hyde.pixabayapplicationusingretrofit.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.hyde.pixabayapplicationusingretrofit.R;
import com.example.hyde.pixabayapplicationusingretrofit.activity.Recyc;
import com.example.hyde.pixabayapplicationusingretrofit.models.HitsItem;

import java.util.List;

public class NamaAdapter extends RecyclerView.Adapter<NamaAdapter.MyHolder> {
    private List<com.example.hyde.pixabayapplicationusingretrofit.models.HitsItem> myData;
    private  Recyc activity;


    public NamaAdapter(Recyc mainActivity, List<HitsItem> hits) {
        this.myData=hits;
        this.activity=mainActivity;
    }



    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;
        itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_nama, parent, false);

        return new MyHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {

        holder.like.setText("by "+myData.get(position).user);

        Glide.with(activity).load(myData.get(position).webformatURL)
                .into(holder.imageView);

      //  Glide.with(activ).load(myData.get(position).webformatURL)
      //          .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return myData.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView like;
        ImageView imageView;
        public MyHolder(View itemView) {
            super(itemView);
            like = (TextView)itemView.findViewById(R.id.texs1);
            imageView = (ImageView) itemView.findViewById(R.id.img);
        }
    }
}