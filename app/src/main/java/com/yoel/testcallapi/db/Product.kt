package com.yoel.testcallapi.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Product(
    @PrimaryKey(autoGenerate = false)
    var id: Int,
    var title: String,
    var description: String,
    var price: Double,
    var discountPercentage: Double,
    var rating: Double,
    var stock: Int,
    var brand: String,
    var category: String,
    var thumbnail: String
)