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
                switch (origenCB.getSelectedIndex()){
                    case 1:
                    {
                        double[] tarifasMexico={1,};
                        double tarifaseleccionada=tarifasMexico[destinoCB.getSelectedIndex()];
                        double resultado=Double.parseDouble(origenTF.getText())*tarifaseleccionada;
                        destinoTF.setText(""+resultado);
                        break;
                    }
                    case 2:
                    {
                        double[] tarifasColombia={0.0046 ,1,0.00023,0.00089,0.00033 };
                        double tarifaseleccionada=tarifasColombia[destinoCB.getSelectedIndex()];
                        double resultado=Double.parseDouble(origenTF.getText())*tarifaseleccionada;
                        destinoTF.setText(""+resultado);
                        break;
                    }
                    case 3:
                    {
                        double[] tarifasSOl={5.17,1115.44 ,0.25 ,1,0.36  };
                        double tarifaseleccionada=tarifasSOl[destinoCB.getSelectedIndex()];
                        double resultado=Double.parseDouble(origenTF.getText())*tarifaseleccionada;
                        destinoTF.setText(""+resultado);
                        break;
                    }
                    case 4:
                    {
                        double[] tarifasAustralia={14.20,3056.61,0.70,2.74 ,1};
                        double tarifaseleccionada=tarifasAustralia[destinoCB.getSelectedIndex()];
                        double resultado=Double.parseDouble(origenTF.getText())*tarifaseleccionada;
                        destinoTF.setText(""+resultado);
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




