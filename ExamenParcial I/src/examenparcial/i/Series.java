/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenparcial.i;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class Series extends Streaming{
    private String contenido[] = {"Terror", "Comedia", "Drama"};
    private int capitulo;
    private String nombre;
    private int calificacion;
    char opcion;
    Scanner entrada = new Scanner(System.in);
    
    Series(int calificacion){
        this.calificacion = calificacion;
    }
    
    public void obtenerCapitulo(){
       for (int i=0; i < 100; i++){
           capitulo = i;
           System.out.println("Capitulo: "+capitulo);        
    }
    
    public void obtenerTipo(){
       for(int i=0; i < contenido.length; i++){
        System.out.println("Contenido a visualizar"+contenido[i]);
        System.out.println("Este es el contenido que desea ver");
        opcion = entrada.next().charAt(0);
        if(opcion == 's' || opcion == 'S'){
        break;  
        }
       }
    }    

    @Override
    protected void obtenerTipo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
