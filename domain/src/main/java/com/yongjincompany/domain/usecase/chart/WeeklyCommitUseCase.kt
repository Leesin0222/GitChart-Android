package com.yongjincompany.domain.usecase.chart

import com.yongjincompany.domain.entity.chart.WeeklyCommitEntity
import com.yongjincompany.domain.repository.ChartRepository
import com.yongjincompany.domain.usecase.UseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class WeeklyCommitUseCase @Inject constructor(
    private val chartRepository: ChartRepository
): UseCase<String, Flow<WeeklyCommitEntity>>() {
    override suspend fun execute(data: String): Flow<WeeklyCommitEntity> =
        chartRepository.fetchWeeklyCommit(data)
}