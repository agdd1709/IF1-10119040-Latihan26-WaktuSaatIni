/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan26.waktusaatini;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
/**
 *
 * @author Acer
 * Nama     : Agus Deri Dermawan
 * Kelas    : IF1
 * NIM      : 10119040
 * Program menampilkan waktu saat ini
 */
public class IF110119040Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date tgl = new Date();
        Locale lokal = Locale.forLanguageTag("id");
        SimpleDateFormat format = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss", lokal);
                
        System.out.println("Hari ini adalah hari : " +  format.format(tgl));
        
    }
    
}
