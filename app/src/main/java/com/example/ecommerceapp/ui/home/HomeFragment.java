package com.example.ecommerceapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.ecommerceapp.R;
import com.example.ecommerceapp.adapter.CategoryAdapter;
import com.example.ecommerceapp.adapter.ProductAdapter;

public class HomeFragment extends Fragment {
    private RecyclerView myCategoryList,productList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        initView(view);

        myCategoryList.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        myCategoryList.setAdapter(new CategoryAdapter());
        StaggeredGridLayoutManager st=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        productList.setLayoutManager(st);
        productList.setAdapter(new ProductAdapter());
        super.onViewCreated(view, savedInstanceState);



    }

    private void initView(View view) {
        myCategoryList=view.findViewById(R.id.my_category_list);
        productList=view.findViewById(R.id.product_list);




    }
}

