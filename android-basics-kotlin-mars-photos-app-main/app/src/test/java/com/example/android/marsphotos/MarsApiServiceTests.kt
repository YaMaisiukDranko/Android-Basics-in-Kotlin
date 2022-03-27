package com.example.android.marsphotos

import com.example.android.marsphotos.network.MarsApiService
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.junit.Before
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class MarsApiServiceTests {
    private lateinit var service: MarsApiService
    @Before
    fun setup() {
        val url = mockWebServer.url("/")
        service = Retrofit.Builder()
            .addConverterFactory(
                MoshiConverterFactory.create(
                Moshi.Builder()
                    .add(KotlinJsonAdapterFactory())
                    .build()
            ))
            .build()
            .create(MarsApiService::class.java)
    }

}