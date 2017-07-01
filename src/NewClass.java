/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author educacionit
 */
public class NewClass {
        
    
    public static void main(String[] args) {
        System.out.println("Interfaz Runneable");
        
        class Hilo implements Runnable{
            private String descripcion;

            public Hilo(String descripcion) {
                this.descripcion = descripcion;
            }
            
            @Override
            public void run() {
                for(int a = 1; a< 10; a++){
                    System.out.println(descripcion + " : " + a);
                    dormir(500);
                }
            }
            private void dormir(int ms){
                try{
                    Thread.sleep(ms);
                }catch(Exception e){
                    System.out.println(e);
                }//FIN MANEJO DE ERRORES 
            } // FIN DORMIR
        } // fin de clase new class
    Hilo hilo1 = new Hilo("Hilo1");    
    Hilo hilo2 = new Hilo("Hilo2");
    
    Thread thilo1 =  new Thread(hilo1);
    Thread thilo2 =  new Thread(hilo2);
        thilo1.start();
        thilo2.start();
        
    new Thread(new Hilo("hilo3")).start();
    }
   
}
