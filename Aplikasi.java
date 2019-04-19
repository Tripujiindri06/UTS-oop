import java.util.LinkedList;
import java.util.Scanner;
import model.*;
import service.*;

public class Aplikasi {

    private static Scanner scanner;
    private static SuratmasukService service;

    public static void main(String args[]) {
        int opsi = 0;
        scanner = new Scanner(System.in);
        service = new SuratmasukService();

        do {
            cetakMenu();
            opsi = scanner.nextInt();
            switch(opsi) {
                case 1 :
                  modulAdd();
                  break;
                case 2 :
                  ubahData(); break;
                case 3 :
                  hapusData(); break;
                case 4 :
                  tampilData();
                  break;
            }
        } while(opsi != 0);

    }

    private static void cetakMenu() {
        System.out.println("\n\n");
        System.out.println("APLIKASI SURAT MASUK");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan data");
        System.out.println("-----------");
        System.out.println("0. KELUAR");
        System.out.println("\n");
        System.out.print("Pilihan > ");
    }

    private static void modulAdd() {
        String nomor, hal, tanggal_masuk, alamat;

        System.out.println("--- tambah data ---");
        System.out.print("nomor : ");
        scanner = new Scanner(System.in);
        nomor = scanner.nextLine();
        System.out.print("hal : ");
        hal = scanner.nextLine();
        System.out.print("tanggal_masuk : ");
        tanggal_masuk = scanner.nextLine();
        System.out.print("alamat : ");
        alamat = scanner.nextLine();
        service.addData(new Suratmasuk(nomor, hal, tanggal_masuk, alamat));
    }

    private static void tampilData() {
        LinkedList<Suratmasuk> result = (LinkedList<Suratmasuk>) service.getAllData();

        int i=1;
        for(Suratmasuk sm : result) {
            System.out.println("data ke-" + i++);
            System.out.println("  nomor: " + sm.getNomor());
            System.out.println("  hal: " + sm.getHal());
            System.out.println("  tanggal_masuk: " + sm.getTanggal_masuk());
            System.out.println("  alamat: " + sm.getAlamat());
        }
    }

    private static void ubahData() {
        String nomor, hal, tanggal_masuk, alamat;

        System.out.println("--- perubahan data ---");
        System.out.print("nomor : ");
        scanner = new Scanner(System.in);
        nomor = scanner.nextLine();
        System.out.print("hal : ");
        hal = scanner.nextLine();
        System.out.print("tanggal_masuk : ");
        tanggal_masuk = scanner.nextLine();
        System.out.print("alamat : ");
        alamat = scanner.nextLine();
        service.updateData(new Suratmasuk(nomor, hal, tanggal_masuk, alamat));
    }

    private static void hapusData() {
        String nomor;

        System.out.println("--- hapus data ---");
        System.out.print("nomor : ");
        scanner = new Scanner(System.in);
        nomor = scanner.nextLine();
        service.deleteData(new Suratmasuk(nomor, null, null, null));
    }

}