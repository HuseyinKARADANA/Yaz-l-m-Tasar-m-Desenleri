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
public class Tanimsiz  implements State{
    private Program program;
    
    public Tanimsiz(Program p){
        program=p;
    }

    @Override
    public void Handle() {
        System.out.println("1) Kayıt Olun");
        System.out.println("2) Kullanıcı Girişi");
        System.out.println("3) Yönetici Girişi");
        
        program.GirisYap();
    }
    
}
