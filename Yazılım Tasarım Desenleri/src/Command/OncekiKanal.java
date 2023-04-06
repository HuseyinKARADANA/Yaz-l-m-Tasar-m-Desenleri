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
public class OncekiKanal implements Command{

    Televizyon tv;
    public OncekiKanal(Televizyon t){
        tv=t;
    }
    
    
    @Override
    public void Execute() {
        tv.OncekiKanal();
        System.out.println("Geçerli Kanal: "+tv.GecerliKanal());
        
    }
    
    public String toString(){
        return "Önceki Kanal";
    }
    
    
}
