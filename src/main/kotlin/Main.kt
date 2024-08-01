package com.juaracoding

import com.juaracoding.function.Commerce
import com.juaracoding.function.Product
import com.juaracoding.function.calculateTotalPrice

fun main() {

    val commerce = Commerce()

    val price1 = 150.0
    val price2 = 80.0

    val discount1 = commerce.calculateDiscount(price1, "Regular")
    val discount2 = commerce.calculateDiscount(price2, "Premium")

    println("Discount for Regular user with price $price1: $$discount1")
    println("Discount for Premium user with price $price2: $$discount2")

    // Membuat beberapa objek Product
    val product1 = Product(1, "Laptop", 1000.0, 1)
    val product2 = Product(2, "Mouse", 25.0, 2)
    val product3 = Product(3, "Keyboard", 45.0, 1)

    // Membuat daftar produk
    val cart = listOf(product1, product2, product3)

    // Menghitung total harga keranjang belanja
    val totalPrice = calculateTotalPrice(cart)

    // Menampilkan total harga
    println("Total price of the cart is: $$totalPrice")
}
