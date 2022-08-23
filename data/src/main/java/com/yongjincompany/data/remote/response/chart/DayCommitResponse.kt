package com.yongjincompany.data.remote.response.chart

import com.yongjincompany.domain.entity.chart.DayCommitEntity

data class DayCommitResponse(
    val dayCommit: Int
)

fun DayCommitResponse.toEntity() =
    DayCommitEntity(
        dayCommit = dayCommit
    )