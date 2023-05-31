public class Perusahaan {

    private String namaPerusahaan;
    // private Karyawan karyawan;

    private static int jumlahKaryawan;

    public Perusahaan(String namaPerusahaan){
        this.namaPerusahaan = namaPerusahaan;
    }

    public String getNamaPerusahaan(){
        return namaPerusahaan;
    }

    public static void getJumlahKaryawan(){
        System.out.println("Jumlah Karyawan : " + jumlahKaryawan);
    }

    public double getPajakPerusahaan(){
        return 0.025;
    }
}
