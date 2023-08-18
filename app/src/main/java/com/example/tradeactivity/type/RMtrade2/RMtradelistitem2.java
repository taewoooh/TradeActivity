package com.example.tradeactivity.type.RMtrade2;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Created by taewoo on 2019-11-16.
 */

public class RMtradelistitem2 {

    public RMtradelistitem2(String si, int year, int month, int yearmonth, int trade, String per ,
                            int rhightrade, int rhighyear, int rhighmonth, int rrowtrade, int rrowyear, int rrowmonth,
                            int mhightrade, int mhighyear, int mhighmonth, int mrowtrade, int mrowyear, int mrowmonth,String updatetime,String type) {

        this.si = si;
        this.year = year;
        this.month = month;
        this.yearmonth = yearmonth;
        this.trade = trade;

        this.per = per;

        this.rhightrade = rhightrade;
        this.rhighyear = rhighyear;
        this.rhighmonth = rhighmonth;
        this.rrowtrade = rrowtrade;
        this.rrowyear = rrowyear;
        this.rrowmonth = rrowmonth;

        this.mhightrade = mhightrade;
        this.mhighyear = mhighyear;
        this.mhighmonth = mhighmonth;
        this.mrowtrade = mrowtrade;
        this.mrowyear = mrowyear;
        this.mrowmonth = mrowmonth;


        this.type = type;
        this.updatetime = updatetime;
        this.ym = ym;



    }
    public RMtradelistitem2(String si, int year, int month, int yearmonth, int trade, String per , int hightrade,
                            int highyear, int highmonth, int rowtrade, int rowyear, int rowmonth, String updatetime, String ym) {

        this.si = si;
        this.year = year;
        this.month = month;
        this.yearmonth = yearmonth;
        this.trade = trade;

        this.per = per;

        this.rhightrade = rhightrade;
        this.rhighyear = rhighyear;
        this.rhighmonth = rhighmonth;

        this.rrowtrade = rrowtrade;
        this.rrowyear = rrowyear;
        this.rrowmonth = rrowmonth;
        this.updatetime = updatetime;
        this.ym = ym;



    }


    public String getSi() {
        return si;
    }

    public void setSi(String si) {
        this.si = si;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYearmonth() {
        return yearmonth;
    }

    public void setYearmonth(int yearmonth) {
        this.yearmonth = yearmonth;
    }

    public int getTrade() {
        return trade;
    }

    public void setTrade(int trade) {
        this.trade = trade;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getYm() {
        return ym;
    }

    public void setYm(String ym) {
        this.ym = ym;
    }

    public int getRhightrade() {
        return rhightrade;
    }

    public void setRhightrade(int rhightrade) {
        this.rhightrade = rhightrade;
    }

    public int getRhighyear() {
        return rhighyear;
    }

    public void setRhighyear(int rhighyear) {
        this.rhighyear = rhighyear;
    }

    public int getRhighmonth() {
        return rhighmonth;
    }

    public void setRhighmonth(int rhighmonth) {
        this.rhighmonth = rhighmonth;
    }

    public int getRrowtrade() {
        return rrowtrade;
    }

    public void setRrowtrade(int rrowtrade) {
        this.rrowtrade = rrowtrade;
    }

    public int getRrowyear() {
        return rrowyear;
    }

    public void setRrowyear(int rrowyear) {
        this.rrowyear = rrowyear;
    }

    public int getRrowmonth() {
        return rrowmonth;
    }

    public void setRrowmonth(int rrowmonth) {
        this.rrowmonth = rrowmonth;
    }

    public int getMhightrade() {
        return mhightrade;
    }

    public void setMhightrade(int mhightrade) {
        this.mhightrade = mhightrade;
    }

    public int getMhighyear() {
        return mhighyear;
    }

    public void setMhighyear(int mhighyear) {
        this.mhighyear = mhighyear;
    }

    public int getMhighmonth() {
        return mhighmonth;
    }

    public void setMhighmonth(int mhighmonth) {
        this.mhighmonth = mhighmonth;
    }

    public int getMrowtrade() {
        return mrowtrade;
    }

    public void setMrowtrade(int mrowtrade) {
        this.mrowtrade = mrowtrade;
    }

    public int getMrowyear() {
        return mrowyear;
    }

    public void setMrowyear(int mrowyear) {
        this.mrowyear = mrowyear;
    }

    public int getMrowmonth() {
        return mrowmonth;
    }

    public void setMrowmonth(int mrowmonth) {
        this.mrowmonth = mrowmonth;
    }

    public String getPer() {
        return per;
    }

    public void setPer(String per) {
        this.per = per;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @SerializedName("si")
    @Expose
    public
    String si;


    @SerializedName("year")
    @Expose
    public
    int year;

    @SerializedName("month")
    @Expose
    public
    int month;

    @SerializedName("yearmonth")
    @Expose
    public
    int yearmonth;



    @SerializedName("trade")
    @Expose
    public
    int trade;




    @SerializedName("updatetime")
    @Expose
    public
    String updatetime;




    @SerializedName("ym")
    @Expose
    public
    String ym;



    @SerializedName("rhightrade")
    @Expose
    public
    int rhightrade;

    @SerializedName("rhighyear")
    @Expose
    public
    int rhighyear;

    @SerializedName("rhighmonth")
    @Expose
    public
    int rhighmonth;



    @SerializedName("rrowtrade")
    @Expose
    public
    int rrowtrade;




    @SerializedName("rrowyear")
    @Expose
    public
    int rrowyear;

    @SerializedName("rrowmonth")
    @Expose
    public
    int rrowmonth;








    @SerializedName("mhightrade")
    @Expose
    public
    int mhightrade;

    @SerializedName("mhighyear")
    @Expose
    public
    int mhighyear;

    @SerializedName("mhighmonth")
    @Expose
    public
    int mhighmonth;



    @SerializedName("mrowtrade")
    @Expose
    public
    int mrowtrade;




    @SerializedName("mrowyear")
    @Expose
    public
    int mrowyear;

    @SerializedName("mrowmonth")
    @Expose
    public
    int mrowmonth;

    @SerializedName("per")
    @Expose
    public
    String per;


    @SerializedName("type")
    @Expose
    public
    String type;







}