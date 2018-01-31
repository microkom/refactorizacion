/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizacion;

/**
 *
 * @author DAW
 */
public class Criba {

    public static int[] generaPrimos(int max) {
        int i, j;
        if (max >= 2) {
            int dimension = max + 1; //array
            boolean[] esPrimo = new boolean[dimension];

            //Inicializar el array
            for (i = 0; i < dimension; i++) {
                esPrimo[i] = false;
            }

            //eliminar 0 y 1 que no son primos
            esPrimo[0] = esPrimo[1] = false;

            //Criba
            for (i = 2; i < Math.sqrt(dimension) + 1; i++) {
                if (esPrimo[i]) {
                    //eliminar multiplos de i
                    for (j = 2 * i; j < dimension; j += i) {
                        esPrimo[j] = false;
                    }
                }
            }
            
            //cuántos primos hay?
            int contador=0;
            for (i=0; i<dimension; i++){
                if (esPrimo[i])
                    contador++;
            }
            
            //rellenar el vector de números primos
            int[] primos=new int[contador];
            
            for (i=0, j=0;i<dimension; i++){
                if(esPrimo[i])
                    primos[j++]=i;
            }
            return primos;
        }else {//max 2
            return new int[0]; //vacio
        }
    }
    
    
    
    
}