package nz.co.jameswilliams.trademeapp.features.watchlist.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Placeholder ViewModel for watchlist.
 */
class WatchlistViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Watchlist placeholder"
    }
    val text: LiveData<String> = _text
}