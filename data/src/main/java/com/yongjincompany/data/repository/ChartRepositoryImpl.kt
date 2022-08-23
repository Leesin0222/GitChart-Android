package com.yongjincompany.data.repository

import com.yongjincompany.data.remote.datasource.RemoteChartDataSource
import com.yongjincompany.data.util.OfflineCacheUtil
import com.yongjincompany.domain.entity.chart.DayCommitEntity
import com.yongjincompany.domain.repository.ChartRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ChartRepositoryImpl @Inject constructor(
    private val remoteChartDataSource: RemoteChartDataSource,
) : ChartRepository {
    override suspend fun fetchDayCommit(userName: String): Flow<DayCommitEntity> =
        OfflineCacheUtil<DayCommitEntity>()
            .remoteData { remoteChartDataSource.fetchDayCommit(userName) }
            .createFlow()
}