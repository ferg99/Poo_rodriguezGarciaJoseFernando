import  java.util. * ;

public  class  masfuncionesCadena {

    Entrada del escáner =  nuevo  escáner ( System . In);

    public  void  masFunciones () {

        String s1 =  new  String ( " Hola porque mi tele no llega T_T " ); // 32
        String s2 =  " Harry potter ajedrez magico de lego " ; // 35
        String s3 =  " Feliz no cumpleaños " ;
        String s4 =  " Feliz no cumpleaños " ;

        Sistema . fuera . println ( " Escribe la letra de un caracter: " );
        char y = entrada . siguiente () . charAt ( 0 );

        Sistema . fuera . println ( " Escribiste: "  + y);

        // concatenar cadenas

        Cadena salida =  " Cadena s1: "  + s1 +  " \ n "  +  " \ n Cadena s2: "  + s2 +  " \ n "
                        +  " \ n Cadena s3: "  + s3 +  " \ n "  +  " \ n Cadena s4: "  + s4 +  " \ n " ;

        Sistema . fuera . println (salida);

        String salidas =  " " ;

        // probar la igualdad de una cadena
        if (s1 . equals ( " Solo juguito contigo " )) {
            // si es verdad
            salidas + =  " Si es igual la cadena " ;
            Sistema . fuera . println (salida);
        } más {
            salidas + =  " No es la misma cadena " ;
            Sistema . fuera . println (salida);
        }

        // probar con ==, solo sirve para objetos no para cadenas
        if (s1 ==  " Hola porque mi tele no llega T_T " ) {
            salidas + =  " Si es igual la cadena " ;
            Sistema . fuera . println (salida);
        } más {
            salidas + =  " No es la misma cadena porque objeto " ;
            Sistema . fuera . println (salida);
        }


        // probar la igualdad ignorando mayusculas
        if (s3 . equalsIgnoreCase (s4)) {
            salidas + =  " Si es la misma cadena \ n " ;
            Sistema . fuera . println (salidas);
        } más {
            salidas + =  " No es la misma cadena \ n " ;
            Sistema . fuera . println (salidas);
        }

        // vamos a probar compareTo

        salida + =  " \ n s1 compareTo (s2): "  + s1 . compareTo (s2) +
                  " \ n s2 compareTo (s1): "  + s2 . compareTo (s1) +
                  " \ n s3 compareTo (s4): "  + s3 . compareTo (s4) +
                  " \ n s4 compareTo (s3): "  + s4 . compareTo (s3) +  " \ n " ;
                  
        Sistema . fuera . println (salida);

        // obtener la segunda posicion de un caracter repetido

        String s5 =  " Patito color de cafe " ;

        int pos =  0 ;

        pos = s5 . indexOf ( ' t ' , pos + 1 );

        Sistema . fuera . println ( " La segunda aparaicion de la t es: "  + pos);

    }
}