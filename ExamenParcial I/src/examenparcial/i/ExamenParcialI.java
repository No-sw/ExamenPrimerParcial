/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenparcial.i;
import java.util.Scanner;
/**
 *
 * @author Toshiba
 */
public class ExamenParcialI {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int calificacion;
        String contenido;
        
        System.out.print("Ingrese su calificacion: ");
        calificacion = entrada.nextInt();
        
        Pelicula nuevoStreaming = new Pelicula(calificacion);
    }   
}
