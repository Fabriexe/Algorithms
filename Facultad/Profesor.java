package Facultad;
import java.util.ArrayList;
//Clase profesor que extiende de empleado y se le agrega departamento y curso
public class Profesor extends Empleado{
  public String Departamento;
  public Materia Curso;
//constructor
  public Profesor(String nombre,String apellido,int DNI,String estado,int incorporacion,int legajo,String departamento){
    super (nombre,apellido,DNI,estado,incorporacion,legajo);
    this.Departamento=departamento;
  }
//Getter del departamento donde pertenece el profesor 
  public String getDepartamento(){return this.Departamento;}
//Setter del departamento al que pertenece
  public void setDepartamento(String departamento){
    this.Departamento=departamento;
  }
//Desvincula la persona del departamento
  public void elimDepartamento(){
    this.Departamento="Ninguno";
  }
//Se agrega la materia que da el profesor 
  public void SetMateria(Materia materia){
    this.Curso=materia;
    materia.agregarprofesor(this);
  }
//Se da de baja a la materia que da 
  public void elimMateria(){
    this.Curso.eliminarprofesor(this);
    this.Curso=null;
  }
//Getter de la materia que da 
  public Materia getMateria(){return this.Curso;}
//imprime datos
  public void impriDatos(){
		super.impriDatos();
    System.out.println("Pertenece al departamento de:"+this.Departamento);
    System.out.println("Materia que da:"+this.Curso.getNombre());
  }
}