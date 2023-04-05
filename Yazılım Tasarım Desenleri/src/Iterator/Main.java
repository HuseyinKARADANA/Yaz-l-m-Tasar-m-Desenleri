/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author huseyinkaradana
 */
public class Main {
    public static void main(String[] args) {
        Listeleme.Listele(new Dizi());
        System.out.println("***************************");
        Agac agac=new Agac(12);
        Agac sag=new Agac(13);
        Agac sol=new Agac(15);
        Agac sag2=new Agac(20);
        agac.solaEkle(sol);
        agac.sagaEkle(sag);
        sag.sagaEkle(sag2);
        Listeleme.Listele(agac);
    }
}
