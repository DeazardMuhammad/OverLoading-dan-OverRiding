/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
*
* @author MOKLET-2
*/
public class OverLoading {
public void penjumlahan(int q, int w){
   System.out.println(q + w);
}

public void penjumlahan(int q, int w, int e){
    System.out.println(q + w + e);
}

public static void main(String[] args) {
    OverLoading tambah= new OverLoading();
    tambah.penjumlahan(8, 6);
    tambah.penjumlahan(5, 7, 9);
}

}
