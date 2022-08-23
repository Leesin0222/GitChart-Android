package com.yongjincompany.data.remote.api

import com.yongjincompany.data.remote.response.chart.DayCommitResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface ChartApi {
    @GET("{username}/daycount")
    suspend fun getDayCommit(
        @Path("username") userName: String
    ): DayCommitResponse
}