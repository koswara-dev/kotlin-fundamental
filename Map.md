Pada platform e-commerce, `Map` di Kotlin dapat digunakan untuk berbagai tujuan. Berikut adalah beberapa contoh spesifik bagaimana `Map` dapat digunakan dalam konteks e-commerce:

### 1. **Mengelola Daftar Produk**
Setiap produk dapat memiliki ID unik yang dipetakan ke informasi produk seperti nama, harga, deskripsi, dll.

```kotlin
val products: MutableMap<String, Product> = mutableMapOf(
    "P001" to Product("P001", "Laptop", 999.99, "High-performance laptop"),
    "P002" to Product("P002", "Smartphone", 599.99, "Latest model smartphone")
)

data class Product(val id: String, val name: String, val price: Double, val description: String)
```

### 2. **Menyimpan Informasi Pelanggan**
Anda bisa menyimpan data pelanggan dengan menggunakan ID pelanggan sebagai kunci dan detail pelanggan sebagai nilai.

```kotlin
val customers: Map<String, Customer> = mapOf(
    "C001" to Customer("C001", "Alice", "alice@example.com"),
    "C002" to Customer("C002", "Bob", "bob@example.com")
)

data class Customer(val id: String, val name: String, val email: String)
```

### 3. **Pengelompokan Pesanan berdasarkan Status**
Anda bisa menggunakan `Map` untuk mengelompokkan pesanan berdasarkan statusnya (Pending, Shipped, Delivered).

```kotlin
val orders: MutableMap<String, List<Order>> = mutableMapOf(
    "Pending" to listOf(Order("O001", "C001", listOf("P001"), "Pending")),
    "Shipped" to listOf(Order("O002", "C002", listOf("P002"), "Shipped"))
)

data class Order(val orderId: String, val customerId: String, val productIds: List<String>, val status: String)
```

### 4. **Menyimpan Kode Diskon dan Nilai Diskon**
Map bisa digunakan untuk menyimpan kode diskon yang valid dan jumlah diskon yang terkait.

```kotlin
val discountCoupons: Map<String, Double> = mapOf(
    "DISCOUNT10" to 10.0,
    "DISCOUNT20" to 20.0
)
```

### 5. **Pemetaan Lokasi Gudang dengan Produk**
Anda bisa memetakan lokasi gudang dengan produk yang tersedia di setiap gudang.

```kotlin
val warehouseProducts: Map<String, List<String>> = mapOf(
    "WH001" to listOf("P001", "P003"),
    "WH002" to listOf("P002", "P004")
)
```

### 6. **Menyimpan Riwayat Login Pengguna**
Anda bisa menyimpan riwayat login pengguna dengan ID pengguna sebagai kunci dan daftar waktu login sebagai nilai.

```kotlin
val userLoginHistory: MutableMap<String, List<String>> = mutableMapOf(
    "C001" to listOf("2023-10-01 08:00", "2023-10-02 09:00"),
    "C002" to listOf("2023-10-01 07:00", "2023-10-03 08:30")
)
```

### Contoh Penggunaan Praktis dalam Kode

#### Mengambil Informasi Produk Berdasarkan ID
```kotlin
fun getProductInfo(productId: String): Product? {
    return products[productId]
}

fun main() {
    val product = getProductInfo("P001")
    println(product)
    // Output: Product(id=P001, name=Laptop, price=999.99, description=High-performance laptop)
}
```

#### Memeriksa Apakah Kode Diskon Valid
```kotlin
fun isDiscountValid(code: String): Boolean {
    return discountCoupons.containsKey(code)
}

fun main() {
    val validCode = isDiscountValid("DISCOUNT10")
    println(validCode)  // Output: true

    val invalidCode = isDiscountValid("INVALIDCODE")
    println(invalidCode)  // Output: false
}
```

#### Menambahkan Pesanan Baru ke dalam Map
```kotlin
fun addOrder(order: Order) {
    val status = order.status
    val currentOrders = orders[status]?.toMutableList() ?: mutableListOf()
    currentOrders.add(order)
    orders[status] = currentOrders
}

fun main() {
    val newOrder = Order("O003", "C001", listOf("P001", "P002"), "Pending")
    addOrder(newOrder)
    
    println(orders["Pending"])
    // Output: 
    // [Order(orderId=O001, customerId=C001, productIds=[P001], status=Pending), 
    //  Order(orderId=O003, customerId=C001, productIds=[P001, P002], status=Pending)]
}
```

Dengan berbagai cara ini, `Map` di Kotlin dapat membantu Anda dalam mengorganisir dan mengelola data penting dalam aplikasi e-commerce dengan lebih efisien.