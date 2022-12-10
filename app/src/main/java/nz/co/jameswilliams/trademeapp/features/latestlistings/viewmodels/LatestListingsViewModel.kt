package nz.co.jameswilliams.trademeapp.features.latestlistings.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import nz.co.jameswilliams.trademeapp.features.latestlistings.models.ListingModel
import nz.co.jameswilliams.trademeapp.features.latestlistings.repository.LatestListingsRepository
import javax.inject.Inject

/**
 * ViewModel class for latest listings view.
 */
@HiltViewModel
class LatestListingsViewModel @Inject constructor(
    private val latestListingsRepository: LatestListingsRepository
) : ViewModel() {

    private val _listings = MutableLiveData<List<ListingModel>>()

    val listings: LiveData<List<ListingModel>>
            get() = _listings

    fun loadData() {
        _listings.value = latestListingsRepository.getLatestListings(useMock = true)
    }
}