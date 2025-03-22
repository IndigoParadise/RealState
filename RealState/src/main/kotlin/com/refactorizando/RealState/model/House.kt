package com.refactorizando.RealState.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
 data class House(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "houseId")
    val houseId : Long?=null,
    @Column(name = "height")
    val height : Long,
    @Column(name = "length")
    val length : Long,
    @Column(name = "neighbourhood")
    val neighbourhood : String,
    @Column(name = "price")
    val price : Long

    )
