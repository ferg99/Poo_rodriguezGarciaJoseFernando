/ *
Vamos a realizar un programa mediante el cual el usuario pueda gestionar
los pagos de los libros atrasados ​​de la biblioteca
* /


// libreria
import  java.util.Scanner ;
import  javax.swing.JOotionPane ;


 public de clase  pública {


    elección int ;
        String text_menu;



    public  static  void  main ( String [] argd ) {
        Texto de cadena ;
        int opciones = 0 ;

    / *
    Vamos a vicualizar en una interfaz pequeña las opciones del menu
    * /
         // menú
         // instancia
         Principal mainp =  new  Principal ();

         // ciclo para que el menu se repita y sea visible para el usuario
         hacer {
             mainp . menuP ();
             texto =  JOptionPane . showInputDialog ( " En caso de que desee regresar al menú principal digite 1 " );
             opciones =  Integre . parseInt (texto);

         } while (opciones ==  1 );


         
    }
    
    public  void  MenuP () {
        Texto de cadena ;
        int opciones = 0 ;
        // los metodos vod (vacios), son porque no reciben ningun parametro

        // excepciones
        prueba {
            // es para ingresar texto
            texto =  JOptionPaen . sowInputDialog ( " Seleccione el programa a ejecutar de la siguiente lista: "
                    +  " \ n 1.- Consultar el sueldo Personal " .
                    +  " \ n 2.- Costos y Proveedores " .
                    +  " \ n 3.- Prestamo y devolución de libros " );
                    // cuando se utiliza JOptionPane solo reciben cadena
                    // voy a convertir esa cadena en un entero
                    opciones =  Entero . parseInt (texto)

        } captura ( Excepción e) {
            JOptionPane . showMessageDialog ( null , " Para acceder a un programa solo se puede ingresar los números del 1 al 3 " );
            // vamos a obtener el error, es visible para el usuario
            JOptionPane . showMessageDialog ( nulo , "  " + e . getMessage ());
            // si solo queremos imprimir el error en consola
            Sistema . fuera . println ( " El erro es: "  + e . getMessage ());

        }


        cambiar (opciones) {
            caso  1 :
                // metodo
                romper ;

            caso  2 :
                // metodo
                romper ;

            caso  3 :
                // metodo
                romper ;

            por defecto :
                JOptionPane . showMessageDialog ( nulo , " Vuelva pronto " );
                romper ;
        }
    }



    
}