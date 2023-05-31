// import java.util.Scanner;

/**
 * 
 * Karyawan dari perusahaan X, setiap mendapat gajinya diwajibkan untuk 
 * membayar pajak 2,5 % dari gajinya.
 *  Buatlah class diagram dan implementasikan ke dalam bahasa program dengan GUI 
 * (tentukan atribut dan methodnya)

 */

public class Main {
    public static void main(String[] args) {

        Karyawan ariq = new Karyawan("Ariq", "Front End", "Intern");
        
        ariq.beriGaji(1000000);
        ariq.indetitas();

    }

}