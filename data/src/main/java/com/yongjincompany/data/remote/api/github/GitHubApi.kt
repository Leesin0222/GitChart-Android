package com.yongjincompany.data.remote.api.github

import com.yongjincompany.data.remote.response.github.GithubProfileResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubApi {
    @GET("users/{userName}")
    suspend fun getGithubProfile(
        @Path("userName") userName: String
    ): GithubProfileResponse
}