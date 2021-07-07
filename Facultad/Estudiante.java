package Facultad;
import java.util.ArrayList;
import java.util.Iterator;
//Clase estudiante que extiende de persona y se le agrega un Arraylist de cursos
public class Estudiante extends Persona{
  public ArrayList Cursos;
//Constructor
  public Estudiante(String nombre,String apellido,int dni,String estado){
    super(nombre,apellido,dni,estado);
    this.Cursos=new ArrayList<Materia>();
  }
//Agrega una materia cuando el estudiante se "Inscriba".
  public void agregarmateria(Materia materia){
    this.Cursos.add(materia);
    materia.agregarestudiante(this);
  }
//Elimina materias, cuando se da de baja el estudiante 
  public void eliminarmaterias(){
    Iterator<Materia> it = Cursos.iterator();
    while(it.hasNext()){
			Materia mat = it.next();
			mat.eliminarestudiante(this);
      it.remove();
    }
  }
//Imprime los datos 
  public void impriDatos(){
		Iterator<Materia> it = Cursos.iterator();
		super.impriDatos();
		System.out.print("Cursos:");
    while(it.hasNext()){
			Materia mat = it.next();
			System.out.print(mat.getNombre()+" ");

		}
    System.out.println("");
  }
}