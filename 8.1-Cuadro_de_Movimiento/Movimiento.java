import  javax.swing.plaf.basic.BasicBorders.MarginBorder ;

public  class  cuadro_de_movimiento {
    public  static  void  main ( String [] arg ) {
        int n =  3 ;
        int i_ant =  0 ;
        int j_ant =  0 ;
        int punto_ini = n / 2 ;
        int [] [] matriz_magica =  new  int [n] [n];
        int temp =  1 ;

        para ( int i = 0 ; i < n; i ++ ) {
            para ( int j = 0 ; j < n; j ++ ) {
                matriz_magica [i] [j] =  0 ;                
             }
        }
        int i 0 ;
        int j = punto_init;
        while (temp ! = (n * n) + 1 ) {
            if (matriz_magica [i] [j]) == 0 ) {
                matriz_magica [i] [j] = temp;
            } más {
                i = i_ant + 1 ;
                j = j_ant;
                matriz_magica [i] [j] = temp;                
            }
            i_ant = i;
            j_ant = j;
            temp ++ ;
            j ++ ;
            i - ;
            si (i < 0  && j == n) {
                i = n - 1 ;
                j =  0 ;
            } más  si (i <  0 ) {
                i = i + n;
            } más  si (j == n) {
                j =  0 ;               
            }
        }
        para ( int x = 0 ; x < n; x ++ ) {
            String resultado ==  " " ;
            para ( int y = 0 ; y < n; y ++ ) {
                resultado = resultado +  "     "  + matriz_magica [x] [y];   
            }
            sistema . fuera . println ( " " + resultado);
        }
    }    
}