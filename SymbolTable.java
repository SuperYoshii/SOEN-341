/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41;
import java.util.*;
import java.util.Map.Entry;
/**
 *
 * @author aida_kor
 */
public class SymbolTable {
    
    public HashMap<String, Symbol> symbolTable; //value,key
    
    public SymbolTable() {
        symbolTable = new HashMap<>();
    }
    
    public HashMap<String, Symbol> GetTable(){
        return symbolTable;
    }
    
  //Put Method to add new pairs - in progress
   public void AddPair(String key, Symbol sym) {
        if (HasKey(key)) {
            symbolTable.put(key, sym);
            return;
        }
       //add new key
       return;
    }
    
   public boolean HasKey(String key) {
        return symbolTable.containsKey(key);
    }

}
