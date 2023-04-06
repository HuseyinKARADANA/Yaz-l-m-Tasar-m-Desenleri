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
public class Main {
    public static void main(String[] args) {
        Menu m=new Menu();
        LambaAcKapa komut_Lamba=new LambaAcKapa(new Lamba());
        Televizyon tv=new Televizyon();
        OncekiKanal komut_Once=new OncekiKanal(tv);
        SonrakiKanal komut_Sonra=new SonrakiKanal(tv);
       
        m.KomutEkle(komut_Lamba);
        m.KomutEkle(komut_Once);
        m.KomutEkle(komut_Sonra);
    
        m.Menu();
    }
}
