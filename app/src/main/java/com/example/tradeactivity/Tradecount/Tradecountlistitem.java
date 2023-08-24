package com.example.tradeactivity.Tradecount;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Created by taewoo on 2019-11-16.
 */

public class Tradecountlistitem {


    public int getTradecount() {
        return tradecount;
    }

    public void setTradecount(int tradecount) {
        this.tradecount = tradecount;
    }

    @SerializedName("tradecount")
    @Expose
    public
    int tradecount;


}