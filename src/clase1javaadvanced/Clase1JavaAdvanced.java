/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 // Curso Java Advandec.  15Hrs.
// Profesor Carlos rios Carlos.rios@educacionit.com

//atento al Maven

/*Supongamos una tarea multihilo
    -1- carGar el archivo 1 file 1 del disco 1 exagerando 10 segs
    -2- cargar el archivo 2 file 2 del disco 2 exagerando otros 10 segundos
    -3-  Abrir Formulario Mostrando el contenido de los dos archivos. tiempo estimado 1 seg.



observaciones sobre el funcionamiento de mi hard
La etapa mas lenta de mi proceso es mi HD--> leer info en este
lo mas rapido es trabajar dentro del ordenador. (Trabajo en memoria)



*/
package clase1javaadvanced;


/**
 *
 * @author educacionit
 */
public class Clase1JavaAdvanced {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Esto es procesador y memeodia Micrones de segundos en tiempo
        
//        long suma= 0 ;
//        for (int a = 1 ; a <=1000000000;a++){
//            suma+=a;
//        }
//        //Impresio por consola es mas lentro que el procesamiento interno

    //aca los 38 segs que tardo, fueron de OUTPUT 

//        //Otro ej de esta lentitud es la busqueda de info en el disco
//        System.out.println(suma);
//        for(int a = 1; a<= 1000000;a++){
//            System.out.println(a);
//        }

    //  Cantidad de nucleos del microprocesador
    
 
        //System.out.println("nucleos: "  +Runtime.getRuntime().availableProcessors());
        
        //clase interna
        class Hilo extends Thread{ //esta es una xtension de una clase hilo
        //y va a ejecutar el metodo Start, que hat que sobreescribirlo
            private String descripcion;

            public Hilo(String descripcion) {
                this.descripcion = descripcion;
            }
            
            @Override //Vamos a sobreescribir un metodo pertteneciente a la clase padre
            
            public void run() {
                for(int a = 1; a<=10; a++){
                    System.out.println(descripcion +":"+a);
                    dormir(0);
                    this.yield();
                }
                
            }

            private void dormir(int ms) {
                try {
                    Thread.sleep(ms);
                //} catch (InterruptedException ex) {
                    } catch (Exception ex) {
                    //Logger.getLogger(Clase1JavaAdvanced.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println(ex); 
                }
            }
            

        }   //final de mi clase hilo
        
            //INSTANCIAS DE MI HILO
            
        Hilo hilo1 = new Hilo("hilo 1");
        Hilo hilo2 = new Hilo("hilo 2");
        System.out.println(hilo1.getClass().getName());
        
        //El metodo start no ejecuta en un hilo
        
        //hilo1.start();
        //hilo2.start();
        
        //el metodo run invoca al metodo Start en un hilo
        
        hilo1.start();
        hilo2.start(); //cuando bajamos el Sleep varia el orden de ejecucioon entre cada hilo
                      // la aperrtura tarda
        
                      
        new Hilo("Hilo3").start();
        
                      
        System.out.println("--Fin del programa.--");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        
        System.err.println("Ocurrio un errir!:");
    }// end main
    
}// end class
