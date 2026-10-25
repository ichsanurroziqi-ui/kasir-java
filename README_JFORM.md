# BenkeyShop — versi NetBeans JFrame Form

Project Java Maven berbasis OOP untuk NetBeans 31 dan JDK 21. Form pembuka ada di `src/main/java/com/benkeyshop/MainForm.java` beserta `MainForm.form`; buka file `MainForm.java` lalu pilih tab **Design** untuk mengubah form pembuka melalui GUI Builder.

## Menjalankan
1. Ekstrak ZIP.
2. Buka NetBeans 31 → **File → Open Project** → pilih folder `BenkeyShop`.
3. Pastikan JDK 21 dipilih dan Maven selesai mengunduh dependency.
4. Jalankan XAMPP, aktifkan MySQL.
5. Impor `database/benkeyshop.sql` lewat phpMyAdmin.
6. Periksa `src/main/resources/db.properties`; sesuaikan username/password MySQL jika berbeda.
7. Jalankan project. Form pembuka akan tampil; klik **Buka Aplikasi Kasir**.

## Isi aplikasi
- Ringkasan penjualan hari ini dan stok menipis
- Kasir, nama pembeli, keranjang, pembayaran, dan cetak struk
- CRUD produk + pencarian
- Laporan penjualan berdasarkan tanggal dan ekspor CSV
- Class OOP dipisahkan untuk produk, DAO, keranjang, penjualan, database, dan struk
- Riwayat menyimpan snapshot SKU/nama/harga, sehingga perubahan atau penghapusan produk tidak mengubah detail transaksi lama

**Catatan penting:** `MainForm.form` adalah form pembuka yang dapat diedit di NetBeans Design. Antarmuka kasir utama saat ini masih dibangun melalui kode Swing di `Main.java`, bukan melalui GUI Builder. Dependensi database perlu dikonfigurasi dan project belum diverifikasi dengan build Maven di lingkungan pembuat ZIP.
