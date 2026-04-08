import java.util.Scanner;

public class MahasiswaDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi05 list = new MahasiswaBerprestasi05();

        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: "); String nim = sc.next();
            System.out.print("Nama: "); String nama = sc.next();
            System.out.print("Kelas: "); String kelas = sc.next();
            System.out.print("IPK: "); double ipk = sc.nextDouble();

            Mahasiswa05 m = new Mahasiswa05(nim, nama, kelas, ipk);
            list.tambah(m);
            System.out.println("-------------------------");
        }

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting IPK (Bubble Sort - DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan Insertion SORT (ASC): ");
        list.insertionSort();
        list.tampil();
    }
}