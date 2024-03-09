package locadoraveiculosswing;

import bancolib.SqlUtil;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import locadoraveiculosswing.gui.TelaPrincipalGUI;

public class App {
    
    public static SqlUtil sqlUtil = new SqlUtil("localhost", "18745", "postgres", "postgres", "VrPost@Server");
    
    public static void main(String[] args) {
        initAparencia();
        
        TelaPrincipalGUI form = new TelaPrincipalGUI();
        form.setVisible(true);
    }
    
    private static void initAparencia(){
        FlatDarculaLaf.setup();
    }
}
