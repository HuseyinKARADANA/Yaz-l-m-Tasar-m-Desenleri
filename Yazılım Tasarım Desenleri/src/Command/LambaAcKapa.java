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
public class LambaAcKapa implements Command{

    Lamba lamba;
    
    public LambaAcKapa(Lamba l){
        lamba=l;
    }
    
    @Override
    public void Execute() {
       if(lamba.LambaDegeri()==1){
           lamba.LambaKapa();
       }else{
           lamba.LambaAc();
       }
    }
    
    @Override
    public String toString(){
        if(lamba.LambaDegeri()==1){
            return "Lambayı Kapa";
        }else{
            return "Lambayı Aç";
        }
    }
}
