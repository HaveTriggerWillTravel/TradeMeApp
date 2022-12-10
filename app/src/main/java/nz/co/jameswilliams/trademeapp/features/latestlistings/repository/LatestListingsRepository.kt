package nz.co.jameswilliams.trademeapp.features.latestlistings.repository

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import nz.co.jameswilliams.trademeapp.features.latestlistings.models.ListingModel
import nz.co.jameswilliams.trademeapp.features.latestlistings.utils.MockDataUtils
import javax.inject.Inject

/**
 * Repository interface for retrieving latest auction listings.
 */
interface LatestListingsRepository {
    fun getLatestListings(useMock: Boolean = false) : List<ListingModel>
}

/**
 * Implementation of repository class for retrieving latest auction listings.
 */
class LatestListingsRepositoryImpl @Inject constructor() : LatestListingsRepository {
    override fun getLatestListings(useMock: Boolean) : List<ListingModel> {
        return if (useMock) MockDataUtils.getMockListings() else throw NotImplementedError()
    }
}

@Module
@InstallIn(ViewModelComponent::class)
abstract class LatestListingsRepositoryModule {

    @Binds
    abstract fun bindLatestListingsRepository(
        latestListingsRepository: LatestListingsRepositoryImpl
    ): LatestListingsRepository
}