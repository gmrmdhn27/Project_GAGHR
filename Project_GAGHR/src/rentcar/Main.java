package rentcar;

import rentcar.view.LoginFrame;
import javax.swing.SwingUtilities;

public class Main {
   
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        
            new LoginFrame().setVisible(true);
        
        });
    }
    
}
