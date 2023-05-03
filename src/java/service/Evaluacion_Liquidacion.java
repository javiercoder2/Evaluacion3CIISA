/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author javie
 */
@WebService(serviceName = "Evaluacion_Liquidacion")
public class Evaluacion_Liquidacion {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "calcular")
    public int calcular(@WebParam(name = "opcion") int intOpcion ,int intBono_rendimiento, @WebParam(name = "bono_movilizacion") int intBono_movilizacion, @WebParam(name = "descuento_salud") int intDescuento_salud, @WebParam(name = "descuento_AFP") int intDescuento_AFP, @WebParam(name = "sueldo_final") int intSueldo_final) {

        return 0;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "calcular_sueldo_liquido")
    public double calcular_sueldo_liquido(@WebParam(name = "sueldo_bruto") int dobSueldo_bruto) {
        //TODO write your implementation code here:
        double dobBonoMovilizacion = dobSueldo_bruto * 0.2;
        double dobBonocumplimiento = dobSueldo_bruto * 0.15;
        double dobDescuentoSalud = dobSueldo_bruto - (dobSueldo_bruto * 0.07);
        double dobDescuentoAFP = dobSueldo_bruto - (dobSueldo_bruto * (12 / 100));
        double dobSueldofinal = dobSueldo_bruto + dobBonoMovilizacion + dobBonocumplimiento - dobDescuentoSalud - dobDescuentoAFP;
        
        
        return dobSueldofinal;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "validacion_identidad")
    public String validacion_identidad(@WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "contrasenia") String contrasenia) {
        //TODO write your implementation code here:
        return null;
    }
}
