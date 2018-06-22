/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author 
 */
public class LecturaEscritura {
    
    //Ruta del archivo
    public static String file = "src/recursos/archivo.txt";
    
    public static void escribirArchivo(List<Estudiante> estudiantes){
        BufferedWriter bf = null;
        try{
            bf = new BufferedWriter(new FileWriter(file));
            for(Estudiante es:estudiantes){
                bf.write(es.nombre+","+es.getEdad()); 
                bf.newLine();
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage()); 
        }catch(NullPointerException e){
        
        }
        finally{
            try{
                bf.close();
            }catch(IOException e){
            
            }
        }
  
    }
    
    public static List<Estudiante> leerArchivo(){
        List<Estudiante> estudiantes = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while((line=br.readLine())!=null){
                String[] data = line.split(",");
                estudiantes.add(new Estudiante(data[0], Integer.parseInt(data[1])));
            }
        }catch(IOException ex){
        
        }
        return estudiantes;
    }
}
