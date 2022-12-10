package nz.co.jameswilliams.trademeapp.features.latestlistings.utils

import nz.co.jameswilliams.trademeapp.features.latestlistings.models.ListingModel

/**
 * Mock Data utility class for mocking objects to help with development before API integration.
 */
class MockDataUtils {
    companion object {
        fun getMockListings(): List<ListingModel> {
            return listOf(
                ListingModel(
                    location = "Auckland",
                    title = "Sample listing 1",
                    currentPrice = "$300.00",
                    currentPriceLabel = "No reserve",
                    buyNowPrice = "$300.00",
                    buyNowPriceLabel = "Buy Now",
                    imageUrl = "https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png"
                ),
                ListingModel(
                    location = "Nelson",
                    title = "Sample listing 2",
                    currentPrice = "$300.00",
                    currentPriceLabel = "Reserve met",
                    imageUrl = "https://www.trademe.co.nz/images/frend/trademe-logo-no-tagline.png"
                ),
                ListingModel(
                    location = "Taupo",
                    title = "Sample listing 3",
                    currentPrice = "$300.00",
                    currentPriceLabel = "No reserve",
                    buyNowPrice = "$300.00",
                    buyNowPriceLabel = "Buy Now",
                    imageUrl = "https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png"
                ),
                ListingModel(
                    location = "Auckland",
                    title = "Sample classified",
                    buyNowPrice = "$3000.00",
                    buyNowPriceLabel = "Asking price",
                    imageUrl = "https://www.trademe.co.nz/images/frend/trademe-logo-no-tagline.png"
                ),
                ListingModel(
                    location = "Nelson",
                    title = "Sample listing 4",
                    currentPrice = "$300.00",
                    currentPriceLabel = "Reserve met",
                    imageUrl = "https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png"
                ),
                ListingModel(
                    location = "Taupo",
                    title = "Sample listing 5",
                    currentPrice = "$300.00",
                    currentPriceLabel = "No reserve",
                    buyNowPrice = "$300.00",
                    buyNowPriceLabel = "Buy Now",
                    imageUrl = "https://www.trademe.co.nz/images/frend/trademe-logo-no-tagline.png"
                ),
                ListingModel(
                    location = "Auckland",
                    title = "Sample listing 6",
                    currentPrice = "$300.00",
                    currentPriceLabel = "No reserve",
                    buyNowPrice = "$300.00",
                    buyNowPriceLabel = "Buy Now",
                    imageUrl = "https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png"
                ),
                ListingModel(
                    location = "Nelson",
                    title = "Sample listing 7",
                    currentPrice = "$300.00",
                    currentPriceLabel = "Reserve met",
                    imageUrl = "https://www.trademe.co.nz/images/frend/trademe-logo-no-tagline.png"
                ),
                ListingModel(
                    location = "Taupo",
                    title = "Sample listing 8",
                    currentPrice = "$300.00",
                    currentPriceLabel = "No reserve",
                    buyNowPrice = "$300.00",
                    buyNowPriceLabel = "Buy Now",
                    imageUrl = "https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png"
                )
            )
        }
    }
}