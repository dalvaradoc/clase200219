/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase200219;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Gestion de Enteros");
        int valor = 0, posicion = 0;
        GUI gui = new GUI();
        DAO bd = new DAO();
        GestionArchivo archivos = new GestionArchivo("enteros.txt");
        boolean ciclo = true;
        
        Scanner lectura = new Scanner(System.in);
        while (ciclo){
            int opcion = gui.menu();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese dato");
                    valor = lectura.nextInt();
                    bd.addBd(valor);
                    break;
                case 2:
                    System.out.println("Guardando...");
                    archivos.guardar(bd.getBd());
                    break;
                case 3:
                    System.out.println("Cargando archivo");
                    bd.setBd(archivos.cargar());
                    break;
                case 4:
                    System.out.println("Lista");
                    gui.listar(bd.getBd());
                    break;
                case 5:
                    System.out.println("Ingrese posicion");
                    int pos = lectura.nextInt();
                    System.out.println("Ingrese numero");
                    valor = lectura.nextInt();
                    if(!bd.modificar(valor, pos)){
                        System.out.println("Los valores de posicion no son validos");
                    }
                    break;
                case 0:
                    ciclo = false;
            }
        }
    }
    
}
