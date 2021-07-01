package com.kotlinTest.KotlinWithMongoDB.ConnectionPooling

import com.mongodb.ConnectionString
import com.mongodb.reactivestreams.client.MongoClient
import com.mongodb.reactivestreams.client.MongoClients
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.EnableMongoAuditing
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories


@Configuration
@EnableMongoAuditing
@EnableMongoRepositories(basePackages = ["com.kotlinTest.KotlinWithMongoDB.Repository"])
class MongoConfig{

    private var connectionString: ConnectionString = ConnectionString("mongodb://mongoadmin:secret@localhost:27017/database?authSource=admin")
    @Bean
    open fun mongoClient(): MongoClient? {
        return MongoClients.create(connectionString!!)
    }
    @Bean
    open fun getDatabaseName(): String? {
        val databaseName = connectionString!!.database
        return databaseName
    }
    @Bean
    open fun mongoTemplate(): MongoTemplate? {
        return MongoTemplate(mongoClient()!!, getDatabaseName()!!)
    }
}
