/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author oVTuan
 */
public class ButtonPlz extends JButton{
    int id;
    ArrayList<Integer> swapAble = new ArrayList<>();

    public ButtonPlz(int id,int x) throws HeadlessException {
        this.id = id;
        this.swapAble.add(id-1);
        this.swapAble.add(id+1);
        this.swapAble.add(id+x);
        this.swapAble.add(id-x);
    }
    public ButtonPlz(int id,int x,String string) throws HeadlessException {
        super(string);
        this.id = id;
        this.swapAble.add(id-1);
        this.swapAble.add(id+1);
        this.swapAble.add(id+x);
        this.swapAble.add(id-x);
    }

    public ButtonPlz(String string){
        super(string);
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Integer> getSwapAble() {
        return swapAble;
    }

    public void removeASwapAble(int x) {
        this.swapAble.remove(new Integer(id+x));
    }
}
