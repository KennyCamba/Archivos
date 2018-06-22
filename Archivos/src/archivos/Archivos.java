/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.util.ArrayList;

/**
 *
 * @author Municipio de Gye
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante e = new Estudiante("n1", 20);
        Estudiante e1 = new Estudiante("n2", 21);
        Estudiante e2 = new Estudiante("n3", 22);
        Estudiante e3 = new Estudiante("n4", 23);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(e);
        e.setEdad(10); 
        estudiantes.add(e1);
        estudiantes.add(e2);
        estudiantes.add(e3);
        //LecturaEscritura.escribirArchivo(estudiantes);
        
        ArrayList<Estudiante> lista = (ArrayList<Estudiante>)LecturaEscritura.leerArchivo();
        
        for(Estudiante est: lista){
            System.out.println(est);
        }
            
    }
    
}
