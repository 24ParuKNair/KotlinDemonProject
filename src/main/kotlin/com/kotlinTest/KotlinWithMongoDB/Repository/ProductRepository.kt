package com.kotlinTest.KotlinWithMongoDB.Repository

import com.kotlinTest.KotlinWithMongoDB.Model.Product
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ProductRepository : MongoRepository<Product, Int>{
    override fun findAll() : List<Product>

}