package com.kotlinTest.KotlinWithMongoDB.Model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "Product")
data class Product (
    @Id
    var productId : Int,
    var productName : String,
    var productCategory : String,
    var allergens : String,
    var productRate : Double
)