package com.uel.fukiapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uel.fukiapp.R;
import com.uel.fukiapp.model.Product;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.myviewholder> {
    ArrayList<Product> mData;

    public ProductAdapter(ArrayList<Product> dataholder) {
        this.mData = dataholder;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position)
    {
        holder.img.setImageResource(mData.get(position).getImageResource());
        holder.txt1.setText(mData.get(position).getText1());
        holder.txt2.setText(mData.get(position).getText2());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        ImageView img;
        TextView txt1,txt2;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            img=itemView.findViewById(R.id.img1);
            txt1=itemView.findViewById(R.id.t1);
            txt2=itemView.findViewById(R.id.t2);
        }
    }
}
