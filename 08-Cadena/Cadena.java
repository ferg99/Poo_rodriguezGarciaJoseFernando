import  java.util.Scanner ;

public  class  cadena {

    Entrada del escáner =  nuevo  escáner ( System . In);
    / *
    Vamos a empezar a jugar con cadenas 
    * /
    public  void  cadenas () {

        String s1 =  " Hola, habia una vez un patito que decia miau miau " ;
        // obtener la longitud de la cadena

        Sistema . fuera . println ( " El tamanio de la cadena es: "  + s1 . length ());
        // si comienza con .....

        Sistema . fuera . println ( " La cadena inicia V o F con Hola? "  + s1 . startsWith ( " Hola " ));
        // si termina con ...

        Sistema . fuera . println ( " La cadena termina V de con gato? "  + s1 . endsWith ( " gato " ));

        // vamos a leer una variable
        Sistema . fuera . println ( " Ingrese una palabra: " );
        Cadena s2 = entrada . línea siguiente();
        Sistema . fuera . println ( " La palabra es: "  + s2);

        // vamos a obtener subcadenas de la primera cadena
        Sistema . fuera . println ( " Parte de una subcadena de s1: " + s1 . indexOf ( " tito " ));

        // vamos a sustraer una palabra de una cadena

        Sistema . fuera . println ( " Primera parte: "  + s1 . subcadena ( 12 ));
        Sistema . fuera . println ( " Segunda parte: "  + s1 . subcadena ( 3 , 11 ));

        // convertir una variable de la cadena
        int valor =  24 ;

        Cadena s3 =  Cadena . valueOf (valor);

        Sistema . fuera . println ( " El valor es de: "  + s3 +  " como cadena " );

        / *
        cadena int  
        2 + 2 = 22 2 + 2 = 4
        * /

        // convertir una cadena a un numero

        String s4 =  " 20 " ;

        int numero =  Entero . parseInt (s4);

        Sistema . fuera . println ( " El valor es de: "  + numero +  " ahora es un numero " );

        // convertir cadena a un decimal

        String s5 =  " 20.89 " ;

        Doble numero1 =  Doble . parseDouble (s5);

        Sistema . fuera . println ( " La cadena: "  + s5);

        Sistema . fuera . println ( " El valor es de: "  + numero1 +  " ahora es un doble " );

        numero1 = numero + numero1;

        Sistema . fuera . println ( " El resultado es: "  + numero1);

        // metodo toString conviernte un entero a una cadena

        Entero x =  5 ;

        Sistema . fuera . println ( " El valor de: "  + x . toString () +  " ahora es una cadena " );

        Sistema . fuera . println ( " El valor de "  +  Integer . toString ( 12 ) +  " ahora es una cadena " );
    }
}