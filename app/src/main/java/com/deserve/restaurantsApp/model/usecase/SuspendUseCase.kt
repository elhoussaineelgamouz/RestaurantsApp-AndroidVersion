package com.deserve.restaurantsApp.model.usecase

import com.deserve.restaurantsApp.model.dto.GetRestaurantInput
import com.deserve.restaurantsApp.model.entity.Resource
import com.deserve.restaurantsApp.model.entity.Restaurant

interface SuspendUseCase<Input, Output> {
    suspend operator fun invoke(input: Input): Output
}

interface GetRestaurantsUseCase : SuspendUseCase<GetRestaurantInput, Resource<List<Restaurant>>>

interface GetRestaurantPhotosUseCase : SuspendUseCase<String, Resource<String>>

