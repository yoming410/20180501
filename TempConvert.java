import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TempConvert extends JFrame{
    private JTextField Fahrenheit;
    private JLabel Celsius;
    private JLabel TextFah;
    private JLabel TextCel;
    private JButton jbtnExit= new JButton("Exit");

    public TempConvert(){
        super("華式轉攝氏");
        setLayout(new FlowLayout());

        TextFah = new JLabel("華式");
        getContentPane().add(TextFah);

        Fahrenheit = new JTextField(5);
        getContentPane().add(Fahrenheit);

        FahrenheitHandler handler = new FahrenheitHandler();
        Fahrenheit.addActionListener(handler);

       // jbtnExit.setLocation(50, 50);
       // jbtnExit.setSize(120, 30);
       // this.add(jbtnExit);
        getContentPane().add(jbtnExit);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,75);
        setVisible(true);

        jbtnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Bye-Bye");
                System.exit(0);
            }
        });
    }

    private class FahrenheitHandler implements ActionListener{
        double F,C;
        public void actionPerformed(ActionEvent event){
            String FS = ((JTextField)event.getSource()).getText();
            F = Double.parseDouble(FS);
            C = 5 * (F - 32) / 9;
            String D = String.format("%4.1f",C);

            TextCel = new JLabel("攝式");
            getContentPane().add(TextCel);

            if (Celsius!=null)
                getContentPane().remove(Celsius);
            Celsius = new JLabel(D);
            getContentPane().add(Celsius);

            getContentPane().validate();
        }
    }

    public static void main(String argv[]) {
        new TempConvert();
    }
}
