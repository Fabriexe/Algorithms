package Facultad;
import java.util.ArrayList;
//Clase Personal se extiende de Empleado y agrega Seccion
public class Personal extends Empleado{
  public Seccion seccion;
//Constructor
  public Personal(String nombre,String apellido,int DNI,String estado,int incorporacion,int legajo){
  super (nombre,apellido,DNI,estado,incorporacion,legajo);
  }
//Se le asigna una seccion al personal
  public void setSeccion(Seccion seccion){
    this.seccion=seccion;
    seccion.agregarpersonal(this);
  }
//Getter de la seccion en la que trabaja el personal
  public Seccion getSeccion(){return this.seccion;}
//Se le da de baja o cuando se le cambia la seccion a alguien del personal
  public void elimSeccion(){
    this.seccion.eliminarpersona(this);
  }
//imprime los datos 
  public void impriDatos(){
		super.impriDatos();
    System.out.println("Pertenece a la seccion de:"+this.seccion.getNombre());
  }
}