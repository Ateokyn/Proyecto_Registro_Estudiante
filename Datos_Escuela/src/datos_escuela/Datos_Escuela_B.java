package datos_escuela;

//se crea una segunda clase para crear instancias
public class Datos_Escuela_B {
    
    //Se declaran las variables donde se almacenaran los datos ingresados por el usuario.
    private int ID_Alumno_B = 0;
    private String nombre_Alumno_B = "";
    private String apellidio_Alumno_B = "";
    private int edad_Alumno_B = 0;
    private char genero_Alumno_B = ' ';
    private char sesion_Alumno_B = ' ';

    public Datos_Escuela_B(int ID_Alumno, String nombre_Alumno, String apellido_Alumno, int edad_Alumno, char genero_Alumno, char sesion_Alumno) {
        //Creo un contructor para pasar el objeto de las variables obtenidas.
        this.ID_Alumno_B = ID_Alumno;
        this.nombre_Alumno_B = nombre_Alumno;
        this.apellidio_Alumno_B = apellido_Alumno;
        this.edad_Alumno_B = edad_Alumno;
        this.genero_Alumno_B = genero_Alumno;
        this.sesion_Alumno_B = sesion_Alumno;
    }
    public int getID_Alumno_B() {
        return ID_Alumno_B;
    }

    public void setID_Alumno_B(int ID_Alumno_B) {
        this.ID_Alumno_B = ID_Alumno_B;
    }

    public String getNombre_Alumno_B() {
        return nombre_Alumno_B;
    }

    public void setNombre_Alumno_B(String nombre_Alumno_B) {
        this.nombre_Alumno_B = nombre_Alumno_B;
    }

    public String getApellidio_Alumno_B() {
        return apellidio_Alumno_B;
    }

    public void setApellidio_Alumno_B(String apellidio_Alumno_B) {
        this.apellidio_Alumno_B = apellidio_Alumno_B;
    }

    public int getEdad_Alumno_B() {
        return edad_Alumno_B;
    }

    public void setEdad_Alumno_B(int edad_Alumno_B) {
        this.edad_Alumno_B = edad_Alumno_B;
    }

    public char getGenero_Alumno_B() {
        return genero_Alumno_B;
    }

    public void setGenero_Alumno_B(char genero_Alumno_B) {
        this.genero_Alumno_B = genero_Alumno_B;
    }

    public char getSesion_Alumno_B() {
        return sesion_Alumno_B;
    }

    public void setSesion_Alumno_B(char sesion_Alumno_B) {
        this.sesion_Alumno_B = sesion_Alumno_B;
    
    }

}
