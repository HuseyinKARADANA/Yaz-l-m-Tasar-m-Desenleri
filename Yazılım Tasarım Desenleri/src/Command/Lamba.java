/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author huseyinkaradana
 */
public class Lamba {
    private int lamba;
    public Lamba(){
        lamba=0;
    }
    public void LambaAc(){
        System.out.println("Lamba Açıldı");
        lamba=1;
    }
    public void LambaKapa(){
        System.out.println("Lamba Kapatıldı");
        lamba=0;
    }
    public int LambaDegeri(){
        return lamba;
    }
}
