import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class beriGaji {
    private JPanel mainPanel;
    private JTextField namaField;
    private JButton submitButton;
    private JTextField gajiField;
    private JTextField tunjanganField;
    private JTextField potonganField;
    private JTextField gajiBersihField;


    public beriGaji() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String getNamaField = namaField.getText();
               String getGajiField = gajiField.getText();
               String getTunjanganField = tunjanganField.getText();
               String getPotonganField = potonganField.getText();

               int gaji = Integer.parseInt(getGajiField);
               int tunjangan = Integer.parseInt(getTunjanganField);
               int potongan  = Integer.parseInt(getPotonganField);

               double pajak = gaji * 0.025;
               double gajiBersih = gaji + tunjangan - potongan - pajak;
               long gajiBersihInt = (long)gajiBersih;
               String gajiBersihString = String.format("%d", gajiBersihInt);

               gajiBersihField.setText(gajiBersihString);

            }
        });
    }


    public static void main(String[] args){

        JFrame frame = new JFrame("Beri Gaji");
        frame.setContentPane(new beriGaji().mainPanel); // main panel
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(300, 300);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

    }
}
