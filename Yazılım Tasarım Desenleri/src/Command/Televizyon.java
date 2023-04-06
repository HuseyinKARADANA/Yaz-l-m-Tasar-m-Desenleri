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
public class Televizyon {
    private int kanal;
    public Televizyon(){
        kanal=1;
    }
    public void KanalDegistir(int k){
        kanal=k;
    }
    public void SonrakiKanal(){
        kanal++;
    }
    public void OncekiKanal(){
        kanal--;
    }
    public int GecerliKanal(){
        return kanal;
    }
}
