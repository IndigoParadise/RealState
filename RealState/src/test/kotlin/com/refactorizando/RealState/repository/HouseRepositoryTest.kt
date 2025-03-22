package com.refactorizando.RealState.repository

import com.refactorizando.RealState.model.House
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertNotNull
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager
import org.springframework.boot.test.context.SpringBootTest


@DataJpaTest
class HouseRepositoryTest{

    @Autowired
    lateinit var houseRepository: HouseRepository
    lateinit var house : House
    @BeforeEach
    fun init(){
         house  = House(height = 1, length = 1,  neighbourhood = "Somewhere", price = 10000)
    }
    @Test
    fun shouldSave(){
        val savedHouse = houseRepository.save(house)
        assertNotNull(savedHouse)
    }

}