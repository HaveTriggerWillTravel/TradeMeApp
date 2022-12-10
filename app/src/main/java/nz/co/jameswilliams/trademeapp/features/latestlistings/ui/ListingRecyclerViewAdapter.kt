package nz.co.jameswilliams.trademeapp.features.latestlistings.ui

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import nz.co.jameswilliams.trademeapp.databinding.ViewHolderListingBinding
import nz.co.jameswilliams.trademeapp.features.latestlistings.models.ListingModel

/**
 * RecyclerViewAdapter for latest listings screen.
 */
class ListingRecyclerViewAdapter(
    private val onClick: (ListingModel) -> Unit
) : RecyclerView.Adapter<ListingViewHolder>() {

    private var items = listOf<ListingModel>()

    @SuppressLint("NotifyDataSetChanged")
    fun setData(items: List<ListingModel>) {
        this.items = items
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListingViewHolder {
        return ListingViewHolder(
            ViewHolderListingBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        ) {
            onClick(items[it])
        }
    }

    override fun onBindViewHolder(holder: ListingViewHolder, position: Int) {
        return holder.bind(items[position])
    }

    override fun getItemCount() = items.count()
}