package com.yongjincompany.data.remote.response.chart

import com.yongjincompany.domain.entity.chart.WeeklyCommitEntity

data class WeeklyCommitResponse(
    val weekCommit: Int,
)

fun WeeklyCommitResponse.toEntity() =
    WeeklyCommitEntity(
        weekCommit = weekCommit
    )