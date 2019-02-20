/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase200219;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class GestionArchivo {
    private String ruta;

    public GestionArchivo(String ruta) {
        this.ruta = ruta;
    }
    
    public boolean guardar (ArrayList<Integer> bd) throws FileNotFoundException, IOException {
        File archivo = new File(this.ruta);
        
        if (!archivo.exists()){
            archivo.createNewFile();
        }
        
        PrintStream salida = new PrintStream(archivo);
        for (Integer i : bd){
            salida.print(i);
            salida.print(" ");
        }
        salida.flush(); //Hacer que los archivos no se queden.
        salida.close();
        return true;
    }
    
    public ArrayList<Integer> cargar () throws FileNotFoundException {
        ArrayList<Integer> data = new ArrayList<>();
        Scanner lectura = new Scanner(new File(this.ruta));
        
        while (lectura.hasNextInt()){
            data.add(lectura.nextInt());
        }
        
        return data;
    }
    
}
