package nz.co.jameswilliams.trademeapp.features.mytrademe.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import nz.co.jameswilliams.trademeapp.databinding.FragmentMyTradeMeBinding
import nz.co.jameswilliams.trademeapp.features.mytrademe.viewmodels.MyTradeMeViewModel

/**
 * Placeholder fragment for My Trade Me.
 */
class MyTradeMeFragment : Fragment() {

    private var _binding: FragmentMyTradeMeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val viewModel =
            ViewModelProvider(this)[MyTradeMeViewModel::class.java]

        _binding = FragmentMyTradeMeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textMyTradeMe
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