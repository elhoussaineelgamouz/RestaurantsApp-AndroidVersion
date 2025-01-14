package com.deserve.restaurantsApp.data

import android.location.Location
import com.deserve.restaurantsApp.model.dto.GetRestaurantInput
import com.deserve.restaurantsApp.model.dto.UserLocation
import com.deserve.restaurantsApp.model.entity.Restaurant
import com.deserve.restaurantsApp.model.entity.RestaurantGeoCodeMain
import com.deserve.restaurantsApp.model.entity.RestaurantGeoCodes
import com.deserve.restaurantsApp.model.entity.RestaurantLocation

val restaurant1 = Restaurant(
    id = "1",
    name = "Fake Restaurant1",
    imageUrl = "https://test.com/test.jpg",
    openStatus = "open",
    location = RestaurantLocation(formattedAddress = "123, main street, test"),
    geoCodes = RestaurantGeoCodes(
        restaurantGeoCodeMain = RestaurantGeoCodeMain(
            latitude = 123.00,
            longitude = -245.00
        )
    )
)

val restaurant2 = Restaurant(
    id = "2",
    name = "Fake Restaurant2",
    imageUrl = "https://test.com/main.jpg",
    openStatus = "closed",
    location = RestaurantLocation(formattedAddress = "456, main street, test"),
    geoCodes = RestaurantGeoCodes(
        restaurantGeoCodeMain = RestaurantGeoCodeMain(
            latitude = 456.00,
            longitude = -903.00
        )
    )
)

val FakeGetRestaurantInput = GetRestaurantInput(location = UserLocation(latitude = 123.00, longitude = 344.00))