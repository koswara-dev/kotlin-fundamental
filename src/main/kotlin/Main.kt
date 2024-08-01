package com.juaracoding

import com.juaracoding.function.Commerce

fun main() {

    val commerce = Commerce()

    val price1 = 150.0
    val price2 = 80.0

    val discount1 = commerce.calculateDiscount(price1, "Regular")
    val discount2 = commerce.calculateDiscount(price2, "Premium")

    println("Discount for Regular user with price $price1: $$discount1")
    println("Discount for Premium user with price $price2: $$discount2")
}
