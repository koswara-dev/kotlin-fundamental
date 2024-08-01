`Map` di Kotlin adalah collection yang digunakan untuk menyimpan pasangan kunci-nilai (key-value pairs). Berikut ini beberapa penggunaan umum dari `Map` di Kotlin:

### Penggunaan Umum Map

1. **Menyimpan Data dengan Kunci Unik**:
    - `Map` sangat berguna ketika Anda ingin mengasosiasikan nilai dengan kunci unik, misalnya ID produk dengan nama produk, atau kode negara dengan nama negara.

2. **Akses Cepat ke Nilai**:
    - Anda bisa mendapatkan nilai dengan cepat menggunakan kuncinya tanpa perlu mencari secara manual dalam koleksi.

3. **Mengelompokkan Data Berdasarkan Kategori**:
    - Misalnya, mengelompokkan transaksi berdasarkan jenisnya, atau produk berdasarkan kategori.

### Contoh Penggunaan Map dalam Berbagai Kasus

#### 1. Membuat dan Mengakses `Map`
```kotlin
val countryCodes: Map<String, String> = mapOf(
    "US" to "United States",
    "FR" to "France",
    "JP" to "Japan"
)

fun main() {
    // Akses elemen dengan kunci
    println(countryCodes["US"])  // Output: United States
    println(countryCodes["JP"])  // Output: Japan
}
```

#### 2. Memeriksa Keberadaan Kunci atau Nilai
```kotlin
fun checkCountry(map: Map<String, String>, code: String) {
    if (map.containsKey(code)) {
        println("The country code $code exists with value: ${map[code]}")
    } else {
        println("The country code $code does not exist.")
    }
}

fun main() {
    checkCountry(countryCodes, "US")  // Output: The country code US exists with value: United States
    checkCountry(countryCodes, "IN")  // Output: The country code IN does not exist.
}
```

#### 3. Menambahkan dan Menghapus Elemen pada `MutableMap`
```kotlin
val mutableCountryCodes: MutableMap<String, String> = mutableMapOf(
    "US" to "United States",
    "FR" to "France"
)

fun main() {
    // Menambahkan elemen baru
    mutableCountryCodes["JP"] = "Japan"
    
    // Menghapus elemen
    mutableCountryCodes.remove("FR")
    
    // Mencetak hasil akhir
    for ((code, country) in mutableCountryCodes) {
        println("$code: $country")
    }
}
```

#### 4. Iterasi Pada `Map`
```kotlin
fun printAllCountries(map: Map<String, String>) {
    for ((code, country) in map) {
        println("$code: $country")
    }
}

fun main() {
    printAllCountries(countryCodes)
    // Output:
    // US: United States
    // FR: France
    // JP: Japan
}
```

### Metode dan Fitur Lain untuk Manajemen `Map`
- **Filtering**: Menggunakan metode seperti `filterKeys`, `filterValues`, atau `filter`.
  ```kotlin
  val filteredMap = countryCodes.filterKeys { it.startsWith("U") } 
  println(filteredMap)  // Output: {US=United States}
  ```

- **Transformasi**: Menggunakan metode seperti `mapKeys` atau `mapValues`.
  ```kotlin
  val upperCaseMap = countryCodes.mapValues { it.value.toUpperCase() }
  println(upperCaseMap)
  // Output: {US=UNITED STATES, FR=FRANCE, JP=JAPAN}
  ```

- **Combining Maps**: Menggabungkan dua atau lebih maps menggunakan operator `+`.
  ```kotlin
  val additionalCountries = mapOf("IN" to "India", "CN" to "China")
  val combinedMap = countryCodes + additionalCountries
  println(combinedMap)
  // Output: {US=United States, FR=France, JP=Japan, IN=India, CN=China}
  ```

Dengan memahami berbagai operasi yang bisa dilakukan dengan `Map`, Anda dapat dengan mudah mengelola data berbasis pasangan kunci-nilai dalam aplikasi Kotlin Anda.