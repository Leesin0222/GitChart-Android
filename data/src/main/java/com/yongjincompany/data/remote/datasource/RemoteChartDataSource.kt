package com.yongjincompany.data.remote.datasource

import com.yongjincompany.domain.entity.chart.DayCommitEntity
import com.yongjincompany.domain.entity.chart.WeeklyCommitEntity

interface RemoteChartDataSource {
    suspend fun fetchDayCommit(userName: String): DayCommitEntity

    suspend fun fetchWeeklyCommit(userName: String): WeeklyCommitEntity
}