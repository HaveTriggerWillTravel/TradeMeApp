package nz.co.jameswilliams.trademeapp.features.latestlistings.ui

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.VERTICAL
import dagger.hilt.android.AndroidEntryPoint
import nz.co.jameswilliams.trademeapp.R
import nz.co.jameswilliams.trademeapp.databinding.FragmentLatestListingsBinding
import nz.co.jameswilliams.trademeapp.features.latestlistings.viewmodels.LatestListingsViewModel

/**
 * Fragment for displaying list of most recent auction listings
 */
@AndroidEntryPoint
class LatestListingsFragment : Fragment(), MenuProvider {

    private var _binding: FragmentLatestListingsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var viewModel: LatestListingsViewModel

    private val recyclerViewAdapter by lazy {
        ListingRecyclerViewAdapter { item ->
            Toast.makeText(context, "Clicked ${item.title}!", Toast.LENGTH_SHORT)
                .show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this)[LatestListingsViewModel::class.java]
        viewModel.loadData()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLatestListingsBinding.inflate(inflater, container, false)
        setUpViews()
        setUpObservers()
        requireActivity().addMenuProvider(this, viewLifecycleOwner, Lifecycle.State.RESUMED)
        return binding.root
    }

    private fun setUpViews() {
        binding.apply {
            listingsRecyclerView.layoutManager = LinearLayoutManager(context)
            listingsRecyclerView.adapter = recyclerViewAdapter
            listingsRecyclerView.addItemDecoration(DividerItemDecoration(context, VERTICAL))
        }
    }

    private fun setUpObservers() {
        viewModel.listings.observe(viewLifecycleOwner) { items ->
            recyclerViewAdapter.setData(items)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
        menuInflater.inflate(R.menu.latest_listings, menu)
        val search = menu.findItem(R.id.menu_item_search).icon
        val cart = menu.findItem(R.id.menu_item_cart).icon
        search?.let {
            DrawableCompat.setTint(
                it,
                ContextCompat.getColor(requireContext(), R.color.tasman_500)
            )
        }
        cart?.let {
            DrawableCompat.setTint(
                it,
                ContextCompat.getColor(requireContext(), R.color.tasman_500)
            )
        }
    }

    override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
        return when (menuItem.itemId) {
            R.id.menu_item_search -> {
                Toast.makeText(context, "Clicked search!", Toast.LENGTH_SHORT)
                    .show()
                true
            }
            R.id.menu_item_cart -> {
                Toast.makeText(context, "Clicked cart!", Toast.LENGTH_SHORT)
                    .show()
                true
            }
            else ->
                false
        }
    }
}