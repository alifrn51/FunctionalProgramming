package org.example.productCard

import kotlinx.serialization.json.Json
import productCard.ProductCard
import java.io.File

object ProductRepository {

    private val file = File("products.json")

    private val _products = loadProductsCard()
    val products
        get() = _products.toList()

    private fun loadProductsCard(): List<ProductCard> {
        val content = file.readText().trim()
        if(content.isEmpty()) return emptyList()
        return Json.decodeFromString(content)
    }
}