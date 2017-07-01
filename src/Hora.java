
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author educacionit
 */
public class Hora implements Runnable{
    
    private JTextField swText =  null;
    private JLabel swLabel=  null;
    private TextField fxText=  null;
    private Label fxLabel=  null;
    
    @Override
    public void run() {
        while(true){
                LocalDateTime ldt = LocalDateTime.now();
                setText(ldt.getHour() +":"+ldt.getMinute()+":"+ldt.getSecond());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
    }


    public Hora(Label fxLabel) {
        this.fxLabel = fxLabel;
    }

    public Hora(TextField fxText) {
        this.fxText = fxText;
    }

    public Hora(JLabel swLabel) {
        this.swLabel = swLabel;
    }

    public Hora(JTextField swText) {
        this.swText = swText;
    }
    
    public void setText(String text){
    if(swText!=null) swText.setText(text);
    if(swLabel!=null) swLabel.setText(text);
    if(fxText!=null) fxText.setText(text);
    if(fxLabel!=null) fxLabel.setText(text);
    }
}
