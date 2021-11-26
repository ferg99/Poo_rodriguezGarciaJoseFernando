/ *
Vamos a crear un programa que se encargue de realizar las siguientes operaciones
1.- Bono o descuento por edad
2.- Convertir numeros decimales a binarios
3.- Convertir temperaturas celcius, kelvine y rankine
4.- Numero de positivos y negativos segun una lista de numeros
5.- Tiendita peke
6.- Area y Perimetro de figuras geometricas
7.- Tabla
8.- Factorial
9.- Dibujitos de codigo
10.- Figuras huecas de codigo
11.- Patrones de codigos
12.- Diamante de codigo
13.- Calculadora
14.- Salir
* / 

import  java.util.Scanner ;

class  EstructuradeDatos {

    // Programa 1
    / *
    EL PROGRAMA DEBE SOLICITAR LA EDAD DEL USUARIO. SI ÉSTA ES MAYOR DE 65,
    AL PRECIO DEL ABONO SE LE APLICA UN DESCUENTO DEL 40%. 
    SI LA EDAD ES MENOR QUE 21, SE PREGUNTA AL USUARIO SI SUS PADRES SON 
    SOCIOS. SI LA RESPUESTA ES AFIRMATIVA, SE LES APLICA UN DESCUENTO DEL
    45%; EN CASO CONTRARIO, SE LES APLICA UN 25%.
    edad variable
    condiciones
    * / 

    public  static  void  main ( String [] args ) {

        // objetos
        Entrada del escáner =  nuevo  escáner ( System . In);
        // Escáner letras = new Scanner (System.in);


        // variables
        int edad, opcion, socio, numbinario, total, numerototal, n, a, b;
        int positivos =  0 ;
        int negativos =  0 ;
        doble precio, bono;
        char letras, operacion;
        flotar precios =  0 ;
        resultado flotante =  0 ;
        int cantidad =  0 ;
        String binario =  " " ;


        // cuerpo del programa

        // menu de las opciones de arriba

        hacer {

        Sistema . fuera . println ( " Bienvenido a tu primer programa de estructuras. " );
        Sistema . fuera . println ( " Por favor elija la opción deseada: " );
        Sistema . fuera . println ( " 1.- Descuento por edad " );
        Sistema . fuera . println ( " 2.- Convertir número decimal a binario " );
        Sistema . fuera . println ( " 3.- Conversiones de temperatura " );
        Sistema . fuera . println ( " 4.- Numeros positivos y negativos " );
        Sistema . fuera . println ( " 5.- Tienda " );
        Sistema . fuera . println ( " 6.- Area y Perimetros " );
        Sistema . fuera . println ( " 7.- Tabla " );
        Sistema . fuera . println ( " 8.- Factorial " );
        Sistema . fuera . println ( " 9.- Dibujos de codigo " );
        Sistema . fuera . println ( " 10.- Figura Hueca " );
        Sistema . fuera . println ( " 11.- Patrones de codigo " );
        Sistema . fuera . println ( " 12.- Diamente " );
        Sistema . fuera . println ( " 13.- Calculadora " );
        Sistema . fuera . println ( " 14.- Salir " );

        // condicion switch para el menu

        opcion = entrada . nextInt ();


        cambiar (opcion) {

            caso  1 :  // problema 1
                Sistema . fuera . println ( " Ingresa el Bono A cobrar " );
                bono = entrada . nextDouble ();
                Sistema . fuera . println ( " Ingresa la edad " );
                edad = entrada . nextInt ();
                // la estructura de condiciones
                // SI ÉSTA ES MAYOR DE 65, AL PRECIO DEL ABONO SE LE APLICA UN DESCUENTO DEL 40%.
                si (edad > =  65 ) {
                    // proceso
                    bono = bono * .6 ;
                    Sistema . fuera . println ( " Su descuento es de 40% " );
                    Sistema . fuera . println ( " El total a pagar es de: "  + bono);
                }
                / *
                SI LA EDAD ES MENOR QUE 21, SE PREGUNTA AL USUARIO SI SUS PADRES SON 
                 SOCIOS. SI LA RESPUESTA ES AFIRMATIVA, SE LES APLICA UN DESCUENTO DEL
                45%; EN CASO CONTRARIO, SE LES APLICA UN 25%.
                * / 
                si (edad <=  21 ) {
                    Sistema . fuera . println ( " Si tus padres son socios ingresa 1, sino lo son ingresa 2 " );
                    socio = entrada . nextInt ();

                    switch (socio) {
                        caso  1 : 
                            bono = bono * .55 ;
                            Sistema . fuera . println ( " Su descuento fue del 45% " );
                            Sistema . fuera . println ( " El total a pagar es de: "  + bono);
                            romper ;
                        caso  2 : 
                            bono = bono * .75 ;
                            Sistema . fuera . println ( " Su descuento fue del 25% " );
                            Sistema . fuera . println ( " El total a pagar es de: "  + bono);
                            romper ;
                        por defecto :
                        // es el caso por defecto osea los demas casos
                            Sistema . fuera . println ( " Opción no valida " );

                    }
                }
                Sistema . fuera . println ( " Tu edad es de: "  + edad);
                Sistema . fuera . println ( " El total a pagar es: "  + bono);
                romper ;

                caso  2 :

                    Sistema . fuera . println ( " Ingrese un número positivo entero que desee convertir a binario " );
                    numbinario = entrada . nextInt ();
                    / *
                    Tengo que comprobar que sea positivo?
                    condicion donde numbinario> 0
                    entonces aplico el algoritmo de convertir a binario
                    sino no se puede convertir
                    * / 

                    si (numbinario >  0 ) {
                        / *
                        Como el algoritmo para convertir un numero decimal en binario
                        aplicar al numbinario mod 2
                        * /
                        while (numbinario >  0 ) {
                            si (numbinario %  2  ==  0 ) {
                                binario =  " 0 "  + binario;
                            } más {
                                binario =  " 1 "  + binario;
                            }
                            numbinario = ( int ) numbinario /  2 ;
                        }
                    } else  if (numbinario ==  0 ) {
                        binario =  " 0 " ;
                    } más {
                        binario =  " No se pudo convertir el numero, ingrese solo positivos. " ;
                    }
                    Sistema . fuera . println ( " El numero convertirdo a binario es: "  + binario);
                    romper ;


                caso  3 :
                    // tarea

                caso  4 :

                    / *
                    Un numero positivo y un num negativo
                    entonces para poder identificar si un número positivo o negativo
                    debo de poder diferenciar si es 
                    num> 0
                    * / 

                    Sistema . fuera . println ( " Inserte ¿cuantos números va a ingresar? " );
                    total = entrada . nextInt ();

                    hacer {
                        Sistema . fuera . println ( " Inserte el numero " );
                        numerototal = entrada . nextInt ();

                        // condicion
                        si (numerototal ==  0 ) {
                            // contar cuantos positivos hubo
                            // vamos a ir acumulando el numero de positivos
                            positivos = positivos +  0 ;

                        } más {
                            if (numerototal >  0 ) {
                                positivos = positivos + 1 ;
                            } más {
                                negativos = negativos + 1 ;
                            }
                        }

                        // saber el total
                        total = total - 1 ;



                    } mientras (total ! =  0 );

                    Sistema . fuera . println ( " El total de positivos es: " + positivos);
                    Sistema . fuera . println ( " El total de negativos es: " + negativos);

                    romper ;

                caso  5 :
                    Sistema . fuera . println ( " ¿Cuantos elementos vas a ingresar? " );
                    total = entrada . nextInt ();

                    para ( int i =  1 ; i <= total; i ++ ) {
                        Sistema . fuera . println ( " Ingresa el Precio producto " );
                        precios = entrada . nextFloat ();
                        Sistema . fuera . println ( " Ingresa el Cantidad del Producto " );
                        cantidad = entrada . nextInt ();

                        resultado = precios * cantidad;
                    }

                    Sistema . fuera . println ( " El resultado es: "  + resultado);

                caso  6 :
                    // tarea

                caso  7 : 
                    para (n =  1 ; n <=  10 ; n ++ ) {
                        Sistema . fuera . println (n +  "  "  + (n * 10 ) +  "  "  + (n * 100 ) +  "  "  + (n * 1000 ));
                    }
                    romper ;

                caso  8 :
                    // tarea de ustedes
                    / *
                    presenta el digito
                    para (num; iterador> 0; i--)
                    factorial = factorial * iterador
                    
                    
                    while (num == 1) {
                        factorial = factorial - 1
                    }
                    * / 

                caso  9 :
                    / *
                    ESCRIBA UN PROGRAMA QUE LEA EL LADO DE UN CUADRADO YA CONTINUACIÓN LO IMPRIMA 
                    EN FORMA DE ASTERISCOS SU PROGRAMA DEBERa PODER FUNCIONAR PARA CUADRADOS 
                    DE TODOS TAMAÑOS ENTRE 1 Y 20. 
                    * /

                    Sistema . fuera . println ( " Cuadrado Mágico " );
                    Sistema . fuera . println ( " Inserta el número de lados: " );
                    n = entrada . nextInt ();

                    si (n > =  1  && n <= 20 ) {
                        // se puede imprimir
                        // aqui tengo las filas
                        para ( int i =  1 ; i <= n; i ++ ) {
                            // columnas
                            para ( int j =  1 ; j <= n; j ++ ) {
                                Sistema . fuera . imprimir ( " * " );

                            }
                        Sistema . fuera . println ( "  " );


                            
                        }
                    } más {
                        Sistema . fuera . println ( " Error, el rango debe de ser entre 1 y 20, intente de nuevo " );
                    }

                    romper ;



                caso  10 :

                    Sistema . fuera . println ( " Cuadrado Magico Hueco (Como tu ex asi dejo tu kokoro wiiii) " );
                    Sistema . fuera . println ( " Inserta el número de lados: " );
                    n = entrada . nextInt ();

                    si (n > =  1  && n <= 20 ) {
                        // se puede imprimir

                        // imprima la linea superior
                        para ( int i =  0 ; i < n; i ++ ) {
                            Sistema . fuera . imprimir ( " * " );
                        }
                        Sistema . fuera . println ();

                        // lo de enmedio solo quiero las esquinas
                        // cuadrado interno
                        // aqui tengo las filas
                        para ( int i =  0 ; i < n - 2 ; i ++ ) {
                            Sistema . fuera . imprimir ( " * " );
                            // columnas
                            para ( int j =  0 ; j < n - 2 ; j ++ ) {
                                Sistema . fuera . imprimir ( "   " );

                            }
                        Sistema . fuera . println ( "    * " );


                            
                        }

                        // imprimir la linea inferior
                        para ( int i =  0 ; i < n; i ++ ) {
                            Sistema . fuera . imprimir ( " * " );
                        }
                        Sistema . fuera . println ();
                    } más {
                        Sistema . fuera . println ( " Error, el rango debe de ser entre 1 y 20, intente de nuevo " );
                    }

                    romper ;

                caso  11 :
                    // tarea

                caso  12 :
                    // tarea

                caso  13 :

                    Sistema . fuera . println ( " Calculadora maizsoro " );
                    Sistema . fuera . println ( " Ingresar un número " );
                    a = entrada . nextInt ();
                    Sistema . fuera . println ( " Ingresa un segundo número " );
                    b = entrada . nextInt ();
                    Sistema . fuera . println ( " Ingresa el tipo de operación que desea realizar: (+, -, *, /) " );
                    operacion = entrada . siguiente () . charAt ( 0 );

                    / *
                    cambiar 
                        caso +
                        caso -
                        caso *
                        caso /
                    * / 

                    switch (operacion) {
                        caso  ' + '  :
                            resultado = a + b;
                            Sistema . fuera . println ( " La suma es de: "  + resultado);
                            romper ;
                        caso  ' - '  :
                            resultado = a - b;
                            Sistema . fuera . println ( " La resta es de: "  + resultado);
                            romper ;
                        caso  ' * '  :
                            resultado = a * b;
                            Sistema . fuera . println ( " La multiplicación es de: "  + resultado);
                            romper ;
                        caso  ' / '  :
                            si (b ! =  0 ) {
                                resultado = a / b;
                                Sistema . fuera . println ( " La división es de: "  + resultado);
                               
                            } más {
                                Sistema . fuera . println ( " No es posible dividir entre 0 " );
                            }
                            romper ;
                        por defecto  :
                            Sistema . fuera . println ( " Operación no valida " );

                    }

                por defecto :
                    Sistema . fuera . println ( " Gracias por ver este hermoso programa: 3 " );



        }
    
        Sistema . fuera . println ( " ¿Deseas repetir el programa? Si lo desea escriba s " );
        / *
            para recibir la respuesta debo de obtener un caracter s
            para cuando se reciben char se utiliza ''
            para cuando se reciben String se utiliza ""
        * / 
    
        letras = entrada . siguiente () . charAt ( 0 );
    
        // si el usuario ingresa si solo detecto la s es la posicion del caracter que queremos lee
    
    
    
    
    } while (letras ==  ' s ' );
    // aqui se cierra el do

   

    }

}