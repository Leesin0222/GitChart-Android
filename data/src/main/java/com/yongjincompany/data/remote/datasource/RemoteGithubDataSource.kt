package com.yongjincompany.data.remote.datasource

import com.yongjincompany.domain.entity.GithubProfileEntity

interface RemoteGithubDataSource {
    suspend fun fetchGithubProfile(userName: String): GithubProfileEntity
}