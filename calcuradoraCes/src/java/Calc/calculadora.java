/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package Calc;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author mathe
 */
@WebService(serviceName = "calculadora")
public class calculadora {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "fahrenheit")
    public double fahrenheitToCelcius (@WebParam(name = "fahrenheit_temp") double fahrenheit_temp) {
        double result = (5.0/9.0*(fahrenheit_temp-32.0));
        return result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "whosBigger")
    public int whosBigger(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        if(num1>num2){
            return num1;
        }
        else{
            return num2;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiplicationTable")
    public String multiplicationTable(@WebParam(name = "num") int num) {
        String tabela = String.format("\n|Tabuada do numero: %d|\n", num);
        for (int i = 1; i <= 10; i++) {
            tabela += String.format("|%dx|%d|\n", i, i*num);
        }
        return tabela;
    }
    
    
}
