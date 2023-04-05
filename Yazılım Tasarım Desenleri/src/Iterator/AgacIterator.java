/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.util.Stack;
public class AgacIterator extends Iterator{
    Agac basla;
    Agac guncel;
    Stack<Agac> yigin;
    
    public AgacIterator(Agac a){
        basla=a;
        yigin=new Stack<>();
                
    }
    @Override
    public void First() {
       guncel=basla;
       yigin=new Stack<>();
       yigin.push(guncel);
    }

    @Override
    public void Next() {
       if(guncel.sag!=null){
           yigin.push(guncel.sag);
       }
        
       if(guncel.sol!=null){
           yigin.push(guncel.sol);
       }
    }

    @Override
    public boolean IsDone() {
       return yigin.isEmpty();
    }

    @Override
    public int CurrentItem() {
        guncel=yigin.pop();
        return guncel.degerAl();
    }
    
}
