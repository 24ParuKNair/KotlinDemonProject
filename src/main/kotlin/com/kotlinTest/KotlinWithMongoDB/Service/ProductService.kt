package com.kotlinTest.KotlinWithMongoDB.Service

import com.kotlinTest.KotlinWithMongoDB.Model.Product
import com.kotlinTest.KotlinWithMongoDB.Repository.ProductRepository
import org.springframework.stereotype.Service

@Service
open class ProductService (private val productRepository: ProductRepository){
    fun getProducts():List<Product>{
        return productRepository.findAll()
    }


}