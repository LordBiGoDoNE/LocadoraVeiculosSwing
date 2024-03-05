package locadoraveiculosswing;

import bancolib.SqlUtil;
import locadoraveiculosswing.gui.TelaPrincipalGUI;

public class App {
    
    public static SqlUtil sqlUtil = new SqlUtil("localhost", "18745", "locadora", "postgres", "VrPost@Server");
    
    public static void main(String[] args) {
        TelaPrincipalGUI form = new TelaPrincipalGUI();
        form.setVisible(true);
    }
}
