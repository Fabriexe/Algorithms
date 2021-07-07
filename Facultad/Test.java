package Facultad;
public class Test{
  public void Test(){
    //Creo Facultad
    Facultad uncu=new Facultad("Ingenieria");
    //creo materias y la agrego a la facultad
    Materia mat1= new Materia("Matematica");
    uncu.agregarmaterias(mat1);
    Materia mat2= new Materia("Lengua");
    uncu.agregarmaterias(mat2);
    //creo profesores y les asigno materias
    Profesor pro1= new Profesor("Juan","Lopez",4232,"Soltero",2017,123,"Literatura");
    uncu.agregarPersona(pro1);
    pro1.SetMateria(mat2);
    Profesor pro2= new Profesor("Ana","Perez",4233,"Casada",2017,004,"Matematica");
    //Agrega a la persona a la universidad
    uncu.agregarPersona(pro2);
    pro2.SetMateria(mat1);
    //Creo los despachos y se los asigno a los profesores
    Despacho des1= new Despacho(3);
    uncu.agregardespacho(des1);
    pro1.asignardespacho(des1);
    Despacho des2= new Despacho(2);
    uncu.agregardespacho(des2);
    pro2.asignardespacho(des2);
    //Creo las Secciones
    Seccion sec1= new Seccion("Biblioteca");
    uncu.agregarseccion(sec1);
    Seccion sec2=new Seccion("Sala de profesores");
    uncu.agregarseccion(sec2);
    //Creo Personal
    Personal per1= new Personal("Martin","Coria",4523,"Soltero",2018,133);
    uncu.agregarPersona(per1);
    Personal per2= new Personal("Martina","Perez",4213,"Soltero",2018,143);
    uncu.agregarPersona(per2);
    //asigno las Secciones
    per1.asignardespacho(des2);
    per2.asignardespacho(des2);
    per1.setSeccion(sec1);
    per2.setSeccion(sec2);
    //Creo Estudiantes
    Estudiante est1= new Estudiante("Fabricio","Espejo",4233,"Soltero");
    uncu.agregarPersona(est1);
    est1.agregarmateria(mat1);
    est1.agregarmateria(mat2);
    Estudiante est2= new Estudiante("Facundo","Mercado",4255,"Soltero");
    uncu.agregarPersona(est2);
    //Estudiante 2 se matricula a 1 curso
    est2.agregarmateria(mat1);
    pro1.impriDatos();

    pro1.setEstado("Comprometido");
    uncu.cambiarDespacho(des2,pro1.getDespacho(),pro1);
    pro1.setDepartamento("Informatica");
    System.out.println("------------------------------------------------");
    pro1.impriDatos();
    System.out.println("------------------------------------------------");
    per1.impriDatos();
    System.out.println("------------------------------------------------");
    uncu.cambiarSeccion(sec2,per1.getSeccion(),per1);
    per1.impriDatos();
    uncu.imprimpersonas();
    uncu.darBaja(4213);
    System.out.println("LISTA DESPUES DE DAR DE BAJA");
    
    uncu.imprimpersonas();
  }
}