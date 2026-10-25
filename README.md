# BenkeyShop — Java Maven Desktop Kasir (OOP)

Proyek untuk NetBeans 31, JDK 21, dan MySQL XAMPP. Tema dark-minimal dengan aksen hijau sage futuristik.

## Konsep OOP
Proyek memisahkan tanggung jawab ke beberapa class:
- `Product.java`: entity/model produk (enkapsulasi atribut).
- `CartItem.java` dan `CartService.java`: objek item dan aturan bisnis keranjang.
- `Sale.java` dan `SaleLine.java`: model transaksi serta snapshot detail pembelian.
- `ProductDAO.java`: akses data CRUD/pencarian produk melalui JDBC.
- `ReceiptPrinter.java`: pemformatan dan pencetakan struk.
- `DB.java`: koneksi database.
- `Main.java`: aplikasi desktop Swing.

Pemisahan model, layanan, akses data, cetak struk, dan antarmuka membuat kode lebih mudah dipahami dan dikembangkan daripada satu class tunggal. Prinsip yang digunakan meliputi enkapsulasi, abstraksi melalui DAO, dan pemisahan tanggung jawab.

## Fitur aplikasi
- CRUD produk dan pencarian.
- Lima produk awal: Kopi Benkey, Teh Lemon, Roti Cokelat, Keripik Kentang, Air Mineral.
- Keranjang belanja, ubah jumlah, validasi stok dan pembayaran.
- Nama pembeli pada transaksi.
- Cetak struk pembelian.
- Dashboard omzet/transaksi harian dan stok menipis.
- Laporan berdasarkan rentang tanggal, omzet, rata-rata transaksi, serta ekspor CSV.

## Riwayat transaksi tetap aman
Tabel `sale_items` menyimpan `sku_snapshot`, `product_name_snapshot`, `unit_price`, kuantitas, dan total saat transaksi dibuat. Nama dan harga struk lama tidak diambil dari data produk terbaru. `product_id` hanya relasi opsional dengan `ON DELETE SET NULL`; mengedit/menghapus produk tidak mengubah snapshot transaksi.

## Instalasi
1. Ekstrak ZIP.
2. Buka XAMPP dan jalankan MySQL.
3. Masuk ke `http://localhost/phpmyadmin`, lalu impor `database/benkeyshop.sql`.
4. Periksa `src/main/resources/db.properties`. Default XAMPP: user `root`, password kosong, port 3306.
5. NetBeans 31 → File → Open Project → pilih folder yang berisi `pom.xml`.
6. Pastikan JDK 21 aktif, tunggu Maven mengunduh dependensi, lalu jalankan proyek.
7. Alternatif terminal: `mvn clean compile exec:java`.

Masukkan harga dan pembayaran sebagai angka tanpa pemisah, misalnya `12000` atau `50000`. Lakukan transaksi percobaan terlebih dahulu.
