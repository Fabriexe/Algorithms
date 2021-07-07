package Facultad;
import java.util.ArrayList;
//Clase materia que tiene Nombre, y 2 arraylist que contienen los profesores que la dan y los estudiantes que la cursan
public class Materia{
  private String Nombre;
  public ArrayList profesores;
  public ArrayList estudiantes;
//constructor
  public Materia(String nombre){
    this.Nombre=nombre;
    this.profesores=new ArrayList<Profesor>();
    this.estudiantes=new ArrayList<Estudiante>();
  }
//agrega a un profesor a la arraylist de los profesores que dan la materia
  public void agregarprofesor(Profesor profesor){
    this.profesores.add(profesores);
  }
//agrega un estudiante a la materia 
  public void agregarestudiante(Estudiante estudiante){
    this.estudiantes.add(estudiante);
  }
//da de baja un estudiante 
  public void eliminarestudiante(Estudiante estudiante){
    this.estudiantes.remove(estudiante);
  }
//da de baja a un profesor 
  public void eliminarprofesor(Profesor profesor){
    this.profesores.remove(profesor);
  }
//getter del nombre de la materia 
  public String getNombre(){return this.Nombre;}
}