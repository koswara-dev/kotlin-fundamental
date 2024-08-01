package com.juaracoding.function

data class Product(val id: Int, val name: String, val price: Double, val quantity: Int)

fun calculateTotalPrice(products: List<Product>): Double {
    var total = 0.0
    for (product in products) {
        total += product.price * product.quantity
    }
    return total
}
