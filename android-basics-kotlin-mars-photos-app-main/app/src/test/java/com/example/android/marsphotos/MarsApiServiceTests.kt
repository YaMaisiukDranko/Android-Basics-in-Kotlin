package com.example.android.marsphotos

import com.example.android.marsphotos.network.MarsApiService
import org.junit.Before

class MarsApiServiceTests {
    private lateinit var service: MarsApiService
    @Before
    fun setup() {
        val url = mockWebServer.url("/")
    }

}