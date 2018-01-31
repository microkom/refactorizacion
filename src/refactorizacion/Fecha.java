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
public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public boolean valida() {

        if ((dia < 1 || dia > 31) || (mes < 1 || mes > 12)) {
            return false;
        }

        int diasMes = diaPorMes(dia);

        if (dia > diasMes) {
            return false;
        } else {
            return true;
        }
    }

    //comprobación de la cantidad de dias en un mes dependiendo del mes
    public int diaPorMes(int dias) {
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            case 2:
                //año bisiesto?
                if (bisiesto()) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
        }
        return dias;
    }

    //comprobación de año si es bisiesto
    public boolean bisiesto() {
        if ((anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }
}
