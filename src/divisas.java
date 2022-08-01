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
                origenTF.setText(" " + destinoTF);
            }
        });
        convertirBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (origenCB.getSelectedIndex()) {
                    case 0: {
                        double[] usd = {1, 20.38, 0.92, 20.38, 901.10};
                        double tarifaseleccionada = usd[destinoCB.getSelectedIndex()];
                        double resultado = Double.parseDouble(origenTF.getText()) * tarifaseleccionada;
                        destinoTF.setText(" " + resultado);
                        break;
                    }
                    case 1: {
                        double[] euro = {1.02, 1, 0.84, 20.85, 921.65};
                        double tarifaseleccionada = euro[destinoCB.getSelectedIndex()];
                        double resultado = Double.parseDouble(origenTF.getText()) * tarifaseleccionada;
                        destinoTF.setText(" " + resultado);
                        break;
                    }
                    case 2: {
                        double[] libra = {1.22, 1.19, 1, 24.84, 1098.20};
                        double tarifaseleccionada = libra[destinoCB.getSelectedIndex()];
                        double resultado = Double.parseDouble(origenTF.getText()) * tarifaseleccionada;
                        destinoTF.setText(" " + resultado);
                        break;
                    }
                    case 3: {
                        double[] mxm = {0.049, 0.048, 0.040, 1, 44.22};
                        double tarifaseleccionada = mxm[destinoCB.getSelectedIndex()];
                        double resultado = Double.parseDouble(origenTF.getText()) * tarifaseleccionada;
                        destinoTF.setText(" " + resultado);
                        break;
                    }
                    case 4: {
                        double[] chile = {0.0011, 0.0011, 0.00091, 0.023,1};
                        double tarifaseleccionada = chile[destinoCB.getSelectedIndex()];
                        double resultado = Double.parseDouble(origenTF.getText()) * tarifaseleccionada;
                        destinoTF.setText(" " + resultado);
                        break;
                    }
                }
                }

        });
    }
        public static void main (String[]args){
            JFrame frame = new JFrame("divisas");
            frame.setContentPane(new divisas().mainForm);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }

    }




