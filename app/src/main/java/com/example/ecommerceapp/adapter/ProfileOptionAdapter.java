package com.example.ecommerceapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerceapp.R;
import com.example.ecommerceapp.modal.OptionName;

import org.w3c.dom.Text;

import java.util.List;

public class ProfileOptionAdapter extends RecyclerView.Adapter<ProfileOptionAdapter.OptionHolder> {
    private List<OptionName> mylist;
    private ClickListener cListener;
    public ProfileOptionAdapter(List<OptionName> mylist) {
        this.mylist = mylist;
    }

    @NonNull
    @Override
    public OptionHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.profile_option_list,parent,false);
        return new OptionHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OptionHolder holder, int position) {
    OptionName op=mylist.get(position);
    String title=op.getOptionName();
    int image=op.getOptionIcon();
    holder.optionIcon.setImageResource(image);
    holder.optionTitle.setText(title);
    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            cListener.click(v,position);
        }
    });
    }
    public void myClickListener(ClickListener clickListener)
    {
        this.cListener=clickListener;
    }
    public interface ClickListener{
        void click(View view,int position);
    }
    @Override
    public int getItemCount() {
        return mylist.size();
    }


    public class OptionHolder extends RecyclerView.ViewHolder{
        private ImageView optionIcon;
        private TextView optionTitle;
        public OptionHolder(@NonNull View itemView) {
            super(itemView);
            optionIcon=itemView.findViewById(R.id.option_icon);
            optionTitle=itemView.findViewById(R.id.option_title);
        }
    }
}
