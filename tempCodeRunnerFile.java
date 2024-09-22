public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        Scanner userInput = new Scanner(System.in);
        int pilih = 0;
        do { 
        System.out.println("========Menu========");
        System.out.println("1.Input Data Mahasiswa");
        System.out.println("2.Tampilkan Daftar Mahasiswa");
        System.out.println("3.Ubah Data Mahasiswa");
        System.out.println("4.Hapus Data Mahasiswa");
        System.out.println("=======================");
        switch (pilih) {
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

                throw new AssertionError();
        }
        }while(pilih != 5);


    
    }
