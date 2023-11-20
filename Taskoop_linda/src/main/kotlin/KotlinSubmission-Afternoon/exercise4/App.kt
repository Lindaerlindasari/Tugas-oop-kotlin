package id.infinitelearning.KotlinSubmission.exercise4


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

    fun main() {
        println("Masukkan nilai IPK:")
        val input = readLine() // Mendapatkan input dari pengguna
        var nilai: Double = 0.0 // Variabel untuk menyimpan nilai rata-rata setelah parsing

        try {
            // Mengubah nilai string input menjadi Double
            nilai = input?.toDouble() ?: 0.0

            // Menentukan besaran beasiswa berdasarkan nilai rata-rata
            val besaranBeasiswa = when {
                nilai >= 3.7 -> "Anda mendapatkan Beasiswa Penuh"
                nilai >= 3.5 -> "Anda mendapatkan Beasiswa 75%"
                nilai >= 3.3 -> "Anda mendapatkan Beasiswa 50%"
                nilai >= 2.9 -> "Beasiswa anda sebesar 25%"
                else -> "Anda Tidak memenuhi syarat untuk beasiswa"
            }

            println("Keterangan : $besaranBeasiswa")
        } catch (e: NumberFormatException) {
            println("Terjadi kesalahan: Masukan tidak valid.")
        }
    }
