package com.yongjincompany.domain.usecase.chart

import com.yongjincompany.domain.entity.chart.DayCommitEntity
import com.yongjincompany.domain.repository.ChartRepository
import com.yongjincompany.domain.usecase.UseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class DayCommitUseCase @Inject constructor(
    private val chartRepository: ChartRepository
) : UseCase<String, Flow<DayCommitEntity>>() {
    override suspend fun execute(data: String): Flow<DayCommitEntity> =
        chartRepository.fetchDayCommit(data)
}