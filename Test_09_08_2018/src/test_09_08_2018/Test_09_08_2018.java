package test_09_08_2018;

import java.util.Scanner;

public class Test_09_08_2018 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
                
        System.out.println("ingrese su nombre: ");
        String nombre = in.nextLine();
        
        System.out.println("ingrese su edad: ");
        int edad = Integer.parseInt(in.nextLine());
        
        System.out.println("ingrese su altura: ");
        float altura = Float.parseFloat(in.nextLine());
        
        if(edad >= 18){
            System.out.println(edad+ "es mayor de edad");
        }else{
            System.out.println(edad+ "es mayor de edad");
        }
        
        
        
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(altura);
        
        
        
        
    }    
}
