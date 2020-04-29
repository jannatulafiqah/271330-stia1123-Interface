/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Method1 implements MyInterface {
    
    @Override
    public void sayHello(){
        System.out.println("Hello Method1");
    }
    
    /**
     *
     * @param args
     */
    public static void main(String[] args){
        Method1 method1 = new Method1();
        method1.sayHello();
    }
    
}
