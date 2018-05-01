port javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton jbtnAdd = new JButton("Add");
    private JButton jbtnLess = new JButton("Less");
    private JButton jbtnExit= new JButton("Exit");
    private JLabel  jlb = new JLabel("= = ");
    private  JTextField jlf = new JTextField();
    private int x = 100;

    public MainFrame() {
        init();
    }

    private void init() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);//介面間隔
        this.setLocation(100, 50);//視窗位置
        this.setSize(800, 600); //

        jbtnAdd.setLocation(50, 60);//按鈕位置
        jbtnAdd.setSize(120, 30);//按鈕大小

        jbtnLess.setLocation(200, 60);
        jbtnLess.setSize(120, 30);


        jlb.setBounds(x, 80,70,100);
        jlf.setBounds(x ,80,90,100);
        this.add(jbtnAdd);
        this.add(jbtnLess);
        this.add(jlb);
        this.add(jlf);
        jbtnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x-= Integer.parseInt(jlf.getText());

                jlb.setLocation(x,80);
            }
        });
        jbtnLess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x+= Integer.parseInt(jlf.getText());
                jlb.setLocation(x,80);
            }
        });
    }
}