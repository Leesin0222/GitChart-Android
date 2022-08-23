package com.yongjincompany.domain.repository

import com.yongjincompany.domain.entity.github.GithubProfileEntity
import kotlinx.coroutines.flow.Flow

interface GithubRepository {
    suspend fun fetchGithubProfile(userName: String): Flow<GithubProfileEntity>
}