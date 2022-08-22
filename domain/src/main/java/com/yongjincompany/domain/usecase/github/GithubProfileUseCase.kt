package com.yongjincompany.domain.usecase.github

import com.yongjincompany.domain.entity.GithubProfileEntity
import com.yongjincompany.domain.repository.GithubRepository
import com.yongjincompany.domain.usecase.UseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GithubProfileUseCase @Inject constructor(
    private val githubRepository: GithubRepository,
) : UseCase<String, Flow<GithubProfileEntity>>() {
    override suspend fun execute(data: String): Flow<GithubProfileEntity> =
        githubRepository.fetchGithubProfile(data)
}