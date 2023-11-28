/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mar31;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Mar31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<ArrayList<String>> arr=new ArrayList();
        
        ArrayList<String> sodAN=new ArrayList<>();
        
        sodAN.add("dilata");
        sodAN.add("cornbeef");
        sodAN.add("canton");
        sodAN.add("fried chicken");
        
        ArrayList<String> drinks=new ArrayList<>();
        
        drinks.add("water");
        drinks.add("beer ");
        
//        System.out.println(sodAN);
//        System.out.println(drinks);
        arr.add(sodAN);
        arr.add(drinks);
        
        System.out.println(arr);
    }
    
}
