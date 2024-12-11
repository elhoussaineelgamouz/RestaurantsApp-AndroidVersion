package com.deserve.restaurantsApp.model.usecase

import com.deserve.restaurantsApp.data.RestaurantRepository
import com.deserve.restaurantsApp.model.entity.Resource

class FakeGetRestaurantPhotosUseCase(private val repository: RestaurantRepository) :
    GetRestaurantPhotosUseCase {
    override suspend fun invoke(input: String): Resource<String> {
        return repository.fetchRestaurantPhoto(input)
    }
}