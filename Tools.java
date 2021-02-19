/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor;

import java.util.Scanner;

/**
 *
 * @author VicentUCF
 */
public class Tools {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

static Scanner teclat = new Scanner(System.in);


    
    
    
    
    //Retorna un numero aleatori
    public int Random_Num(int max, int min){ 
        double numero = (Math.random()*max+min);
        int n_rand = (int)numero;
        return n_rand;
    }
    
    //Demana un string amb una pregunta
    public String DemanarString(String t){
       String x;
       System.out.println(t);
       x = teclat.nextLine();
       return x;
    }
    
    public char DemanarChar(String m) {
        System.out.print(m);
        char x = teclat.next().charAt(0);   
        teclat.nextLine();
        char y = Character.toUpperCase(x);
        return y;        
    }
    
    //Demana al usuari un int amb una pregunta
    public int DemanarInt(String t){
       int x;
       System.out.println(t);
       x = teclat.nextInt();
       teclat.nextLine();
       return x;
    }
    //Compara 2 Strings i retirna un boolean
    public boolean CompararString(String a, String b){
        
         if (a.equals(b)){
           return  true;
        }else{
           return  false;
        }
    }
    //Compara 2 ints i retorna un boolean
    public boolean CompararInts(String a, String b){
        boolean igual;
        if (a==b){
           return igual = true;
        }else{
           return igual = false;
        }   
    }
    
    
    
}

    

