package com.yongjincompany.domain.repository

import com.yongjincompany.domain.entity.chart.DayCommitEntity
import kotlinx.coroutines.flow.Flow

interface ChartRepository {
    suspend fun fetchDayCommit(userName: String): Flow<DayCommitEntity>
}