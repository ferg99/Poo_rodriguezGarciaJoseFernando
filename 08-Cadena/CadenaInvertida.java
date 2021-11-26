import  java.util. * ;
public  class  cadenaInvertida {

    / *
    vamos a meter una oracion y vamos a invertirla
    * / 

    Entrada del escáner =  nuevo  escáner ( System . In);

    public  void  cadenaInvertidapalabras () {

        String cadena =  " " ;

        Sistema . fuera . println ( " Ingresa la oracion a invertir: " );

        cadena = entrada . línea siguiente();

        String invertida =  " " ;

        // tengo que recorrer el tamaño de la cadena
        // al reves

        for ( int i = cadena . length () - 1 ; i > =  0 ; i - ) {
            // obtener el char por cada posicion de i
            char car = cadena . charAt (i);
            // se lo sumo a invertida
            invertida + = coche;
        }
        Sistema . fuera . println ( " La cadena invertida es: "  + invertida);

        // hola -> aloh
    }
}