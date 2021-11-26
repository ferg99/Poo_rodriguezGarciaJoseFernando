
import  java.util.Scanner ;
import  java.lang.Math ;

 clase  pública Figura {
    // variables globales
    doble lado, altura, área, perimetro, lado2, lado3, diametro, base;
    int opcion;
    char letra;

    // objeto
    Entrada del escáner =  nuevo  escáner ( System . In);


     menú vacío  público () {
        / *
        Vamos a realizar un programa que se encargue de realizar el calculo
        del area y perimetro de:
        cuadrado
        triangulo
        circulo
        * /
        hacer {
            Sistema . fuera . println ( " Programa de cálculo de área y perimetro. " );
            Sistema . fuera . println ( " Elija la opcion deseada: " );
            Sistema . fuera . println ( " 1.- Cuadrado " );
            Sistema . fuera . println ( " 2.- Triángulo " );
            Sistema . fuera . println ( " 3.- Círculo " );
            Sistema . fuera . println ( " 4.- Salir " );

            opcion = entrada . nextInt ();

            cambiar (opcion) {
                caso  1 :
                    calcularCuadrado ();             
                    romper ;

                caso  2 :
                    calcularTriangulo ();                
                    romper ;

                caso  3 :
                    calcularCirculo ();                
                    romper ;
            
                por defecto :
                    Sistema . fuera . println ( " Gracias hasta la proxima " );
                    romper ;
            }
            Sistema . fuera . println ( "¿ Desea repetir el programa? S para repetir " );
            letra = entrada . siguiente () . charAt ( 0 );

        } while (letra ==  ' s '  || letra ==  ' S ' );
    }

    public  void  calcularCuadrado () {
        // hacer
        prueba {
            Sistema . fuera . println ( " Ingrese el valor del lado del cuadrado: " );
            // hacer
            lado = entrada . nextDouble ();
            perimetro = lado * 4 ;
            area = lado * lado;
            Sistema . fuera . println ( " El perimetro es de: "  + perimetro +  " y su area es de: "  + area);
        } captura ( Excepción e) {
            Sistema . fuera . println ( " Ingresa unicamente valores numéricos " );
            Sistema . fuera . println ( " Error: "  + e . getMessage ());

        }
        
        
    }

    public  void  calcularTriangulo () {
        Sistema . fuera . println ( " Ingrese 1 para el area y 2 para el perimetro " );
        opcion = entrada . nextInt ();

        cambiar (opcion) {
            caso  1 :
                Sistema . fuera . println ( " Ingresa la base del triguangulo: " );
                base = entrada . nextDouble ();
                Sistema . fuera . println ( " Ingresa la altura del triangulo: " );
                altura = entrada . nextDouble ();
                área = (base * altura) / 2 ;
                Sistema . fuera . println ( " El area es de: "  + area);              
                romper ;
            caso  2 :
                Sistema . fuera . println ( " Ingresa el primer lado del triangulo: " );
                lado = entrada . nextDouble ();
                Sistema . fuera . println ( " Ingresa el segundo lado del triangulo: " );
                lado2 = entrada . nextDouble ();
                Sistema . fuera . println ( " Ingresa el tercer lado del triangulo: " );
                lado3 = entrada . nextDouble ();
                perimetro = lado + lado2 + lado3;
                Sistema . fuera . println ( " El perimetro es de: " + perimetro);
                romper ;
        
            por defecto :
                Sistema . fuera . println ( " Opción no valida " );
                romper ;
        }
    }

    public  void  calcularCirculo () {
        Sistema . fuera . println ( " Ingrese 1 para el area y 2 para el perimetro " );
        opcion = entrada . nextInt ();

        cambiar (opcion) {
            caso  1 :
                Sistema . fuera . println ( " Ingresa el radio del circulo: " );
                lado = entrada . nextDouble ();

                // pi * r * r
                área =  Matemáticas . PI * lado * lado;
                Sistema . fuera . println ( " El area es de: "  + area);

                
                romper ;
            caso  2 :
                Sistema . fuera . println ( " Ingresa el diametro del circulo: " );
                diametro = entrada . nextDouble ();
                perimetro =  3,1416 * diametro;

                Sistema . fuera . println ( " El perimetro es de: " + perimetro);
                romper ;
        
            por defecto :
            Sistema . fuera . println ( " Opción no valida " );
                romper ;
        }

    }
}