package com.example.ecommerceapp.ui.account;

import android.graphics.Region;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerceapp.R;
import com.example.ecommerceapp.adapter.ProfileOptionAdapter;
import com.example.ecommerceapp.modal.OptionName;

import java.util.ArrayList;
import java.util.List;

public class MyAccountFragment extends Fragment {
    private RecyclerView profileOptionList;
    private List<OptionName> optionList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_my_account,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view) {
        profileOptionList=view.findViewById(R.id.profile_option_list);
        addOption(view);
        profileOptionList.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        ProfileOptionAdapter poa=new ProfileOptionAdapter(optionList);
        profileOptionList.setAdapter(poa);
        poa.myClickListener(new ProfileOptionAdapter.ClickListener() {
            @Override
            public void click(View view, int position) {
                OptionName op=optionList.get(position);
                if(op.getOptionName()=="My Orders")
                {
                    Toast.makeText(getActivity(), "My Orders", Toast.LENGTH_SHORT).show();

                }

                else if(op.getOptionName()=="My Cards and Wallet")
                {
                    Toast.makeText(getActivity(), "My Cards and wallet", Toast.LENGTH_SHORT).show();

                }
                else if(op.getOptionName()=="My Reviews")
                {
                    Toast.makeText(getActivity(), "My Reviews", Toast.LENGTH_SHORT).show();

                }
                else if(op.getOptionName()=="My Address")
                {
                    Toast.makeText(getActivity(), "My Address", Toast.LENGTH_SHORT).show();

                }
                else if(op.getOptionName()=="Account setting")
                {
                    Toast.makeText(getActivity(), "My Account setting", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }

    private void addOption(View view) {
        optionList=new ArrayList<>();
        OptionName op1=new OptionName();
        op1.setOptionName("My Orders");
        op1.setOptionIcon(R.drawable.orders_image);
        optionList.add(op1);
        OptionName op2=new OptionName();
        op2.setOptionName("My Cards and Wallet");
        op2.setOptionIcon(R.drawable.orders_image);
        optionList.add(op2);
        OptionName op3=new OptionName();
        op3.setOptionName("My Reviews");
        op3.setOptionIcon(R.drawable.orders_image);
        optionList.add(op3);
        OptionName op4=new OptionName();
        op4.setOptionName("My Address");
        op4.setOptionIcon(R.drawable.orders_image);
        optionList.add(op4);
        OptionName op5=new OptionName();
        op5.setOptionName("Account setting");
        op5.setOptionIcon(R.drawable.orders_image);
        optionList.add(op5);
    }

}
