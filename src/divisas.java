import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class divisas {
    private JTextField origenTF;
    private JTextField destinoTF;
    private JButton convertirBTN;
    private JComboBox origenCB;
    private JComboBox destinoCB;
    private JLabel destinotxt;
    private JLabel origentxt;
    private JPanel mainForm;


    public divisas() {
        origenCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            destinoTF.setText(""+origenCB.getSelectedItem());
            }
        });

        convertirBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double[] tarifas={1,20.40,0.98,0.82,902.48};
                double seleccion=tarifas[destinoCB.getSelectedIndex()];
                double resultado=Double.parseDouble(origenTF.getText())*seleccion;
                destinoTF.setText(""+resultado);
            }
        });
        destinoCB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                destinoTF.setText(""+destinoCB.getSelectedItem());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("divisas");
        frame.setContentPane(new divisas().mainForm);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
