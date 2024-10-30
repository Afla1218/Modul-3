import java.util.ArrayList;
import java.util.Scanner;



/**
 * Program RKontakSederhana adalah aplikasi sederhana untuk mengelola daftar kontak.
 * Aplikasi ini memungkinkan pengguna untuk menambah, melihat, dan menghapus kontak
 * dengan antarmuka menu berbasis teks.
 */
public class RKontakSederhana {
    /**
     * Metode utama untuk menjalankan program kontak sederhana.
     *
     * @param args argumen baris perintah (tidak digunakan)
     *
     */
    public static void main(String[] args) {
        ArrayList<String> kontak = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean selesai = false;

        while (!selesai) {
            int pilihan = Tampilkanmenu.TampilkanMenu(scan);

            if (pilihan == 1) {
                TambahKontak(scan, kontak);
            } else if (pilihan == 2) {
                lihatKontak(kontak);
            } else if (pilihan == 3) {
                HapusKontak(scan, kontak);
            } else if (pilihan == 4) {
                selesai = true;
                System.out.println("Program selesai.");
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }

    /**
     * Menambah kontak baru ke daftar kontak.
     *
     * @param scan  objek Scanner untuk membaca input pengguna
     * @param kontak daftar kontak yang akan diperbarui
     * @see #TambahKontak(Scanner, ArrayList) fungsi ini harus diisi integer
     */
    private static void TambahKontak(Scanner scan, ArrayList<String> kontak) {
        System.out.print("Masukkan nama kontak: ");
        scan.nextLine(); // Mengkonsumsi newline
        String namaKontak = scan.nextLine();
        kontak.add(namaKontak);
        System.out.println("Kontak ditambahkan.");
    }

    /**
     * Menampilkan daftar kontak yang tersimpan.
     *
     * @param  kontak daftar kontak yang akan ditampilkan
     */
    private static void lihatKontak(ArrayList<String> kontak) {
        System.out.println("Daftar Kontak:");
        for (int i = 0; i < kontak.size(); i++) {
            System.out.println((i + 1) + ". " + kontak.get(i));
        }
    }

    /**
     * Menghapus kontak berdasarkan nomor yang dimasukkan pengguna.
     *
     * @param scan  objek Scanner untuk membaca input pengguna
     * @param kontak daftar kontak yang akan diperbarui
     */
    private static void HapusKontak(Scanner scan, ArrayList<String> kontak) {
        System.out.println("Masukkan nomor kontak yang ingin dihapus:");
        int nomor = scan.nextInt();
        scan.nextLine(); // Mengkonsumsi newline
        if (nomor > 0 && nomor <= kontak.size()) {
            kontak.remove(nomor - 1);
            System.out.println("Kontak dihapus.");
        } else {
            System.out.println("Nomor kontak tidak valid.");
        }
    }

}
