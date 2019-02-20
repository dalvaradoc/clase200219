/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase200219;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class DAO {
    private ArrayList<Integer> bd;

    public DAO() {
        this.bd = new ArrayList<>();
    }
    
    public boolean modificar (int value, int pos){
        if (pos < 0 || pos > bd.size()-1){
            return false;
        }
        this.bd.set(pos, value);
        return true;
    }
    
    public ArrayList<Integer> getBd () {
        return bd;
    }
    
    public void addBd (Integer data) {
        this.bd.add(data);
    }
    
    public void setBd (ArrayList<Integer> newBd){
        this.bd = newBd;
    }
}
