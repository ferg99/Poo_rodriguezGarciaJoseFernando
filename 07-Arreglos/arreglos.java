import  java.util.Scanner ;
import  java.util.scanner ;

 clase  pública Arreglos {
    public  static  void  main ( String [] args ) {
        int aprobados = 0 ;
        int reprobados = 0 ;
        int excelentes = 0 ;
        float calif = 0 ;

        int i = 1 ;
        Scanner sc = nuevo  Scanner ( System . In);
        mientras que (i <= 10 ) {
            
            Sistema . fuera . println ( " Introducir promedio de los alumnos del 0 al 10: " );
            calif = sc . nextFloat ();
            if ( Calif  > =  9  && calif <=  10 ) {
                excelentes ++ ;
            }
            más  si (calif > = 6 ) {
                aprobados ++ ;
            }
            else {
                reprobados ++ ;
                i ++ ;
            }
            Sistema . fuera . println ( " Cantidad de alumnos aprobados:   "  + aprobados);
            Sistema . fuera . println ( " Cantidad de alumnos reprobados:   "  + reprobados);
            Sistema . fuera . println ( " Cantidad de alumnos excelente:   "  + excelentes);

        }        
    }
 }    