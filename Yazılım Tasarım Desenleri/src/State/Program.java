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
public class Program {
    private State s;
    
    public void Program(){
        s=new Tanimsiz(this);
    }
    public void Calis(){
        s.Handle();
    }
    public void GirisYap(){
        s=new Kullanici(this);
        Calis();
    }
    public void Yonetici(){
        s=new Yonetici(this);
        Calis();
    }
    public void Cikis(){
        s=new Tanimsiz(this);
    }
            
    
}
