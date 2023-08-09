package com.example.tradeactivity.type.BRtrade2;

import com.example.tradeactivity.type.BRMtrade2.BRMtradelistitem2;
import com.example.tradeactivity.type.Btrade2.Btradelistitem2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BRtradegithub2 {


    //GET/POST/DELETE/PUT 메소드들을 인터페이스에 구현하여 사용할 수 있다.

    //@GET("/Information2.php")
    // @GET("/ilbyeol.php")
   // @GET("/DatasettestX.php")
    @GET("/TradeBR.php")

    // JSON Array를 리턴하므로 List<>가 되었다
    //Call<List<ListViewItem>> contributors(@Query("name") String naljja);
    Call<List<BRtradelistitem2>> contributors(@Query("jiyeok") String name);
}