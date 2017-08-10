/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binario;

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Binario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       System.out.println("ingrese el numero");
       int num =sc.nextInt();
       int result;
       int res;
       int binario=0;
       int cont=1;
       
       while (num>0){
           res=num%2;
           result=res*cont;
           num=num/2;
             if(res==1){
                 binario=binario+result;
                 cont=cont*10;
             }
             else{
                 cont=cont*10;
             }
         }
       System.out.println(binario);
// TODO code application logic here
    }
    
}
