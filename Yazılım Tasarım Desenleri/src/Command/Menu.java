/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author huseyinkaradana
 */
public class Menu {
    private ArrayList<Command> komutlar;
    
    public Menu(){
        komutlar=new ArrayList<Command>();
        
    }
    public void KomutEkle(Command c){
        komutlar.add(c);
    }
    public void Menu(){
        Scanner input=new Scanner(System.in);
        int s=0;
        while(s!=-1){
            for(int i=0;i<komutlar.size();i++){
                System.out.println(i+" : "+komutlar.get(i));
            }
            System.out.println("Çıkmak için -1");
            try {
                s=input.nextInt();
                komutlar.get(s).Execute();
            } catch (Exception e) {
            }
            
        }
        input.close();
    }
    
}
