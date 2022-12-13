package co.edu.uptc.presentacion;

import co.edu.uptc.logica.control.Convert;

import java.util.Scanner;

public class Console {
    Convert convert;
    Scanner sc =new Scanner(System.in);
    public void menu(){
        boolean flag=false;
        do {
            System.out.println("""
                    Selecciona una acción
                    1.convertir de String a Date y saber si esta después o antes de la fecha del sistema
                    2.convertir de Date a String y saber cuantos caracteres tiene
                    
                    """);
            switch (sc.nextLine().charAt(0)) {
                case 1-> System.out.printf(""), 2->System.out.printf("la fecha es %s y tiene %d caracteres",), default -> System.out.println("opción no valida");
            }
        }while(!flag);
    }
}
