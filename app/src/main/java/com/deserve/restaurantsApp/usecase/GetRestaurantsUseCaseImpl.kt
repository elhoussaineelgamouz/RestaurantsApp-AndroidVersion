package com.deserve.restaurantsApp.usecase

import com.deserve.restaurantsApp.data.RestaurantRepository
import com.deserve.restaurantsApp.model.dto.GetRestaurantInput
import com.deserve.restaurantsApp.model.entity.Resource
import com.deserve.restaurantsApp.model.entity.Restaurant
import com.deserve.restaurantsApp.model.usecase.GetRestaurantsUseCase

class GetRestaurantsUseCaseImpl(private val restaurantRepository: RestaurantRepository): GetRestaurantsUseCase {
    override suspend fun invoke(input: GetRestaurantInput): Resource<List<Restaurant>> {
        val restaurants = listOf(
            Restaurant(
                id = 1,
                title = "The Gourmet Bistro",
                image = "GourmetBistro",
                description = "A cozy spot offering international gourmet dishes.",
                geolocation = Geolocation(latitude = -26.204103, longitude = 28.047305)
            ),
            Restaurant(
                id = 2,
                title = "La Pizzeria",
                image = "LaPizzeria",
                description = "Authentic Italian pizza with wood-fired crusts.",
                geolocation = Geolocation(latitude = -26.203103, longitude = 28.046306)
            ),
            Restaurant(
                id = 3,
                title = "Pizza Express",
                image = "PizzaExpress",
                description = "Quick and delicious pizza for all tastes.",
                geolocation = Geolocation(latitude = -26.202103, longitude = 28.045306)
            ),
            Restaurant(
                id = 4,
                title = "Tapas Lounge",
                image = "TapasLounge",
                description = "Spanish tapas with a vibrant atmosphere.",
                geolocation = Geolocation(latitude = -26.202104, longitude = 28.045307)
            ),
            Restaurant(
                id = 5,
                title = "Dim Sum Palace",
                image = "DimSumPalace",
                description = "Authentic Chinese dim sum and dumplings.",
                geolocation = Geolocation(latitude = -26.201104, longitude = 28.044307)
            ),
            Restaurant(
                id = 6,
                title = "Mediterraneo",
                image = "Mediterraneo",
                description = "Mediterranean dishes with a focus on healthy ingredients.",
                geolocation = Geolocation(latitude = -26.200104, longitude = 28.043307)
            ),
            Restaurant(
                id = 7,
                title = "Curry House",
                image = "CurryHouse",
                description = "Spicy and savory Indian curries.",
                geolocation = Geolocation(latitude = -26.200105, longitude = 28.043308)
            ),
            Restaurant(
                id = 8,
                title = "Steakhouse Prime",
                image = "SteakhousePrime",
                description = "Premium steaks cooked to perfection.",
                geolocation = Geolocation(latitude = -26.204104, longitude = 28.047306)
            ),
            Restaurant(
                id = 9,
                title = "Mediterraneo",
                image = "Mediterraneo",
                description = "Mediterranean dishes with a focus on healthy ingredients.",
                geolocation = Geolocation(latitude = -26.304104, longitude = 28.143308)
            ),
            Restaurant(
                id = 10,
                title = "Cafe Parisien",
                image = "CafeParisien",
                description = "French cafe with pastries and artisanal coffee.",
                geolocation = Geolocation(latitude = -26.204114, longitude = 28.143318)
            )
        )
        return restaurants
    }
}