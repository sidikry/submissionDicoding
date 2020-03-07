package com.timkontrakan.submission;

import java.util.ArrayList;

public class ProductData {

    private static String[] productNames = {
            "Memulai Pemrograman Dengan Java",
            "Memulai Pemrograman Dengan Python",
            "Memulai Pemrograman Dengan C",
            "Source Code Management Untuk Pemula",
            "Belajar Membuat Aplikasi Kognitif",
            "Memulai Pemrograman Dengan Swift",
            "Memulai Pemrograman Dengan Kotlin",
            "Belajar Membuat Aplikasi Android Untuk Pemula",
            "Belajar Fundamental Aplikasi Android",
            "Belajar Android Jetpack Pro"
    };

    private static String[] productDetails = {
            "Belajar bahasa Java buat kamu yang ingin mempelajari konsep Pemrograman Berorientasi Objek (PBO) terpopuler untuk mengembangkan aplikasi.",
            "Belajar bahasa Python yang menjadi landasan penting berbagai tren industri seperti ilmu data, pemelajaran mesin, dan manajemen infrastruktur",
            "Belajar programming menggunakan bahasa C yang menjadi populer dikarenakan cepat dan mudah untuk dipelajari bagi para pemula.",
            "Pelajari teknik mengelola aplikasi dan berkolaborasi antara developer, dengan menggunakan source code management (version control).",
            "Kelas ini didesain untuk developer yang ingin mempelajari aplikasi kognitif dengan menggunakan teknologi IBM Watson.",
            "Belajar bahasa Swift buat kamu yang ingin mempelajari konsep Pemrograman Berorientasi Objek (PBO) dalam mengembangkan iOS dan OS X.",
            "Kelas pengantar untuk mempelajari functional programming serta Object-Oriented Programming (OOP) menggunakan Kotlin.",
            "Pelajari cara membuat aplikasi pertamamu dengan Android Studio. Kelas ini mengajarkan dasar Android mulai dari Intent sampai RecyclerView.",
            "Pelajari skill Android dengan kurikulum terlengkap yang dibutuhkan oleh perusahaan. Mulai dari design pattern, testing, API sampai database.",
            "Pelajari Android Jetpack dengan berbagai fitur canggih dan sudah diimplementasikan 80% dari 1000 aplikasi terbaik di Google Play Store."
    };

    private static String[] materi = {
            "Pendahuluan: Pengenalan mengenai apa itu Java dan mengapa harus menggunakan Java, serta Anda akan berkenalan dengan IDE untuk membuat aplikasi multiplatform.\n" +
                    "Java Basic : Menjelaskan mengenai dasar-dasar bahasa Java, seperti struktur dasar, tipe data, string, operator, fungsi input output, percabangan, perulangan dan array.",
            "Pendahuluan : Pengenalan mengenai apa itu Python serta filosofi-filosofi yang mendasari bahasa Python.\n" +
                    "Modes & Basic : Menjelaskan mengenai mode operasi dan dasar-dasar bahasa Python, Variable Type dan Dynamic Typing, serta Input Output pada bahasa Python.",
            "Mengenal Bahasa C : Memperkenalkan sejarah C, contoh aplikasi, dan istilah-istilah yang dipakai. Juga dibahas IDE yang disarankan.\n" +
                    "Program Kecil dalam Bahasa C : Mengenalkan bahasa C dengan program terkecil yaitu Halo Dunia.",
            "Tracing : Menelusuri perubahan kode (tracing).\n" +
                    "Annotating : Menelusuri siapa yang melakukan perubahan.\n" +
                    "Branching Management : Mengelola code versioning.",
            "Pengenalan IBM Cloud : Pada materi ini Anda akan berkenalan dengan IBM Cloud dan antarmuka di dalamnya.\n" +
                    "Text & Audio : Pada materi ini Anda akan mempelajari layanan dari IBM Watson untuk mengolah teks dan audio, seperti speech-to-text, text-to-speech, dan tone analyzer.",
            "Pengenalan : Mengenalkan bahasa Swift serta environment yang dibutuhkan untuk mempelajari bahasa pemrograman Swift.\n" +
                    "Dasar Swift : Menjelaskan dasar-dasar Swift seperti penggunaan constanta dan variable, comment, semicolon dll. Anda juga akan mempelajari bagaimana mencetak sebuah teks ke dalam console.",
            "Pengenalan Kotlin : Memperkenalkan sejarah Kotlin, mengapa harus mempelajari Kotlin, karakteristik Kotlin, dan bagaimana Kotlin berperan dalam pengembangan aplikasi. Akan dibahas juga tentang ekosistem Kotlin.",
            "Pengenalan Android Studio : Penjelasan tentang bagaimana menginstal Android Studio dan pengenalan dengan komponen-komponen yang sering dipakai di dalamnya. Ini akan memudahkan Anda untuk mengikuti latihan selanjutnya.\n",
            "Prinsip Dasar Android : Mempelajari dasar-dasar pemrogaman Android yang wajib diketahui, seperti Activity, Fragment, macam-macam Intent, dan ListView.\n"+
                    "UI dan UX Aplikasi : Mempelajari cara mendesain aplikasi yang menarik dengan menggunakan layout, style, theme, localization, CustomView dan RecyclerView.",
            "Pengenalan Android Jetpack : Menjelaskan fitur-fitur, keisitimewaan dan keuntungan dari Android Jetpack, serta komponen komponen di dalamnya yang dibagi menjadi empat yakni Behavior, Foundation, Architecture dan UI.\n"
    };

    private static int[] productImage = {
            R.drawable.ic_java,
            R.drawable.ic_python,
            R.drawable.ic_c,
            R.drawable.ic_code,
            R.drawable.ic_brain,
            R.drawable.ic_swift,
            R.drawable.ic_kotlin,
            R.drawable.ic_android,
            R.drawable.ic_robot,
            R.drawable.ic_jetpack
    };

    static ArrayList<Product> getListData(){
        ArrayList<Product> products = new ArrayList<>();
        for (int i=0; i<productNames.length; i++){
            Product product = new Product();
            product.setName(productNames[i]);
            product.setDetail(productDetails[i]);
            product.setPhoto(productImage[i]);
            product.setMateri(materi[i]);

            products.add(product);
        }
        return products;
    }
}
