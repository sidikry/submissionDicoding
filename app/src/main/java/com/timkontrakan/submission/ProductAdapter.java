package com.timkontrakan.submission;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {


    private ArrayList<Product> productsList;
    private OnItemClickListener onItemClickListener;

    public interface OnItemClickListener{
        void OnItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView, textView1;

        public ProductViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img_product);
            textView = itemView.findViewById(R.id.name_product);
            textView1 = itemView.findViewById(R.id.details);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (listener !=null){
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION){
                            listener.OnItemClick(position);
                        }
                    }
                }
            });
        }
    }

    public ProductAdapter(ArrayList<Product> productsList) {
        this.productsList = productsList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main_page, parent, false);
        return new ProductViewHolder(view, onItemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull final ProductViewHolder holder, int position) {
        Product product = productsList.get(position);

        Glide.with(holder.itemView.getContext())
                .load(product.getPhoto())
                .apply(new RequestOptions().override(150,150))
                .into(holder.imageView);
        holder.textView.setText(product.getName());
        holder.textView1.setText(product.getDetail());
    }


    @Override
    public int getItemCount() {
        return productsList.size();
    }


}
