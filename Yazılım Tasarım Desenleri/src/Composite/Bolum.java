/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import java.util.ArrayList;

/**
 *
 * @author huseyinkaradana
 */
public class Bolum implements Icerik{
private String baslik;
private ArrayList<Icerik> icerikler;
public Bolum(String b){
    baslik=b;
    icerikler=new ArrayList<Icerik>();
}
    @Override
    public void Operation() {
        System.out.println("<b>"+baslik+"</b>");
        for(Icerik i:icerikler){
            i.Operation();
        }
    }

    @Override
    public void Add(Icerik i) {
      icerikler.add(i);
    }

    @Override
    public void Remove(Icerik i) {
       icerikler.remove(i);
    }

    @Override
    public Icerik GetChild(int i) {
       return icerikler.get(i);
    }
    
}
