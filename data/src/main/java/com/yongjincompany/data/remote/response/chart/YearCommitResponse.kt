package com.yongjincompany.data.remote.response.chart

import com.yongjincompany.domain.entity.chart.YearCommitEntity

data class YearCommitResponse(
    val yearCommit: Int
)

fun YearCommitResponse.toEntity() =
    YearCommitEntity(
        yearCommit = yearCommit
    )

