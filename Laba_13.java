import java.awt.*;
import java.awt.event.*;
public class Laba_13 extends Frame{
    Laba_13(String s){
        super(s);
        setSize(400,150);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent ev) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args){
        new Laba_13("Моя программа");
    }
}
