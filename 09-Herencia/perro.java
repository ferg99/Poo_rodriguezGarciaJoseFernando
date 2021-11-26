/ *
para poder aplicar la herencia de una clase, se utiliza la palabra resevada
se extiende
eso significa que la clase va a heredar de un clase padre
Animal es la clase padre
perro es la clase hija
* /

 perro de clase  pública extiende Animal {  
    / *
    Aqui deberia de colocar cada atributo
    nombre, raza, edad, tipo_alimento, sexo
    * /

    String ladrido;

    public  Perro () {
        // constructor de la clase
    }

    // sobrecarga para obtener y enviar el ladrido
    public  Perro ( String  nombre , String  raza , String  tipo_alimento , int  edad , boolean  sexo , String  ladrido ) {
        // para poder obtener los atributos por herencia
        // se debe colocar super
        super (nombre, raza, tipo_alimento, edad, sexo);
        esto . ladrido = ladrido;

    }
    public  String  getLadrido () {
        regreso  Ladrido ;
    }

    // enviar
    public  void  setLadrido () {
        esto . ladrido =  Ladrido ;
    }

    // metodo para mostrar la informacion del perro
    public  void  mostrarPerro () {
        Systen . fuera . println ( " El nombre del perro es: "  + getNombre () + " \ n "
                            +  " Su raza es: "  + getRaza () + " \ n "
                            +  " Se alimente de: "  + getTipo_alimento () + " \ n "
                            +  " Tiene la edad de: "  + getEdad () + " \ n "
                            +  " Su sexo es: "  + getSexo () + " \ n "
                            +  " Su ladrido es: "  + ladrido + " \ n " );
    } 
}