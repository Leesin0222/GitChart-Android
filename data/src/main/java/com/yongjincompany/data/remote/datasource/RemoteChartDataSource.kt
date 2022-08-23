package com.yongjincompany.data.remote.datasource

import com.yongjincompany.domain.entity.chart.DayCommitEntity

interface RemoteChartDataSource {
    suspend fun fetchDayCommit(userName: String): DayCommitEntity
}