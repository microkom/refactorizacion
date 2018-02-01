/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizacioin;

/**
 *
 * @author german
 */
public class Refactorizacioin {

    /**
     * @param args the command line arguments
     */
    //  public static void main(String[] args) {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
     */
//package refactorizacion;
    /**
     *
     * @author DAW
     */
//public class Criba {
    public static int[] main(int max) {
        int i, j;
        if (max >= 2) {
            int dimension = max + 1; //array
            boolean[] esPrimo = new boolean[dimension];

            //Inicializar el array
            iniciarArray(esPrimo, dimension);

            //eliminar 0 y 1 que no son primos
            esPrimo[0] = esPrimo[1] = false;

            //Criba
            esPrimo=filtroPrimos(esPrimo, dimension);
            
            //cuántos primos hay?
            int contador = cantidadPrimos(esPrimo, dimension);

            //rellenar el vector de números primos
            int[] primos = new int[contador];
            
            primos=llenadoVector(primos,esPrimo,dimension);
            
            return primos;
        } else {//max 2
            return new int[0]; //vacio
        }
    }

    public static int cantidadPrimos(boolean[] esPrimo, int dimension) {
        int contador = 0;
        for (int i = 0; i < dimension; i++) {
            if (esPrimo[i]) {
                contador++;
            }
        }
        return contador;
    }

    public static void iniciarArray(boolean[] esPrimo, int dimension) {
        for (int i = 0; i < dimension; i++) {
            esPrimo[i] = false;
        }
    }
    
    public static boolean[] filtroPrimos(boolean[] esPrimo, int dimension){
        for (int i = 2; i < Math.sqrt(dimension) + 1; i++) {
                if (esPrimo[i]) {
                    //eliminar multiplos de i
                    for (int j = 2 * i; j < dimension; j += i) {
                        esPrimo[j] = false;
                    }
                }
            }
        return esPrimo;
    }
    public static int[] llenadoVector(int[] primos, boolean[]esPrimo,int dimension){
        for (int i = 0, j = 0; i < dimension; i++) {
                if (esPrimo[i]) {
                    primos[j++] = i;
                }
            }
        return primos;
    }
}
