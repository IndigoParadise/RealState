package com.refactorizando.RealState.model

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertNotNull


class HouseTest {

    @Test
    fun shouldCreateObject(){
        val house : House = House(houseId = 1, height = 1, length = 1, neighbourhood = "somewhere", price = 10000)
        assertNotNull(house)
    }
}