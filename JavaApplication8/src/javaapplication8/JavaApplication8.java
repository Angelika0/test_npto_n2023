/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

/**
 *
 * @author student
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int N = 10;
        int tab[] = new int[N];
        for(int i =0; i<N; i++){
            tab[i]=0;
        }
        int min = tab[0];
        for(int i =0; i <N; i++){
            if(tab[i]<min)min = tab[i];
        }
        System.out.println(min);
                System.out.println("hello");
        
                int max= tab[0];
                for(int i =0; i<N; i++){
                    if(max<N) max=tab[i];
                }
                System.out.println(max);

        
    }
    
}
