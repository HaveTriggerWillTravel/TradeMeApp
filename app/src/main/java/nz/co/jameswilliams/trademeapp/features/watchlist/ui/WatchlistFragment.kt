package nz.co.jameswilliams.trademeapp.features.watchlist.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import nz.co.jameswilliams.trademeapp.databinding.FragmentWatchlistBinding
import nz.co.jameswilliams.trademeapp.features.watchlist.viewmodels.WatchlistViewModel

/**
 * Placeholder fragment for watchlist.
 */
class WatchlistFragment : Fragment() {

    private var _binding: FragmentWatchlistBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val viewModel =
            ViewModelProvider(this)[WatchlistViewModel::class.java]

        _binding = FragmentWatchlistBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textWatchlist
        viewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}