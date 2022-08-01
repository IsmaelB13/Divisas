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
                    case 1: {
                        double[] usd = {1, 20.40, 0.98, 0.82, 902.48};
                        double tarifaseleccionada = usd[destinoCB.getSelectedIndex()];                    //----> Creacion del primer metodo DE USD
                        double resultado = Double.parseDouble(origenTF.getText()) * tarifaseleccionada;            //a el resto de monedas
                        destinoTF.setText("" + resultado);
                        break;
                    }
                    case 2: {
                        double[] euro = {0.98,1,0.84,20.82,938.87};
                        double tarifaseleccionada = euro[destinoCB.getSelectedIndex()];                   //---> Creacion del segundo metodo
                        double resultado = Double.parseDouble(origenTF.getText()) * tarifaseleccionada;       //de Euro a las demas monedas
                        destinoTF.setText("" + resultado);
                        break;
                    }
                    case 3: {
                        double[] libra = {5.17, 1115.44, 0.25, 1, 0.36};
                        double tarifaseleccionada = libra[destinoCB.getSelectedIndex()];
                        double resultado = Double.parseDouble(origenTF.getText()) * tarifaseleccionada;
                        destinoTF.setText("" + resultado);
                        break;
                    }
                    case 4: {
                        double[] mxm = {14.20, 3056.61, 0.70, 2.74, 1};
                        double tarifaseleccionada = mxm[destinoCB.getSelectedIndex()];
                        double resultado = Double.parseDouble(origenTF.getText()) * tarifaseleccionada;
                        destinoTF.setText("" + resultado);
                        break;
                    }
                    case 5: {
                        double[] chile = {14.20, 3056.61, 0.70, 2.74, 1};
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




