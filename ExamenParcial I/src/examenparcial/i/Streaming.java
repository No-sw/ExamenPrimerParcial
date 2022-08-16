/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenparcial.i;

/**
 *
 * @author Toshiba
 */
public abstract class Streaming {
    private String NombreStreaming;
    private String Tipo;
    private int calificacion;
    
    Streaming(String NombreStreaming, String Tipo, int calificacion){
        this.NombreStreaming = NombreStreaming;
        this.Tipo = Tipo;
        this.calificacion = calificacion;
    }
    
    protected void Calificacion(int calificacion){
        this.calificacion = calificacion;
    }
    
    protected abstract void obtenerCapitulo();
    
    protected abstract void obtenerTipo();
}
