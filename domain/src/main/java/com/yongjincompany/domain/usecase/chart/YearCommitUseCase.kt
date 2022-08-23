package com.yongjincompany.domain.usecase.chart

import com.yongjincompany.domain.entity.chart.YearCommitEntity
import com.yongjincompany.domain.repository.ChartRepository
import com.yongjincompany.domain.usecase.UseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class YearCommitUseCase @Inject constructor(
    private val chartRepository: ChartRepository,
) : UseCase<String, Flow<YearCommitEntity>>() {
    override suspend fun execute(data: String): Flow<YearCommitEntity> =
        chartRepository.fetchYearCommit(data)
}