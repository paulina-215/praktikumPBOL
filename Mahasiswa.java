import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mahasiswa{
    Map<String, String> dataMahasiswa = new HashMap<>();


    public void buatDataMahasiswa(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Masukkan NIM    :");
        String nim = userInput.nextLine();

        if(dataMahasiswa.containsKey(nim)){
            System.out.println("NIM sudah pernah di Input");
        }else{
            System.out.println("Masukkan Nama   :");
            String nama = userInput.nextLine();
            dataMahasiswa.put(nim,nama);
            System.out.println("Data berhasil disimpan");
        }
    }


    public void bacaDataMahasiswa(){
        if(dataMahasiswa.isEmpty()){
            System.out.println("Data Mahasiswa Tidak Ada");
        }else{
            System.out.println("Daftar Mahasiswa    :");
            for(Map.Entry<String, String> entry : dataMahasiswa.entrySet()){
                System.out.println("NIM     :" + entry.getKey() + " Nama  :" + entry.getValue());

            }
        }
    }

    public void ubahDataMahasiswa(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Masukkan NIM yang ingin anda ubah   :");
        String nim = userInput.nextLine();

        if(dataMahasiswa.containsKey(nim)){
            System.out.println("Masukkan Nama Baru  :");
            String namaBaru = userInput.nextLine();
            dataMahasiswa.put(nim, namaBaru);
            System.out.println("Data Mahasiswa Berhasil diubah  ");
        }else{
            System.out.println("NIM Tidak Ada Pada Daftar Mahasiswa");
        }
    }

    public void hapusDataMahasiswa(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Masukkan NIM yang ingin di hapus dari daftar mahasiswa  :");
        String nim = userInput.nextLine();

        if(dataMahasiswa.containsKey(nim)){
            dataMahasiswa.remove(nim);
            System.out.println("Data Mahasiswa Berhasil dihapus ");
        }else{
            System.out.println("NIM Tidak Ada Pada Daftar Mahasiswa");
        }
    }
    public static void main(String[] args) {
  Mahasiswa mahasiswa = new Mahasiswa();
Scanner userInput = new Scanner(System.in);
int pilih; 
int nomor;

do { 
    System.out.println("========Menu========");
    System.out.println("1.Input Data Mahasiswa");
    System.out.println("2.Tampilkan Daftar Mahasiswa");
    System.out.println("3.Ubah Data Mahasiswa");
    System.out.println("4.Hapus Data Mahasiswa");
    System.out.println("=======================");
    System.out.print("Masukkan pilihan: "); 
    nomor = userInput.nextInt(); 

    switch (nomor) {
        case 1:
            mahasiswa.buatDataMahasiswa();
            break;
        case 2:
            mahasiswa.bacaDataMahasiswa();
            break;
        case 3:
            mahasiswa.ubahDataMahasiswa();
            break;
        case 4:
            mahasiswa.hapusDataMahasiswa();
            break;
        default:
            System.out.println("Pilihan hanya 1-4.");
            break;
    }

    System.out.print("ketik 5 jika anda ingin keluar "); 

    pilih = userInput.nextInt();

} while (pilih != 5);

    }
}