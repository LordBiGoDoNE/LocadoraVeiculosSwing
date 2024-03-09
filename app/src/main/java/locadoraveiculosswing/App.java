package locadoraveiculosswing;

import bancolib.SqlUtil;
import com.formdev.flatlaf.FlatDarculaLaf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import locadoraveiculosswing.entity.Cachorro;
import locadoraveiculosswing.entity.Gato;
import locadoraveiculosswing.gui.TelaPrincipalGUI;

public class App {

    public static SqlUtil sqlUtil = new SqlUtil("localhost", "18745", "postgres", "postgres", "VrPost@Server");

    public static void main(String[] args) {
        initAparencia();

//        Cachorro cachorro1 = new Cachorro();
//        Gato gato1 = new Gato();
//
//        Cachorro cachorro2 = new Cachorro() {
//            @Override
//            public void acao() {
//                System.out.println("MIA");
//            }
//        };
//                
//        cachorro1.acao();
//        gato1.acao();

        TelaPrincipalGUI form = new TelaPrincipalGUI();
        form.setVisible(true);
    }

    private static void initAparencia() {
        FlatDarculaLaf.setup();
    }
}
