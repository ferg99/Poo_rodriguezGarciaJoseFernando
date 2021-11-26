class  EntradaTexto {

    // cuerpo del programa o de la classe

    public  static  void  main ( String [] args ) {

        // cuerpo del metodo principal

        / *
        vamos a realizar un programa en el cual podamos introducir
        texto a nuestra conveniencia
        * / 
        // tipo de dato, nombre de la variable
        String nombre;
        // ln en el print es para un salto de linea de la impresion en consola

        Sistema . fuera . println ( " Por favor introduce tu nomre: " );

        nombre =  System . consola () . readline ();
        / *
        para pode concatenar [agregar una cadena de texto algo]
        aqui estoy concatenando la variable nombre, para ello se usa ++
        * /

        Sistema . fuera . println ( " Hola, " + nombre +  " Bienvenido a tu segundo programa " );
    }
} 
 