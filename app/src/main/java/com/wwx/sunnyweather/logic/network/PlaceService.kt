package com.wwx.sunnyweather.logic.network

import retrofit2.http.GET

interface PlaceService {
    @GET
    fun searchPlaces()
}