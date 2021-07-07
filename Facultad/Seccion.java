package Facultad;
import java.util.ArrayList;
//Clase Seccion que tiene nombre y un arraylist con el personal que trabaja ahi 
public class Seccion{
  public String nombre;
  public ArrayList personal;
//constructor
  public Seccion(String nombre){
    this.nombre=nombre;
    this.personal=new ArrayList <Personal>();
  }
//Agrega personal a la seccion
  public void agregarpersonal(Personal personal){
    this.personal.add(personal);
  }
//elimina personal de la seccion
  public void eliminarpersona(Persona personal){
    this.personal.remove(personal);
  }
//Getter del nombre de la seccion
  public String getNombre(){return this.nombre;}
}