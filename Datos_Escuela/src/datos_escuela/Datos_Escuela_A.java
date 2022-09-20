package datos_escuela;
/*
 *Este programa fue creado por Kenny ATO.
 *Con el fin de: Analizar o Modificar su codigo.
 *Desarrollado en  : NetBeans IDE 8.2(Programming Language Java).
 */
import java.util.Scanner;//Uso la libreria Scanner para consola.
/**
 *
 *@author Kenny Tellez
 */
public class Datos_Escuela_A {
//Creo un Metodo main(Principal).
    public static void main(String[] args) {
        //Uso dos Scanner para componer un bug con declaraciones String.
        //Tambien para pedir datos desde teclado.
        Scanner in = new Scanner(System.in);
        Scanner en = new Scanner(System.in);

        //Solo es estilo.
        System.out.println("------------------------");
        System.out.println("Ingrese datos del Alumno");
        System.out.println("------------------------");

        /*
         *Imprimo preguntas. Para que el usuario los rellene, y poder recolectar los datos que se desea obtener.
         */
        System.out.print("ID del Alumno      : ");
        int ID_Alumno = in.nextInt();
        
        System.out.print("Nombre del Alumno  : ");
        String nombre_Alumno = en.nextLine();
        
        System.out.print("Apellido del Alumno: ");
        String apellido_Alumno = en.nextLine();
       
        System.out.print("Edad del Alumno    : ");
        int edad_Alumno = in.nextInt();
        
        System.out.print("Genero del Alumno  : ");
        char genero_Alumno = in.next().charAt(0);
        
        System.out.print("Sesión del Alumno  : ");
        char sesion_Alumno = in.next().charAt(0);
       
        //Se invoca la segunda clase para imprimir los datos recolectados.
        Datos_Escuela_B escuela_b = new Datos_Escuela_B(ID_Alumno, nombre_Alumno, apellido_Alumno, edad_Alumno, genero_Alumno, sesion_Alumno);
        System.out.println("--------------------------------------------------");
        System.out.println("Datos Ingresados");
        System.out.println("--------------------------------------------------");
        //Se utiliza el metodo get para mostrar datos en consola
        System.out.println("ID Alumno           : " + escuela_b.getID_Alumno_B());
        System.out.println("Nombre del Alumno   : " + escuela_b.getNombre_Alumno_B());
        System.out.println("Apellido del Alumno : " + escuela_b.getApellidio_Alumno_B());
        System.out.println("Edad del Alumno     : " + escuela_b.getEdad_Alumno_B());
        System.out.println("Genero del Alumno   : " + escuela_b.getGenero_Alumno_B());
        System.out.println("Sesión del Alumno   : " + escuela_b.getSesion_Alumno_B());
        System.out.println("--------------------------------------------------");

    }

}
