package com.dendi.organ.`object`

import com.dendi.organ.R
import com.dendi.organ.data.Organ

object DataOrgan {
    private val organNames = arrayOf(
        "Otak",
        "Jantung",
        "Paru-paru",
        "Gijal",
        "Hati",
        "Usus Halus",
        "Usus Besar",
        "Kantung Empedu",
        "Lambung",
        "Saluran Pankreas")
    private val latinOrganName = arrayOf(
        "Ensephalon",
        "Cor, Kardia",
        "Pulmo, Pneumon",
        "Renes, Nephros",
        "Hepar",
        "Intestinum",
        "Kolon",
        "Gallbladder",
        "Stomach, Maag",
        "d=Ductus Pancreaticus")
    private val organImages = arrayOf( R.drawable.otak,
         R.drawable.organ_jantung,
         R.drawable.organ_paru_paru,
         R.drawable.organ_ginjal,
         R.drawable.organ_hati,
         R.drawable.organ_usus_halus,
         R.drawable.organ_usus_besar,
         R.drawable.organ_kantung_empedu,
         R.drawable.organ_lambung,
         R.drawable.organ_pankreas)
    private val organDetails = arrayOf(
        "Otak manusia adalah struktur pusat pengaturan yang memiliki volume sekitar 1.350cc dan terdiri atas 100 juta sel saraf atau neuron. " +
            "Otak mengatur dan mengkoordinir sebagian besar, gerakan, perilaku dan fungsi tubuh homeostasis seperti detak jantung, tekanan darah, keseimbangan cairan tubuh dan suhu tubuh. " +
            "Otak manusia bertanggung jawab terhadap pengaturan seluruh badan dan pemikiran manusia. " +
            "Oleh karena itu terdapat kaitan erat antara otak dan pemikiran. Otak dan sel saraf di dalamnya dipercayai dapat memengaruhi kognisi manusia. " +
            "Pengetahuan mengenai otak memengaruhi perkembangan psikologi kognitif. Otak juga bertanggung jawab atas fungsi seperti pengenalan, emosi, ingatan, pembelajaran motorik dan segala bentuk pembelajaran lainnya."
        ,"Jantung adalah otot yang terbagi menjadi empat ruang. Dua ruang terletak di bagian atas, " +
            "yaitu atrium (serambi) kanan dan kiri. " +
            "Sedangkan dua ruang lagi terletak di bagian bawah, yaitu ventrikel (bilik) kanan dan kiri. " +
            "Antara ruang kanan dan kiri dipisahkan oleh dinding otot (septum) yang berfungsi mencegah tercampurnya darah yang kaya oksigen dengan darah yang miskin oksigen."
        ,"Paru-paru merupakan organ respirasi (pernapasan) yang berhubungan dengan sistem pernapasan dan sirkulasi (peredaran darah) dalam tubuh vertebrata yang bernapas dengan udara. " +
            "Fungsinya adalah menukar oksigen dari udara dengan karbon dioksida dari darah. " +
            "Prosesnya disebut \"pernapasan eksternal\" atau bernapas. " +
            "Jika paru-paru terganggu fungsinya, kesehatan tubuh manusia bisa terpengaruh secara keseluruhan."
        ,"Ginjal adalah sepasang organ saluran kemih yang terletak di rongga retroperitoneal bagian atas. " +
            "Bentuknya menyerupai kacang dengan sisi cekungnya menghadap ke medial. " +
            "Kedua ginjal terletak di sekitar vertebra T12 hingga L3. " +
            "Ginjal kanan biasanya terletak sedikit di bawah ginjal kiri untuk memberi tempat untuk hati. " +
            "Ginjal kanan juga biasanya lebih kecil daripada ginjal kiri.\n" +
            "Ginjal kanan terletak langsung di bawah diafragma dan di belakang hati. " +
            "Ginjal kiri terletak di bawah diafragma dan di belakang limpa. Di sebelah atas ginjal terdapat kelenjar adrenal."
        ,"Hati merupakan sebuah kelenjar yang \"terbesar\" di dalam tubuh manusia, " +
            "ini terletak dalam rongga perut sebelah kanan, tepatnya di bawah diafragma. " +
            "Berdasarkan fungsinya, hati juga termasuk sebagai alat ekskresi. " +
            "Hal ini dikarenakan hati membantu fungsi ginjal dengan cara memecah beberapa senyawa " +
            "yang bersifat racun dan menghasilkan amonia, urea, dan asam urat dengan memanfaatkan nitrogen dari asam amino. " +
            "Proses pemecahan senyawa racun oleh hati disebut proses detoksifikasi."
        ,"Usus halus atau usus kecil adalah bagian dari saluran pencernaan yang terletak di antara lambung dan usus besar. " +
            "Usus halus terdiri dari tiga bagian yaitu usus dua belas jari (duodenum), usus kosong (jejunum), " +
            "dan usus penyerapan (ileum). Pada usus dua belas jari terdapat dua muara saluran yaitu dari pankreas dan kantung empedu."
        ,"Usus besar atau kolon dalam anatomi adalah bagian usus antara usus buntu dan rektum. " +
            "Fungsi utama organ ini adalah menyerap air dari feses. Pada mamalia, kolon terdiri dari kolon menanjak (ascending), " +
            "kolon melintang (transverse), kolon menurun (descending), kolon sigmoid, dan rektum. " +
            "Bagian kolon dari usus buntu hingga pertengahan kolon melintang sering disebut dengan \"kolon kanan\", " +
            "sedangkan bagian sisanya sering disebut dengan \"kolon kiri\"."
        ,"Kantung empedu atau kandung empedu (Bahasa Inggris: gallbladder) adalah organ berbentuk buah pir dimana empedu disimpan " +
            "dan dikonsentrasi sebelum disekresi ke dalam usus dua belas jari untuk digunakan dalam proses pencernaan. " +
            "Pada manusia, kantung empedu bisa ditemukan di bawah hati, walaupun struktur dan posisinya dapat berbeda " +
            "di setiap spesies binatang. Kantung empedu menerima dan menyimpan empedu, yang dibuat oleh hati, " +
            "melalui duktus hepatikus, dan mengeluarkan melalui duktus koledukus ke usus dua belas jari, " +
            "dimana empedu membantu proses pencernaan lemak."
        ,"Lambung (bahasa Inggris: stomach; bahasa Belanda: maag) atau ventrikulus berupa suatu kantong yang terletak di bawah sekat rongga badan.\n" +
            "Fungsi lambung secara umum adalah tempat di mana makanan dicerna dan sejumlah kecil sari-sari makanan diserap.\n" +
            "Pada manusia dewasa, volume lambung dalam keadaan santai, hampir kosong, adalah sekitar 75 mililiter. " +
            "Merupakan organ tubuh yang dapat mengembang (distensible), dapat menampung sampai sekitar satu liter makanan. " +
            "Lambung bayi manusia yang baru lahir hanya dapat menampung sekitar 30 mililiter."
        ,"Pankreas adalah organ aksesoris pada sistem pencernaan yang memiliki dua fungsi utama: " +
            "menghasilkan enzim pencernaan atau fungsi eksokrin serta menghasilkan beberapa hormon atau fungsi endokrin. " +
            "Pankreas terletak pada kuadran kiri atas abdomen atau perut " +
            " dan bagian kaput/kepalanya menempel pada organ duodenum. " +
            "Produk enzim akan disalurkan dari pankreas ke duodenum melalui saluran pankreas utama."
    )


    val listData: ArrayList<Organ>
        get() {
            val list = arrayListOf<Organ>()
            for (position in organNames.indices) {
                val hero = Organ()
                hero.name = organNames[position]
                hero.latinName = latinOrganName[position]
                hero.detail = organDetails[position]
                hero.photo = organImages[position]
                list.add(hero)
            }
            return list
        }
}