/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Estudiante
 */
public class B extends A{
    public B() {
        System.out.println("constructor de B");
    }
//override es un metadato(habla de datos) 
 @Override
public void f(int a){
     System.out.println("En B "+a);
}
}