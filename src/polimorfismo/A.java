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
public class A {

    public A() {
        System.out.println("constructor de a");
    }
    
    public void f(int a){
        System.out.println("en A "+a);
    }
    //sobrecargar la funcion, tipos de dato diferente 
    public void f(){
            System.out.println("en a sin parametro");
    }
}
