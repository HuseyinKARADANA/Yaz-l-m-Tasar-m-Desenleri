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
public abstract class Iterator {
    public abstract void First();//imleci ilk elemana getirir
    public abstract void Next();//imleci sonraki elemana getirir
    public abstract boolean IsDone();//koleksiyonun sonuna gelip gelmediğimizi belirtiyor
    public abstract int CurrentItem();//imlecin şimdi gösterdiği değer
}
