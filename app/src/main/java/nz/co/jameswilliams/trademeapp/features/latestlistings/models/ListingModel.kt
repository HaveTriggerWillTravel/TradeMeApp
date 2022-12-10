package nz.co.jameswilliams.trademeapp.features.latestlistings.models

/**
 * Model class representing a single auction listing.
 */
data class ListingModel(
    val location: String,
    val title: String,
    val imageUrl: String,
    val currentPrice: String? = null,
    val currentPriceLabel: String? = null,
    val buyNowPrice: String? = null,
    val buyNowPriceLabel: String? = null,
    val isClassified: Boolean = false
)