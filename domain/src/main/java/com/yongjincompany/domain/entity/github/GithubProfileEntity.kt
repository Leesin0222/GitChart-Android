package com.yongjincompany.domain.entity.github

data class GithubProfileEntity(
    val avatarUrl: String,
    val followers: Int,
    val following: Int,
    val login: String,
    val name: String,
)