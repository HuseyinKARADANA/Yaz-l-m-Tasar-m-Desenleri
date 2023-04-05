/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author huseyinkaradana
 */
public class Agac extends Aggregate{
    private int deger;
    Agac sol;
    Agac sag;
    public  Agac(int d){
        deger=d;
        sol=null;
        sag=null;
    }
    public int degerAl(){
        return deger;
    }
    public void solaEkle(Agac a){
        sol=a;
    }
    public void sagaEkle(Agac a){
        sag=a;
    }

    @Override
    public Iterator CreateIterator() {
        return new AgacIterator(this);
    }
}
