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
public class Listeleme {
    public static void Listele(Aggregate a){
        Iterator i=a.CreateIterator();
        for(i.First();!i.IsDone();i.Next()){
            System.out.println(i.CurrentItem());
    }
    }
}
