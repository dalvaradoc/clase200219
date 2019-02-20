/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase200219;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class GUI {
    
    public int menu () {
        Scanner teclado = new Scanner(System.in);
        System.out.println("1.Leer \n2.Guardar \n3.Cargar \n4.Listar \n5.Modificar \n0.Cerrar");
        int opcion = teclado.nextInt();
        return opcion;
    }
    
    public void listar (ArrayList<Integer> data){
        System.out.println("--------------");
        for (Integer value : data){
            System.out.println(value);
        }
    }
}
