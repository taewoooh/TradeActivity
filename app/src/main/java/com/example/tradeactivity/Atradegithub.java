package com.example.tradeactivity;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Atradegithub {


    //GET/POST/DELETE/PUT 메소드들을 인터페이스에 구현하여 사용할 수 있다.

    //@GET("/Information2.php")
    // @GET("/ilbyeol.php")
    //@GET("/DatasettestX2.php")
    @GET("/DatasettestX5.php")

    Call<List<Daydatalistitem2>> contributors(@Query("jiyeok") String name);
}