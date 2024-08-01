Pada platform e-commerce, `List` di Kotlin bisa digunakan untuk berbagai tujuan. Berikut adalah beberapa contoh bagaimana `List` dapat digunakan dalam konteks e-commerce:

### 1. **Daftar Produk**
Anda bisa mengelola daftar produk yang tersedia di toko.

```kotlin
val products: List<Product> = listOf(
    Product("P001", "Laptop", 999.99, "High-performance laptop"),
    Product("P002", "Smartphone", 599.99, "Latest model smartphone")
)

data class Product(val id: String, val name: String, val price: Double, val description: String)
```

### 2. **Keranjang Belanja (Shopping Cart)**
Menggunakan `List` untuk menyimpan produk-produk yang telah ditambahkan oleh pengguna ke keranjang belanja mereka.

```kotlin
val cartItems: MutableList<CartItem> = mutableListOf()

data class CartItem(val productId: String, val quantity: Int)
```

### 3. **Riwayat Pesanan**
Menyimpan riwayat pesanan pelanggan dalam bentuk daftar pesanan.

```kotlin
val orderHistory: List<Order> = listOf(
    Order("O001", "C001", listOf("P001", "P002"), "Delivered"),
    Order("O002", "C002", listOf("P003"), "Shipped")
)

data class Order(val orderId: String, val customerId: String, val productIds: List<String>, val status: String)
```

### 4. **Daftar Kategori Produk**
Anda bisa menggunakan `List` untuk menyimpan berbagai kategori produk yang terdapat di toko.

```kotlin
val categories: List<String> = listOf("Electronics", "Books", "Clothing", "Home & Kitchen")
```

### 5. **Penilaian dan Ulasan Produk**
Menyimpan penilaian dan ulasan produk yang diberikan oleh pelanggan.

```kotlin
val reviews: List<Review> = listOf(
    Review("R001", "P001", "C001", 5, "Great product!"),
    Review("R002", "P002", "C002", 4, "Good value for money.")
)

data class Review(val reviewId: String, val productId: String, val customerId: String, val rating: Int, val comment: String)
```

### 6. **Daftar Wishlist Pelanggan**
Menyimpan daftar produk yang ingin dibeli oleh pelanggan di kemudian hari.

```kotlin
val wishlist: MutableList<String> = mutableListOf("P001", "P003", "P005")
```

### Contoh Penggunaan Praktis dalam Kode

#### Menambahkan Produk ke Keranjang Belanja
```kotlin
fun addToCart(productId: String, quantity: Int) {
    cartItems.add(CartItem(productId, quantity))
}

fun main() {
    addToCart("P001", 2)
    addToCart("P002", 1)
    
    println(cartItems)
    // Output: [CartItem(productId=P001, quantity=2), CartItem(productId=P002, quantity=1)]
}
```

#### Menghitung Total Harga di Keranjang Belanja
```kotlin
fun calculateTotalPrice(): Double {
    val productPrices = mapOf(
        "P001" to 999.99,
        "P002" to 599.99
    )

    return cartItems.sumByDouble { item -> 
        val price = productPrices[item.productId] ?: 0.0
        price * item.quantity
    }
}

fun main() {
    addToCart("P001", 2)
    addToCart("P002", 1)
    
    val totalPrice = calculateTotalPrice()
    println("Total Price: $$totalPrice")
    // Output: Total Price: $2599.97
}
```

#### Menampilkan Daftar Produk Berdasarkan Kategori
```kotlin
fun getProductsByCategory(category: String): List<Product> {
    val categoryProducts = mapOf(
        "Electronics" to listOf(
            Product("P001", "Laptop", 999.99, "High-performance laptop"),
            Product("P002", "Smartphone", 599.99, "Latest model smartphone")
        ),
        "Books" to listOf(
            Product("P003", "Mystery Book", 19.99, "A thrilling mystery novel"),
            Product("P004", "Science Book", 29.99, "An informative science book")
        )
    )

    return categoryProducts[category] ?: emptyList()
}

fun main() {
    val electronics = getProductsByCategory("Electronics")
    val books = getProductsByCategory("Books")
    
    println(electronics)
    // Output: [Product(id=P001, name=Laptop, price=999.99, description=High-performance laptop), Product(id=P002, name=Smartphone, price=599.99, description=Latest model smartphone)]
    println(books)
    // Output: [Product(id=P003, name=Mystery Book, price=19.99, description=A thrilling mystery novel), Product(id=P004, name=Science Book, price=29.99, description=An informative science book)]
}
```

Dengan contoh-contoh ini, Anda bisa melihat bahwa `List` di Kotlin sangat serbaguna dan dapat membantu mengelola berbagai data penting dalam aplikasi e-commerce dengan lebih efisien.