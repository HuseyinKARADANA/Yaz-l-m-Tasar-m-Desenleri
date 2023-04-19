/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author huseyinkaradana
 */
public class Main {
    public static void main(String[] args) {
       Program p=new Program();
        Tanimsiz t=new Tanimsiz(p);
        t.Handle();
        System.out.println("---------------------------");
        Kullanici k=new Kullanici(p);
        k.Handle();
        
        System.out.println("---------------------------");
        Yonetici y=new Yonetici(p);
        y.Handle();
       
    }
}
