package com.deserve.restaurantsApp.usecase

import com.deserve.restaurantsApp.data.RestaurantRepository
import com.deserve.restaurantsApp.model.entity.Resource
import com.deserve.restaurantsApp.model.usecase.GetRestaurantPhotosUseCase

class GetRestaurantPhotosUseCaseImpl(private val restaurantRepository: RestaurantRepository) :
    GetRestaurantPhotosUseCase {
    override suspend fun invoke(input: String): Resource<String> {
        return restaurantRepository.fetchRestaurantPhoto(input)
    }
}