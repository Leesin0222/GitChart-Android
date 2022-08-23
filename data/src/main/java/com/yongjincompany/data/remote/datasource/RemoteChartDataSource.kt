package com.yongjincompany.data.remote.datasource

import com.yongjincompany.domain.entity.chart.DayCommitEntity
import com.yongjincompany.domain.entity.chart.WeeklyCommitEntity
import com.yongjincompany.domain.entity.chart.YearCommitEntity

interface RemoteChartDataSource {
    suspend fun fetchDayCommit(userName: String): DayCommitEntity

    suspend fun fetchWeeklyCommit(userName: String): WeeklyCommitEntity

    suspend fun fetchYearCommit(userName: String): YearCommitEntity
}