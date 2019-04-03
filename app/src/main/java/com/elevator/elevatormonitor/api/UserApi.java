package com.elevator.elevatormonitor.api;

import com.elevator.elevatormonitor.beans.BaseResponse;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface UserApi {
    @POST("/api/v1/sso/user/login")
    Call<BaseResponse> login(@Body RequestBody requestBody);
}
