import java.util.Scanner;

/**
 * Kelas Tampilkanmenu menyediakan metode untuk menampilkan menu kepada pengguna
 * dan mengambil input pilihan dari pengguna.
 */
public class Tampilkanmenu {

    /**
     * Menampilkan menu pilihan kepada pengguna dan mengembalikan pilihan yang dimasukkan.
     *
     * @param scan objek Scanner untuk membaca input pengguna
     * @return pilihan yang dimasukkan pengguna
     */
    static int TampilkanMenu(Scanner scan) {
        System.out.println("1. Tambah Kontak");
        System.out.println("2. Lihat Semua Kontak");
        System.out.println("3. Hapus Kontak");
        System.out.println("4. Keluar");
        System.out.print("Pilih opsi: ");
        int pilihan = scan.nextInt();
        scan.nextLine(); // Mengkonsumsi newline
        return pilihan;
    }
}
