package Facultad;
import java.util.ArrayList;
import java.util.Iterator;
//Clase facultad, que tiene en su interior ArrayList de materia,despacho,secciones,estudiantes,persona,profesores
public class Facultad{
  private String nombre;
  private ArrayList materias;
  private ArrayList despachos;
  private ArrayList secciones;
  private ArrayList estudiantes;
  private ArrayList personal;
  private ArrayList profesores;
//constructor
  public Facultad(String nombre){
    this.nombre=nombre;
    this.materias= new ArrayList <Materia>();
    this.despachos= new ArrayList <Despacho>();
    this.secciones= new ArrayList <Seccion>();
    this.estudiantes= new ArrayList <Estudiante>();
    this.personal=new ArrayList <Personal>();
    this.profesores= new ArrayList <Profesor>();
  }
//Agrega un despacho a la arraylist de la facultad
  public void agregardespacho(Despacho despacho){this.despachos.add(despacho);}
//Agrega una seccion a la facultad
  public void agregarseccion(Seccion seccion){this.secciones.add(seccion);}
//Agrega materias a la facultad
  public void agregarmaterias(Materia mat){this.materias.add(mat);}
//Get del nombre de la Facultad
  public String getNombre(){return this.nombre;}
//Agrega una persona, segun el tipo que sea la ubica en su correspondiente lista 
	public void agregarPersona(Persona persona){
		if(persona instanceof Estudiante){
			this.estudiantes.add(persona);
		}
    else if(persona instanceof Profesor){
      this.profesores.add(persona);
		}
    else{
			this.personal.add(persona);
		}
	}
//Cambia es despacho de un empleado
  public void cambiarDespacho(Despacho des1,Despacho des2,Empleado empleado){
    empleado.asignardespacho(des1);
    des2.eliminarempleado(empleado);
  }
//Cambia la seccion del personal
  public void cambiarSeccion(Seccion sec1,Seccion sec2,Personal personal){
    sec2.eliminarpersona(personal);
    personal.setSeccion(sec1);
  }
//da de baja a una persona por su DNI, con un iterador la busca en las listas y le da de baja 
  public void darBaja(int dni){
    Iterator<Estudiante> it= estudiantes.iterator();
    while (it.hasNext()){
      Estudiante est=it.next();
      if (est.DNI==dni){
        est.eliminarmaterias();
        it.remove();
        return;
      }
    }
    Iterator <Profesor> it1= profesores.iterator();
    while (it1.hasNext()){
      Profesor pro=it1.next();
      if (pro.DNI==dni){
        pro.elimMateria();
        pro.elimDepartamento();
        pro.elimDespacho();
        it1.remove();
        return;
      }
    }
    Iterator <Personal> it2= personal.iterator();
    while (it2.hasNext()){
      Personal per=it2.next();
      if (per.DNI==dni){
        per.elimSeccion();
        per.elimDespacho();
        it2.remove();
        return;
      }
    }
  }
//imprime todas las personas que son de la facultad 
  public void imprimpersonas(){
    Iterator<Estudiante> it= estudiantes.iterator();
    while (it.hasNext()){
      System.out.println("-------------------------------------------------------------------------------");
      Estudiante est=it.next();
      est.impriDatos();
      }
    Iterator <Profesor> it1= profesores.iterator();
    while (it1.hasNext()){
      System.out.println("-------------------------------------------------------------------------------");
      Profesor pro=it1.next();
      pro.impriDatos();
    }
    Iterator <Personal> it2= personal.iterator();
    while (it2.hasNext()){
      System.out.println("-------------------------------------------------------------------------------");
      Personal per=it2.next();
      per.impriDatos();
    }
  }
}