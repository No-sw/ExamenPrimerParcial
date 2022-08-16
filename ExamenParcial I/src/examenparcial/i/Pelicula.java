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
public class Pelicula extends Streaming{
    private String contenido[] = {"Terror", "Comedia", "Drama"};
    private int cantidadTiempo;
    private String nombre;
    private int calificacion;
    char opcion;
    Scanner entrada = new Scanner(System.in);
    
    Pelicula(int calificacion){
        this.calificacion = calificacion;
    }
    
    public void obtenerCapitulo(){
       for (int i=0; i < 3; i++){
           cantidadTiempo = i;
           System.out.println("Horas visualizando: "+cantidadTiempo);        
    }
    
    public void obtenerTipo(){
       for(int i=0; i < contenido.length; i++){
        System.out.println("Contenido a visualizar"+contenido[i]);
        System.out.println("Este es el contenido que desea ver?");
        opcion = entrada.next().charAt(0);
        if(opcion == 's' || opcion == 'S'){
        break; 
        }
      } 
    }
}
