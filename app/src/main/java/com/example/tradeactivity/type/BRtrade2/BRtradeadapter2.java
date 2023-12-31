package com.example.tradeactivity.type.BRtrade2;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tradeactivity.R;
import com.example.tradeactivity.Util;

import java.util.ArrayList;

public class BRtradeadapter2 extends RecyclerView.Adapter<BRtradeadapter2.ViewHolder> {

    Context context;
    BRtradelistitem2 item2 = null;
    private ArrayList<BRtradelistitem2> listviewitem;

    public BRtradeadapter2(Context context, ArrayList<BRtradelistitem2> listviewitem) {
        this.listviewitem = listviewitem;
        this.context=context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.brtradelayout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        int safePosition = holder.getAdapterPosition();
        BRtradelistitem2 item = listviewitem.get(safePosition);




        holder.newdata.setImageResource(0);

        holder.price2.setText("");


        holder.canceline.setVisibility(View.INVISIBLE);
        holder.daycancel.setVisibility(View.INVISIBLE);
        holder.price4.setVisibility(View.GONE);
        holder.price3.setVisibility(View.GONE);
        holder.price5.setVisibility(View.GONE);




        if (item.getType().equals("매매")){

            holder.price1.setTextColor(Color.parseColor("#FFA1B4DC"));
        }else {

            holder.price1.setTextColor(Color.parseColor("#FFA07A"));
        }


        if (listviewitem.size() - 1 == safePosition) {




        } else {
            //Daydatalistitem item2 = null;
            int a = item.getTrade(); // 현재가격
            int b = 0;

            try {

                item2 = listviewitem.get(safePosition + 1);


                b = item2.getTrade();//바로 이전가격

                Log.e("체크하기","--- > "+item.getYear()+"."+item.getMonth()+"("+item.getTrade()+") 이전거래건수 ->"+item2.getYear()+"."+item2.getMonth()+"("+item2.getTrade()+")");
            }catch (Exception e){

            }




















            if (a > b) {




                    int c = a - b;
                    String v = String.valueOf(c);













            } else if (a < b) {



                    int c = a - b;
                    String v = String.valueOf(c);
                    v = new Util().Priceedit(v);








            } else  {

                int c = a - b;
                String v = String.valueOf(c);
                v = new Util().Priceedit(v);





            }



        }









        holder.dayday.setText(String.valueOf(item.getYear()+"."+item.getMonth()));
        holder.price1.setText(String.valueOf(item.getTrade()));



        if (item.getTrade() == item.getBhightrade() || item.getTrade() == item.getRhightrade()  ) {


            holder.price2.setTextColor(Color.parseColor("#E91E63"));
            holder.price2.setText("[최고]");
        } else if (item.getTrade() == item.getBrowtrade() || item.getTrade() == item.getRrowtrade()) {
                    holder.price2.setTextColor(Color.parseColor("#4169E1"));
                    holder.price2.setText("[최저]");

                }else {
            holder.price2.setText("");


        }






        holder.highper.setText(item.getPer()+"%");


    }


    @Override
    public int getItemCount() {
        return listviewitem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tradeyearmonth,trade;

        TextView dayday,daycancel, price1, price2, highper, updown_price,p_juso;
        ImageView updown, newdata, center;

        View canceline;
        LinearLayout pricelinear1, pricelinear2;
        TextView price3, price4, price5;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);


//            tradeyearmonth =itemView.findViewById(R.id.tradeyearmonth);
//            trade = itemView.findViewById(R.id.trade);


            updown_price = itemView.findViewById(R.id.updown_price);
            dayday = itemView.findViewById(R.id.tradeyearmonth);
            daycancel = itemView.findViewById(R.id.daycancel);
            price1 = itemView.findViewById(R.id.trade);
            price2 = itemView.findViewById(R.id.price2);
            highper = itemView.findViewById(R.id.highper);
            updown = itemView.findViewById(R.id.updown);
            newdata = itemView.findViewById(R.id.newdata);
            center = itemView.findViewById(R.id.center);


            canceline = itemView.findViewById(R.id.cancelline);
            pricelinear1 = itemView.findViewById(R.id.pricelinear1);
            pricelinear2 = itemView.findViewById(R.id.pricelinear2);
            price3 = itemView.findViewById(R.id.price3);
            price4 = itemView.findViewById(R.id.price4);
            price5 = itemView.findViewById(R.id.price5);


        }
    }


}