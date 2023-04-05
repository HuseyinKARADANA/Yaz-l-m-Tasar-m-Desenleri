/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author huseyinkaradana
 */
public class Main {
    public static void yazdir(Icerik icerik){
        icerik.Operation();
    }
    public static void main(String[] args) {
        Bolum kitap=new Bolum("Programlamaya Giriş");
        Bolum b1=new Bolum("Giriş");
        b1.Add(new Metin("Hello Word"));
        b1.Add(new Metin("Diğer Programlar"));
        Bolum b12=new  Bolum("Temel Programlama");
        b12.Add(new Metin("Değişkenler"));
        b12.Add(new Metin("Kontroller"));
        b12.Add(new Metin("Döngüler"));
        b12.Add(new Metin("Fonksiyonlar"));
        b1.Add(b12);
        
        Bolum b2=new Bolum("Değişkenler");
        b2.Add(new Resim("degisken.jpg"));
        b2.Add(new Metin("int,double,float,boolean"));
        
        kitap.Add(b1);
        kitap.Add(b2);  
        
        yazdir(kitap);
        System.out.println("");
        yazdir(b12);
        
    }
}
