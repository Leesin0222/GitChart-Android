package com.yongjincompany.data.remote.datasource

import com.yongjincompany.data.remote.api.GitHubApi
import com.yongjincompany.data.remote.response.github.GithubProfileResponse
import com.yongjincompany.data.remote.response.github.toEntity
import com.yongjincompany.data.util.HttpHandler
import com.yongjincompany.domain.entity.GithubProfileEntity
import javax.inject.Inject

class RemoteGithubDataSourceImpl @Inject constructor(
    private val gitHubApi: GitHubApi
) : RemoteGithubDataSource {
    override suspend fun fetchGithubProfile(userName: String): GithubProfileEntity =
        HttpHandler<GithubProfileResponse>()
            .httpRequest { gitHubApi.getGithubProfile(userName) }
            .sendRequest().toEntity()

}