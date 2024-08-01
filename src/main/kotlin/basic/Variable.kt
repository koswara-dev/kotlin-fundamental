package com.juaracoding.basic

fun main() {
    // Variabel dan tipe data
    var nama: String = "John Doe"
    val umur: Int = 25

    // Operasi dasar
    println("Halo, $nama! Umur kamu adalah $umur tahun.")

    // Input dan output
    println("Masukkan angka pertama:")
    val angka1 = readLine()!!.toInt()
    println("Masukkan angka kedua:")
    val angka2 = readLine()!!.toInt()
    val hasil = angka1 + angka2
    println("Hasil penjumlahan $angka1 + $angka2 adalah $hasil")
}
