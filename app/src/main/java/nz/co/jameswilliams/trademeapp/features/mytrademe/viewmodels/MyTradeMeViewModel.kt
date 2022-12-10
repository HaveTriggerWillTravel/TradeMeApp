package nz.co.jameswilliams.trademeapp.features.mytrademe.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * Placeholder ViewModel for My Trade Me.
 */
class MyTradeMeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "My Trade Me placeholder"
    }
    val text: LiveData<String> = _text
}