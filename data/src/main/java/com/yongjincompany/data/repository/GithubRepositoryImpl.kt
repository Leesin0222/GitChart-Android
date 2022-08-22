package com.yongjincompany.data.repository

import com.yongjincompany.data.remote.datasource.RemoteGithubDataSource
import com.yongjincompany.data.util.OfflineCacheUtil
import com.yongjincompany.domain.entity.GithubProfileEntity
import com.yongjincompany.domain.repository.GithubRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GithubRepositoryImpl @Inject constructor(
    private val remoteGithubDataSource: RemoteGithubDataSource
): GithubRepository {
    override suspend fun fetchGithubProfile(userName: String): Flow<GithubProfileEntity> =
        OfflineCacheUtil<GithubProfileEntity>()
            .remoteData { remoteGithubDataSource.fetchGithubProfile(userName) }
            .createFlow()
}