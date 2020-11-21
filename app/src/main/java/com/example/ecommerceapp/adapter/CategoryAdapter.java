package com.example.ecommerceapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerceapp.R;

public class CategoryAdapter  extends RecyclerView.Adapter<CategoryAdapter.MyHolder> {
    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.category_layout,parent,false);
        return new MyHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class MyHolder extends RecyclerView.ViewHolder{
        private ImageView categoryImage;
        private TextView categoryTitle;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            categoryImage=itemView.findViewById(R.id.category_image);
            categoryTitle=itemView.findViewById(R.id.category_title);


        }
    }
}
