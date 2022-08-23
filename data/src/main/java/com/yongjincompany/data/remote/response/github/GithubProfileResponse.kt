package com.yongjincompany.data.remote.response.github

import com.google.gson.annotations.SerializedName
import com.yongjincompany.domain.entity.github.GithubProfileEntity

data class GithubProfileResponse(
    @SerializedName("avatar_url") val avatarUrl: String,
    @SerializedName("followers") val followers: Int,
    @SerializedName("following") val following: Int,
    @SerializedName("login") val login: String,
    @SerializedName("name") val name: String,
)

fun GithubProfileResponse.toEntity() =
    GithubProfileEntity(
        avatarUrl = avatarUrl,
        followers = followers,
        following = following,
        login = login,
        name = name
    )