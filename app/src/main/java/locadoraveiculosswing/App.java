package locadoraveiculosswing;

import bancolib.ConexaoBanco;
import com.formdev.flatlaf.FlatDarculaLaf;
import locadoraveiculosswing.gui.TelaPrincipalGUI;

public class App {

    public static void main(String[] args) {
        initAparencia();
        ConexaoBanco.initDB("localhost", "18745", "postgres", "postgres", "VrPost@Server");

        TelaPrincipalGUI form = new TelaPrincipalGUI();
        form.setVisible(true);
    }

    private static void initAparencia() {
        FlatDarculaLaf.setup();
    }
}
