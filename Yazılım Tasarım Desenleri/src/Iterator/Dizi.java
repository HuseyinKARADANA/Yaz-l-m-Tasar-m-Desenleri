/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.util.ArrayList;

/**
 *
 * @author huseyinkaradana
 */
public class Dizi extends Aggregate{
    public  ArrayList<Integer> liste;
    public  Dizi(){
        liste=new ArrayList<>();
        liste.add(1); liste.add(3);  liste.add(6);
        liste.add(2); liste.add(5);  liste.add(4);
        
    }

    @Override
    public Iterator CreateIterator() {
       return new DiziIterator(this);
    }
}
