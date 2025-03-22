package com.refactorizando.RealState.repository

import com.refactorizando.RealState.model.House
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface HouseRepository : JpaRepository<House,Long> {
}