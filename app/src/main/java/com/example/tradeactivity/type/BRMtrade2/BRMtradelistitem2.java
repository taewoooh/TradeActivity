package com.example.tradeactivity.type.BRMtrade2;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Created by taewoo on 2019-11-16.
 */

public class BRMtradelistitem2 {

    public BRMtradelistitem2(String si, int year, int month, int yearmonth, int trade, String per,
                            int bhightrade, int bhighyear, int bhighmonth, int browtrade, int browyear, int browmonth,
                            int rhightrade, int rhighyear, int rhighmonth, int rrowtrade, int rrowyear, int rrowmonth,
                             int mhightrade, int mhighyear, int mhighmonth, int mrowtrade, int mrowyear, int mrowmonth, String updatetime, String type){
        this.si=si;
        this.year=year;
        this.month=month;
        this.yearmonth=yearmonth;
        this.trade=trade;

        this.per=per;

        this.bhightrade=bhightrade;
        this.bhighyear=bhighyear;
        this.bhighmonth=bhighmonth;
        this.browtrade=browtrade;
        this.browyear=browyear;
        this.browmonth=browmonth;

        this.rhightrade=rhightrade;
        this.rhighyear=rhighyear;
        this.rhighmonth=rhighmonth;
        this.rrowtrade=rrowtrade;
        this.rrowyear=rrowyear;
        this.rrowmonth=rrowmonth;


        this.mhightrade=rhightrade;
        this.mhighyear=rhighyear;
        this.mhighmonth=rhighmonth;
        this.mrowtrade=rrowtrade;
        this.mrowyear=rrowyear;
        this.mrowmonth=rrowmonth;
        this.type=type;
        this.updatetime=updatetime;

        this.ym=ym;


    }
    public BRMtradelistitem2(String si, int year, int month, int yearmonth, int trade, String per , int hightrade,
                             int highyear, int highmonth, int rowtrade, int rowyear, int rowmonth, String updatetime, String ym) {

        this.si = si;
        this.year = year;
        this.month = month;
        this.yearmonth = yearmonth;
        this.trade = trade;

        this.per = per;

        this.bhightrade = hightrade;
        this.bhighyear = highyear;
        this.bhighmonth = highmonth;

        this.browtrade = rowtrade;
        this.browyear = rowyear;
        this.browmonth = rowmonth;
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

    public int getBhightrade() {
        return bhightrade;
    }

    public void setBhightrade(int bhightrade) {
        this.bhightrade = bhightrade;
    }

    public int getBhighyear() {
        return bhighyear;
    }

    public void setBhighyear(int bhighyear) {
        this.bhighyear = bhighyear;
    }

    public int getBhighmonth() {
        return bhighmonth;
    }

    public void setBhighmonth(int bhighmonth) {
        this.bhighmonth = bhighmonth;
    }

    public int getBrowtrade() {
        return browtrade;
    }

    public void setBrowtrade(int browtrade) {
        this.browtrade = browtrade;
    }

    public int getBrowyear() {
        return browyear;
    }

    public void setBrowyear(int browyear) {
        this.browyear = browyear;
    }

    public int getBrowmonth() {
        return browmonth;
    }

    public void setBrowmonth(int browmonth) {
        this.browmonth = browmonth;
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



    @SerializedName("bhightrade")
    @Expose
    public
    int bhightrade;

    @SerializedName("bhighyear")
    @Expose
    public
    int bhighyear;

    @SerializedName("bhighmonth")
    @Expose
    public
    int bhighmonth;



    @SerializedName("browtrade")
    @Expose
    public
    int browtrade;




    @SerializedName("browyear")
    @Expose
    public
    int browyear;

    @SerializedName("browmonth")
    @Expose
    public
    int browmonth;


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