package com.s2next.daggerexample.interfaces;

import com.s2next.daggerexample.utils.Login;

import java.util.HashMap;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by amadeusportes on 05/12/17.
 */

public interface InterfaceLogin {
    @POST("/rest/register")
    Observable<Login> getLogin(@Body HashMap<String, Object> body);
}
