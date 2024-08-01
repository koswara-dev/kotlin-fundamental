package com.juaracoding.function

class Commerce {
    fun calculateDiscount(price: Double, userType: String): Double {
        val discount: Double

        if (userType == "Regular") {
            discount = if (price > 100) {
                price * 0.10 // 10% discount for regular users if price is more than 100
            } else {
                0.0 // No discount for regular users if price is less or equal to 100
            }
        } else if (userType == "Premium") {
            discount = if (price > 100) {
                price * 0.15 // 15% discount for premium users if price is more than 100
            } else {
                price * 0.05 // 5% discount for premium users if price is less or equal to 100
            }
        } else {
            discount = 0.0 // No discount for unrecognized user types
        }

        return discount
    }

    fun calculateShipping(weight: Double): Double {
        return if (weight <= 1.0) {
            5.0 // Flat rate for weights up to 1kg
        } else {
            5.0 + (weight - 1.0) * 2.0 // Additional rate per kg
        }
    }

    fun checkStock(item: String, stock: Int): String {
        return if (stock > 0) {
            "Item $item is in stock."
        } else {
            "Item $item is out of stock."
        }
    }

    fun selectPaymentMethod(amount: Double): String {
        return if (amount <= 100.0) {
            "Credit Card"
        } else {
            "Bank Transfer"
        }
    }

    fun determineShippingPriority(isExpress: Boolean): String {
        return if (isExpress) {
            "Express Shipping"
        } else {
            "Standard Shipping"
        }
    }

    fun applyCoupon(userType: String): String {
        return if (userType == "New User") {
            "NEWUSER10" // 10% discount for new users
        } else if (userType == "Loyal Customer") {
            "LOYAL15" // 15% discount for loyal customers
        } else {
            "N/A" // No coupon available
        }
    }

    fun calculateTax(price: Double, location: String): Double {
        return if (location == "Local") {
            price * 0.05 // 5% tax for local purchases
        } else {
            price * 0.10 // 10% tax for international purchases
        }
    }

    fun determineReturnPolicy(days: Int): String {
        return if (days <= 30) {
            "Eligible for return"
        } else {
            "Return period expired"
        }
    }

    fun checkMinimumOrder(quantity: Int): Boolean {
        return if (quantity >= 3) {
            true // Order is valid
        } else {
            false // Order does not meet minimum quantity
        }
    }

    fun categorizeProduct(price: Double): String {
        return if (price < 50) {
            "Budget"
        } else if (price <= 200) {
            "Mid-Range"
        } else {
            "Premium"
        }
    }

    fun isOrderVariety(orderItems: List<String>): Boolean {
        return if (orderItems.toSet().size > 1) {
            true // Order contains multiple distinct items
        } else {
            false // Order contains only one type of item
        }
    }

    fun determineShipmentStatus(type: String, deliveryDays: Int): String {
        return if (type == "Express") {
            if (deliveryDays <= 1) {
                "On Time"
            } else {
                "Delayed"
            }
        } else if (type == "Standard") {
            if (deliveryDays <= 5) {
                "On Time"
            } else {
                "Delayed"
            }
        } else {
            "Unknown Shipment Type"
        }
    }


}