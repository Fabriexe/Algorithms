package Facultad;
import java.util.ArrayList;
//Despacho tiene un id para identificarlo y adentro los empleados en un arraylist
public class Despacho{
  private int ID; 
  public ArrayList Empleados;
	//constructor
  public Despacho(int id){
    this.Empleados=new ArrayList<Empleado>();
    this.ID=id;
  }
  //Para agregar los empleados a los que se les asigna el despacho
  public void agregarempleado(Empleado empleado){
    this.Empleados.add(empleado);
  }
  //Para eliminar los empleados a los que se les da de baja o le cambian el despacho
  public void eliminarempleado(Empleado empleado){
    this.Empleados.remove(empleado);
  }
  //para obtener el id del despacho
  public int getId(){return this.ID;}
}