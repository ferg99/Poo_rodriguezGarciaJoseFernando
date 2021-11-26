/ *
Para poder hacer el programa de la suma de dos numeros
debemos de entender el algoritmo de la suma
declarar variables
num1 num2 resultado
1.- solo una vez se sume?
2.- voy a querer que se sumen los numeros y que se repita
* / 

// es necesario ocupar librerias dentro de java para algunos procesos
// vamos a ocupar la libreria Scanner que nos sirve para obtener la entrada de datos

import  java.util.Scanner ;
import  java.lang.Math ;

class  sumadedosnumeros {

    // el identado del codigo
    // metodo principal
    public  static  void  main ( String [] args ) {

        // definir un objeto de la libreria Scanner que nos sirva para obtener los datos
        Entrada del escáner =  nuevo  escáner ( System . In);
        / *
        Para realizar una instancia del objeto se debe de colocar:
        Nombreclase nombreobjeto = nuevo Nombreclase ();
        System.in Es una clase superior donde nosotros podemos obtener los 
        datos que vienen por parte de la entrada estándar de la computadora
        (por parte de la consola)
        * /

        // definicion de variables
        int num1, num2;
        int resultado = 0 ;


       hacer {
        
        Sistema . fuera . println ( " Introduce los numeros que quieras sumar; si pones 0 se detiene la suma: " );
        // asignar el primer numero a su variable
        num1 = entrada . nextInt ();
        // System.out.println ("Introduce el segundo numero a sumar:");
        // asignar el segundo numero a su variable
        // num2 = entrada.nextInt ();

        resultado = resultado + num1;  

        


       } while (num1 ! = 0 );
        
       Sistema . fuera . println ( " El resultado de la suma es: "  + resultado);


    }
}