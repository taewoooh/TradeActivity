package com.example.tradeactivity.type.Rtrade1;


import com.example.tradeactivity.type.Btrade1.Btradelistitem1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Rtradegithub1 {


    //GET/POST/DELETE/PUT 메소드들을 인터페이스에 구현하여 사용할 수 있다.

    //@GET("/Information2.php")
    // @GET("/ilbyeol.php")
    @GET("/DatasettestX3.php")
    // JSON Array를 리턴하므로 List<>가 되었다
    //Call<List<ListViewItem>> contributors(@Query("name") String naljja);
    Call<List<Btradelistitem1>> contributors(@Query("jiyeok1") String jiyeok1,
                                             @Query("jiyeok2") String jiyeok2);
}