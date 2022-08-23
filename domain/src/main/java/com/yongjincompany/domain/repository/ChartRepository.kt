package com.yongjincompany.domain.repository

import com.yongjincompany.domain.entity.chart.DayCommitEntity
import com.yongjincompany.domain.entity.chart.WeeklyCommitEntity
import com.yongjincompany.domain.entity.chart.YearCommitEntity
import kotlinx.coroutines.flow.Flow

interface ChartRepository {
    suspend fun fetchDayCommit(userName: String): Flow<DayCommitEntity>

    suspend fun fetchWeeklyCommit(userName: String): Flow<WeeklyCommitEntity>

    suspend fun fetchYearCommit(userName: String): Flow<YearCommitEntity>
}