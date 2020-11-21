package com.example.ecommerceapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerceapp.R;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductHolder> {
    @NonNull
    @Override
    public ProductHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.product_layout,parent,false);
        return new ProductHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 12;
    }

    public class ProductHolder extends RecyclerView.ViewHolder{
    private ImageView productImage;
    private TextView productName,productPrice;
        public ProductHolder(@NonNull View itemView) {
            super(itemView);
            productImage=itemView.findViewById(R.id.product_image);
            productName=itemView.findViewById(R.id.product_name);
            productPrice=itemView.findViewById(R.id.product_price);
        }
    }
}
