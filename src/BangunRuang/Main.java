//Amalia Putri Latifah
//123210109

package BangunRuang;

import java.util.Scanner;

public class Main {
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double panjang, lebar, jari, tinggi;
        int pilih;
        boolean ulang = false;
        
        do {
            System.out.println("=========");
            System.out.println("   Menu  ");
            System.out.println("=========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Keluar");
            System.out.print("   Pilih: ");
            pilih = sc.nextInt();
            
            if (pilih == 1) {
                System.out.println("====HITUNG BALOK====");
                
                persegipanjang pp = new persegipanjang(0,0);
                balok b = new balok(0,0,0);
                
                //input nilai panjang
                System.out.print("Panjang : ");
                panjang = sc.nextDouble();
                pp.setPanjang(panjang);
                b.setPanjang(panjang);
                
                System.out.print("Lebar   : ");
                lebar = sc.nextDouble();
                pp.setLebar(lebar);
                b.setLebar(lebar);
                
                System.out.print("Tinggi  : ");
                tinggi = sc.nextDouble();
                b.setTinggi(tinggi);
                
                    System.out.println("Keliling        = " + pp.keliling());
                    System.out.println("Luas            = " + pp.luas());
                    System.out.println("Luas Permukaan  = " + b.luas_permukaan());
                    System.out.println("Volume          = " + b.volume());
                
            } else if (pilih == 2) {
                    System.out.println("====HITUNG TABUNG====");
                    
                    lingkaran li = new lingkaran(0);
                    tabung tb = new tabung(0,0);
                    
                    System.out.print("Jari-jari : ");
                    jari = sc.nextDouble();
                    li.setR(jari);
                    tb.setR(jari);
                    
                    System.out.print("Tinggi    : ");
                    tinggi = sc.nextInt();
                    tb.setTinggi(tinggi);
                    
                    System.out.println("Keliling        = " + li.keliling());
                    System.out.println("Luas            = " + li.luas());
                    System.out.println("Luas Permukaan  = " + tb.luas_permukaan());
                    System.out.println("Volume          = " + tb.volume());
                
            } else if (pilih == 0) {
                System.out.println("Exit Program Successfully");
            } else {
                System.out.println("Input Failed.");
            }
             System.out.println("Ulangi? (Ya : 1 || Tidak : 0)");
            double inputUlangi = userInput.nextInt();
            
            if(inputUlangi == 1) {
                ulang = true;
            } else {
                ulang = false;
            }
            
        }while(ulang==true);
    }
	
}
