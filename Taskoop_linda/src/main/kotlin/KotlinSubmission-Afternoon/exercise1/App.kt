package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
    fun myProfile() {
        val firstName: String = "Linda"
        val lastName: String = "Erlinda Sari"
        val nickName: String = " lin"
        val age: Number = 19
        val status: Boolean = true

        println("Nama Depan: $firstName")
        println("Nama Belakang: $lastName")
        println("Nama Panggilan : $nickName")
        println("Umur: $age tahun")
        println("Status: ${if (status) "Single" else "tidak"}")
        println("")


    }



/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    val groupId = "NusaVote"
    val groupMember = listOf("*Hustler: Haris Munahar (Web)\n"+
                        "*Scrum Master :\n" +
                        "Birull Hasibuan (Mobile)","Wahyu Prayoga (Web)\n"+
                        "*Hipster :\n" +
                        "1.Muhammad Fachrizal A.(Mobile)\n" +
                        "2.Linda Erlinda Sari (Mobile)\n" +
                        "3.Nurdila (Web) \n" +
                        "4.Galih Yoga Abimanyu (Web)\n" +
                        "5.Fawwaz Mubarak (Web)\n" +
                        "Hacker :\n" +
                        "1.lfian Diva Awangga (Mobile)\n" +
                        "2.Kristo Pandapotan Samosir (Mobile)\n" +
                        "3.I Nengah Pranata Adhi S (Website)")

    val session = "Afternoon (B)"

    println("Group ID: $groupId")
    println("Group Members: $groupMember")
    println("Session: $session")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val groupMember = listOf("Birull Hasibuan",
                             "Linda Erlinda Sari",
                             "Muhammad Fachrizal A",
                             "Alfian Diva Awangga",
                             "Kristo Pandapotan Samosir")

    val myName = groupMember [1]
    println("Nama Saya : $myName")
    return groupMember
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fu ngsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Peja","Ilham")
    val countOfGroup = arrayOf<String>("-Haris Munahar\n",
                                       "-Birull Hasibuan\n",
                                        "-Wahyu Prayoga\n",
                                        "-Muhammad Fachrizal A\n",
                                        "-Linda Erlinda Sari\n",
                                        "-Nurdila\n",
                                        "-Galih Yoga Abimanyu\n",
                                        "-Fawwaz Mubarak\n",
                                        "-Alfian Diva Awangga\n",
                                        "-Kristo Pandapotan Samosir\n","I Nengah Pranata Adhi S")
    val total = mentor.size + countOfGroup.size
    println("")
    return total
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("", listOf(), "")

}