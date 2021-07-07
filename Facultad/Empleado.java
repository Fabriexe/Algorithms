package Facultad;
import java.util.ArrayList;
//Empleado que extiende de Persona, se le agrega el año de incorporacion y el legajo y los despachos
public class Empleado extends Persona{
  protected int Incorporacion;
  protected int Legajo;
  protected Despacho despacho;
//constructor
  public Empleado(String nombre,String apellido,int DNI,String estado,int incorporacion,int legajo){
    super(nombre,apellido,DNI,estado);
    this.Incorporacion=incorporacion;
    this.Legajo=legajo;
  }
//Cuando se le asigna un despacho a un empleado
  public void asignardespacho(Despacho despacho){
    this.despacho=despacho;
    despacho.agregarempleado(this);
  }
//Cuando se cambia de despacho o da de baja a un empleado
  public void elimDespacho(){
    this.despacho.eliminarempleado(this);
  }
//Getters de Año de incorporacion, legajo, despacho, y id del despacho
  public int getAñoinco(){return this.Incorporacion;}
  public int getLegajo(){return this.Legajo;}
  public Despacho getDespacho(){return this.despacho;}
  public int getDespachoid(){return this.despacho.getId();}
//Para imprimir los datos polimorfica
  public void impriDatos(){
		super.impriDatos();
    System.out.println("Año de incorporacion:"+this.Incorporacion);
    System.out.println("Legajo:"+this.Legajo);
    System.out.println("Su despacho es:"+this.getDespachoid());
  }
}