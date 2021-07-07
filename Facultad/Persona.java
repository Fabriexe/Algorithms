package Facultad;
import java.util.ArrayList;
//Clase persona con Nombre Apellido, Dni y Estado civil, de esta clase se extienden los empleados y los estudiantes 
public class Persona{
  protected String Nombre;
  protected String Apellido;
  protected int DNI;
  protected String Estadocivil;
//constructores 
  public Persona(){
    this.Nombre=" ";
    this.Apellido=" ";
    this.DNI=0000000;
    this.Estadocivil=" ";
  }
  public Persona(String nombre,String apellido,int dni,String estado){
    this.Nombre=nombre;
    this.Apellido=apellido;
    this.DNI=dni;
    this.Estadocivil=estado;
  }
//Getters de nombre, apellido, DNI y  Estado civil
  public String getNombre(){return this.Nombre;}
  public String getApellido(){return this.Apellido;}
  public int getDni(){return this.DNI;}
  public String getEstado(){return this.Estadocivil;}
//Setter del estado civil
  public void setEstado(String estado){
    this.Estadocivil=estado;
  }
//Imprime los datos de la Persona
  public void impriDatos(){
    System.out.println("Nombre:"+this.Nombre);
    System.out.println("Apellido:"+this.Apellido);
    System.out.println("DNI:"+this.DNI);
    System.out.println("Estadocivil:"+this.Estadocivil);
  }
}