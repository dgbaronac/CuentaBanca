/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

/**
 *
 * @author Usuario5
 */
public class Funcion {
    
    private int Numero;
    private int Clave;
    private String Propietario;
    private double Saldo;
   
    public Funcion(int Numero,int Clave,String Propietario,double Saldo){
                            this.Numero=Numero;
                            this.Clave=Clave;
                            this.Propietario=Propietario;
                            this.Saldo=Saldo;
    }

    
                            
    public void Retirar(double Valor){
            if(Saldo>=Valor){
                Saldo=Saldo-Valor;
                System.out.println("Su nuevo saldo es: " + Saldo);
                            }
                System.out.println("Forndos insuficientes su saldo es: " + Saldo);
               }
                            
    public void Consignar(double valor){
            Saldo=Saldo+valor;
            System.out.println("Su nuevo saldo es " + Saldo);
                                        }  
    public void Cambiar(int nueva){
            Clave=nueva;
            System.out.println("Ha cambiado su clave satisfactoriamente.");
    }
            
 }
    
    

