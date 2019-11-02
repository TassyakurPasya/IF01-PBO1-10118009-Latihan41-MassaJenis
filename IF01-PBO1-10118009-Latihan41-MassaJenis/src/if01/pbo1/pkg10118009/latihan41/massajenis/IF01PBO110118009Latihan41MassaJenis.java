/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan41.massajenis;

import java.util.Scanner;




/**
 * Nama : Tassyakur Pasya
 * Kelas : IF-01 
 * NIM : 10118009
 * Deskripsi Program : Massa Jenis 
 * @author LENOVO
 */
public class IF01PBO110118009Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MassaJenis Mjenis =new MassaJenis();
        Scanner input = new Scanner(System.in);
        
        System.out.println("======Massa Jenis Kubus======");
        System.out.print("Sisi : ");
        Mjenis.setSisi(input.nextInt());
        System.out.print("Massa : ");
        Mjenis.setMassa(input.nextInt());
        
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume : "+Mjenis.hitungVolume((int) Mjenis.getSisi()));
        System.out.println("Massa Jenis : "+Mjenis.hitungMassaJenis( Mjenis.getMassa(),Mjenis.hitungVolume(Mjenis.getSisi())));
    }
    
}
