package com.example.tradeactivity.Tradecount;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tradeactivity.R;


import java.util.ArrayList;

public class Tradecountadapter extends RecyclerView.Adapter<Tradecountadapter.ViewHolder> {

    ViewHolder hol;
    private AdapterView.OnItemClickListener mListener = null;
    private ArrayList<Tradecountlistitem> listviewitem;

    Context context;

    public Tradecountadapter(Context context, ArrayList<Tradecountlistitem> listviewitem) {
        this.listviewitem = listviewitem;
        this.context = context;
    }


    // OnItemClickListener 리스너 객체 참조를 어댑터에 전달하는 메서드
    public void setOnItemClickListener(AdapterView.OnItemClickListener mListener) {
        this.mListener = mListener;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.tradecountlist, parent, false);
        return new ViewHolder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        hol = holder;

        int safePosition = holder.getAdapterPosition();



    }


    @Override
    public int getItemCount() {
        return listviewitem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {




        public ViewHolder(@NonNull View itemView) {
            super(itemView);



        }
    }


}