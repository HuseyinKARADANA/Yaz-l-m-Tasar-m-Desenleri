/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author huseyinkaradana
 */
public interface Icerik {
    void Operation();
    void Add(Icerik i);
    void Remove(Icerik i);
    Icerik GetChild(int i);
}
