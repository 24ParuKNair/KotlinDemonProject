package com.kotlinTest.KotlinWithMongoDB.Controller

import com.kotlinTest.KotlinWithMongoDB.Model.Product
import com.kotlinTest.KotlinWithMongoDB.Service.ProductService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/products")
class ProductController (private val productService: ProductService, private val product : Product){
    @GetMapping("getAll")
    fun getProducts():List<Product> = productService.getProducts()

    //@GetMapping("/createProduct")
    /*fun createNewProduct() : String{
        productService.createProduct(product)
        return " New product Created"
    }*/
}