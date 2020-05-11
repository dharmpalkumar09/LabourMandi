package com.app.navinbharat;

import com.app.navinbharat.domain.Worker;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WorkerPlaceHolderApi {

    @GET("getAll")
    Call<Result<String,List<Worker>>> getWorker();
}
