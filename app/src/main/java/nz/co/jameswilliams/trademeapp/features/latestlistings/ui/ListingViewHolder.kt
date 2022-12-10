package nz.co.jameswilliams.trademeapp.features.latestlistings.ui

import androidx.recyclerview.widget.RecyclerView
import coil.load
import nz.co.jameswilliams.trademeapp.databinding.ViewHolderListingBinding
import nz.co.jameswilliams.trademeapp.features.latestlistings.models.ListingModel

/**
 * ViewHolder class for auction listing list item.
 */
class ListingViewHolder(
    private val binding: ViewHolderListingBinding,
    private val onClick: (Int) -> Unit
) : RecyclerView.ViewHolder(binding.root) {

    init {
        itemView.setOnClickListener {
            onClick(adapterPosition)
        }
    }

    fun bind(model: ListingModel) {
        binding.apply {
            location.text = model.location
            title.text = model.title
            thumbnail.load(model.imageUrl)
            currentPrice.text = model.currentPrice
            currentPriceLabel.text = model.currentPriceLabel
            buyNowPrice.text = model.buyNowPrice
            buyNowPriceLabel.text = model.buyNowPriceLabel
        }
    }
}