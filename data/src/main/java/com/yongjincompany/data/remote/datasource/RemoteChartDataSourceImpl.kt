package com.yongjincompany.data.remote.datasource

import com.yongjincompany.data.remote.api.ChartApi
import com.yongjincompany.data.remote.response.chart.DayCommitResponse
import com.yongjincompany.data.remote.response.chart.WeeklyCommitResponse
import com.yongjincompany.data.remote.response.chart.toEntity
import com.yongjincompany.data.util.HttpHandler
import com.yongjincompany.domain.entity.chart.DayCommitEntity
import com.yongjincompany.domain.entity.chart.WeeklyCommitEntity
import javax.inject.Inject

class RemoteChartDataSourceImpl @Inject constructor(
    private val chartApi: ChartApi
): RemoteChartDataSource {
    override suspend fun fetchDayCommit(userName: String): DayCommitEntity =
        HttpHandler<DayCommitResponse>()
            .httpRequest { chartApi.getDayCommit(userName) }
            .sendRequest().toEntity()

    override suspend fun fetchWeeklyCommit(userName: String): WeeklyCommitEntity =
        HttpHandler<WeeklyCommitResponse>()
            .httpRequest { chartApi.getWeeklyCommit(userName) }
            .sendRequest().toEntity()

}