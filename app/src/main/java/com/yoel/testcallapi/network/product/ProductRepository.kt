package com.yoel.testcallapi.network.product

import com.yoel.testcallapi.network.product.model.ProductListResponse

class ProductRepository {
    val api = ProductService()

    suspend fun getAllProducts(): ProductListResponse {
        return api.getAllProducts()
    }
}