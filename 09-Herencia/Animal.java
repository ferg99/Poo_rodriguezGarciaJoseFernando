

/ *
vamos a crear un programa para guardar los datos de animales domésticos
* /

 animal de clase  pública {

    / *
    Encapsulamiento:
    Es poder restringir el acceso a los tipos de dato
    Vamos a poder agrupar en una clse el acceso e los diferentes
    metodos, atributos u objetos de clase, para 
    que no pueden ser modificados desde otro lugar 
    * /

    Private  String nombre, raza, tipo_alimento;
    private int edad;
    // sexo boleano privado = falso;

    
    / *
    Cuando estamos aplicando el escapsulamiento se debe de agregar los metodos
    constructores
    El constructor nos sirve para poder detectar la existencia de una clase
    para poder inicializar las variables de la clase
    para poder hacer las instancias de la clase
    * /

    Public  Animal () {
        // esto es un constructor
        / *
        podemos inicializar las variables
        podemos aplicar la sobrecarga 
        * /
    }
    
    public Animal ( Cadena  nombre , cadena  raza , Cadena  tipo_alimento , int  age , boolean  sexo ) {
        // podemos realizar operaciones con cada unu de los parametros
        / *
        
        * /
        esto . nombre = nombre;
        esto . raza = raza;
        esto . tipo_alimento = tipo_alimento;
        esto . edad = edad;
        esto . sexo = sexo;
    }
    / *
    cuando los atributos son de tipo private:
    debemos de acceder a los datos a traves del uso de los metodos
    obtener obtener -> recibir
    establecer asignar -> enviar
    * /
    // recibir
    public  String  getNombre () {
        return nombre;
    }

    // enviar
    public  void  setNombre () {
        esto . nombre =  Nombre ;
    }
    // recivir
    public  String  getRaza () {
        volver raza;
    }

    // enviar
    public  void  setRaza () {
        esto . raza =  Raza ;
    }
     // recivir
     public  String  getTipo_alimento () {
        volver raza;
    }

    // enviar
    public  void  setTipo_alimento () {
        esto . tipo_alimento =  Tipo_alimento ;
    }
    // recivir
    public  int  getEdad () {
        return edad;
    }

    // enviar
    public  void  setEdad () {
        esto . edad =  Edad ;
    }
    // recibir
    public  Boolean  getSexo () {
        volver  Sexo ;
    }

    // enviar
    public  void  setSexo () {
        esto . Sexo  = sexo;
    }

}