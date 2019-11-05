/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118905.latihan63.gradiengarislurus;

/**
 *
 * @author Fitri
 * NAMA             : Anindira Dina Fitriani
 * NIM              : 10118905
 * KELAS            : IF11 Kariawan
 * Deskripsi        : Program Gradien Garis Lurus
 */
public class PBO11K10118905Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat koor1,koor2;
        koor1 = new Koordinat(2, 10, 5, 7);
        System.out.println("Garis yang melalui titik ("+koor1.getX1()+","+koor1.getY1()+") dan ("+koor1.getX2()+","+koor1.getY2()+")");
        System.out.println("Memiliki gradien sebesar "+koor1.hitungGradien());
        koor2 = new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik ("+koor2.getX1()+","+koor2.getY1()+") dan ("+koor2.getX2()+","+koor2.getY2()+")");
        System.out.println("Memiliki gradien sebesar "+koor2.hitungGradien());
    }
    
}
