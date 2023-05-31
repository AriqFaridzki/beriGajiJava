import java.util.Random;
public class Karyawan {
    private String nama, departemen, jabatan;
    private int NIP;
    private double gaji;

    Perusahaan perusahaan = new Perusahaan("Ariq");
    Random random = new Random();

    public Karyawan(String nama, String departemen, String jabatan){
        this.nama = nama;
        this.departemen = departemen;
        this.jabatan = jabatan;
        NIP =  random.nextInt(20000);

        // generate random number from 0 to 3
        
    }

    public void indetitas(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Departemen : " + this.departemen);
        System.out.println("Jabatan : " + this.jabatan);
        System.out.println("NIP : " + this.NIP);
        System.out.println("Gaji : " + this.gaji);
        System.out.println("Nama Perusahaan : " + perusahaan.getNamaPerusahaan());
    }


    public void beriGaji(double gaji){
        Double pajak = gaji * perusahaan.getPajakPerusahaan();
        this.gaji = gaji - pajak;
    }
    
    
}
