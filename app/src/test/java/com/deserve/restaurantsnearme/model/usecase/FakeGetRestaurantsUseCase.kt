package com.deserve.restaurantsApp.model.usecase

import com.deserve.restaurantsApp.data.RestaurantRepository
import com.deserve.restaurantsApp.model.dto.GetRestaurantInput
import com.deserve.restaurantsApp.model.entity.Resource
import com.deserve.restaurantsApp.model.entity.Restaurant

class FakeGetRestaurantsUseCase(private val repository: RestaurantRepository) :
    GetRestaurantsUseCase {
    override suspend fun invoke(input: GetRestaurantInput): Resource<List<Restaurant>> {
        return repository.fetchRestaurant(input)
    }
}