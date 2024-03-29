package com.indevelopment.composerlist.Data;

import com.indevelopment.composerlist.Model.Composer;

import java.util.ArrayList;

public class ComposerData {
    private static String[][] datas =
        {
            {"Wolfgang Amadeus Mozart", "Wolfgang Amadeus Mozart (bahasa Jerman: [ˈvɔlfɡaŋ amaˈdeus ˈmoːtsaʁt]) dianggap sebagai salah satu dari komponis musik klasik Eropa yang terpenting dan paling terkenal dalam sejarah. Karya-karyanya (sekitar 700 lagu) termasuk gubahan-gubahan yang secara luas diakui sebagai puncak karya musik simfoni, musik kamar, musik piano, musik opera, dan musik paduan suara. Contoh karyanya adalah opera Don Giovanni dan Die Zauberflöte. Banyak dari karya Mozart dianggap sebagai repertoar standar konser klasik dan diakui sebagai mahakarya musik zaman klasik. Karya-karyanya diurutkan dalam katalog Köchel-Verzeichnis.", "Salzburg, 27 Januari 1756", "Wina, Austria, 5 Desember 1791 (umur 35)", "https://upload.wikimedia.org/wikipedia/commons/a/aa/Martini_bologna_mozart_1777.jpg"},
            {"Ludwig van Beethoven", "Ludwig van Beethoven (/ˈlʊdvɪɡ væn ˈbeɪˌtoʊvən/; bahasa Jerman: [ˈluːtvɪç fan ˈbeːtˌhoˑfn̩]) adalah seorang komponis musik klasik dari Jerman. Karyanya yang terkenal adalah simfoni ke-lima dan ke-sembilan, dan juga lagu piano Für Elise. Ia dipandang sebagai salah satu komponis yang terbesar dan merupakan tokoh penting dalam masa peralihan antara Zaman Klasik dan Zaman Romantik. Semasa muda, ia adalah pianis yang berbakat, populer di antara orang-orang penting dan kaya di Wina, Austria, tempatnya tinggal. Namun, pada tahun 1801, ia mulai kehilangan pendengarannya.", "Bonn, Elektorat Cologne, 17 Desember 1770", "Wina, Kekaisaran Austria, 26 Maret 1827 (umur 56)", "https://upload.wikimedia.org/wikipedia/commons/6/6f/Beethoven.jpg"},
            {"Johann Sebastian Bach", "Johann Sebastian Bach adalah seorang komponis Jerman. Ia menggubah musik untuk alat musik organ, harpsichord, clavichord, dan juga untuk orkestra. Ia telah menggubah lebih dari 1000 lagu. Set lagu oleh Bach Brandenburg Concertos, lagu gereja Mass in B minor, adalah yang paling terkenal.", "Eisenach, Jerman, 21 Maret 1685", "Leipzig, Jerman, 28 Juli 1750 (umur 65)", "https://upload.wikimedia.org/wikipedia/commons/6/6a/Johann_Sebastian_Bach.jpg"},
            {"Franz Joseph Haydn", "Franz Joseph Haydn adalah salah seorang komponis yang paling berpengaruh dari Zaman Klasik yang dijuluki \"Bapak Simfoni\" atau \"Bapak Kuartet Gesek\". Haydn menghabiskan sebagian besar kariernya sebagai musikus untuk keluarga Eszterházy di kediaman mereka yang sulit dijangkau di Austria. Terisolasi dari komponis-komponis lain dan tren musik sampai saat menjelang akhir hayatnya, ia dipaksa untuk, menggunakan istilahnya, \"menjadi orisinil\". Ia merupakan teman dan mentor dari Mozart, tutor dari Beethoven, dan kakak dari komposer Michael Haydn.", "Rohrau, Austria, 31 Maret 1732", "Eisenstadt, Austria, 31 Mei 1809 (umur 77)", "https://upload.wikimedia.org/wikipedia/commons/0/05/Joseph_Haydn.jpg"},
            {"George Friedrich Händel", "George Friedrich Händel (dalam bahasa Inggris ditulis George Frideric Handel) adalah seorang komponis musik Barok Jerman yang menghabiskan sebagian besar masa hidupnya di Britania Raya. Dia dianggap sebagai pencipta terkemuka dalam musik concerti grossi, opera dan oratorio. Contoh karyanya yang terkenal adalah Water Music, Fireworks Music dan oratorio Messiah. Dia adalah komponis besar yang diagungkan oleh banyak gereja, baik Protestan, Katolik dan Anglikan.", "Halle, 23 Februari 1685", "London, 14 April 1759 (umur 74)", "https://upload.wikimedia.org/wikipedia/commons/f/fa/George_Frideric_Handel_by_Balthasar_Denner.jpg"},
            {"Johannes Brahms", "Johannes Brahms adalah seorang komponis dan pianis dari Jerman, salah satu musisi utama pada zaman Romantik. Pada masa hidupnya, Brahms sangat populer dan berpengaruh dalam dunia musik. Brahms membuat komposisi musik untuk piano, ansambel musik kamar, orkestra simfoni, dan untuk penyanyi serta paduan suara. Sebagai seorang pianis yang mahir, ia sering kali menampilkan sendiri karya-karyanya secara perdana; dia juga bekerja sama dengan penampil-penampil utama pada masanya, termasuk pianis Clara Schumann (istri komponis Robert Schumann). Banyak karyanya merupakan bagian dari repertoar standar konser klasik hingga saat ini. Salah satu karyanya yang paling terkenal ialah Wiegenlied, Op. 49 No. 4 (\"Lagu Nina Bobo\", dalam bahasa Inggris dikenal sebagai Brahms' Lullaby).", "Hamburg, Jerman, 7 Mei 1833", "Wina, Austria, 3 April 1897 (umur 63)", "https://upload.wikimedia.org/wikipedia/commons/1/15/JohannesBrahms.jpg"},
            {"Franz Liszt", "Franz Liszt (Ferenc Liszt) adalah seorang komposer, pianis, pengaba, dan guru musik asal Hungaria pada abad ke-19. Semasa hidupnya, Liszt menulis sekitar 700 komposisi musik, termasuk di dalamnya lagu gerejawi dan puisi simfonis. Selain itu, Liszt juga telah mengajar 400 murid dan memperkenalkan bentuk musik baru di era Romantisisme serta merupakan salah satu pianis terbesar dalam sejarah.", "Raiding, Hungaria, 22 Oktober 1811", "Bayreuth, Jerman, 31 Juli 1886", "https://upload.wikimedia.org/wikipedia/commons/3/3a/Franz_Liszt_by_Nadar%2C_March_1886.png"}
        };

    public static ArrayList<Composer> getComposers() {
        Composer composer;
        ArrayList<Composer> composers = new ArrayList<>();
        for(String[] data : datas) {
            composer = new Composer(data[0], data[1], data[2], data[3], data[4]);
            composers.add(composer);
        }

        return composers;
    }
}
