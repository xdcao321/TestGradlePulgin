package cn.xdcao.matrix.ui;

import javax.swing.*;

/**
 * @author xd.cao
 * @version 1.0.0
 * @ClassName ConnectForm.java
 * @Description TODO
 * @date 2020年03月06日 22:01:00
 */
public class ConnectForm {
    private JPanel mainPonel;

    private JLabel hostFiled;
    private JTextField hosttextFieldInput;

    private JLabel userFiled;
    private JTextField usertextFieldInput;

    private JLabel pWFiled;
    private JPasswordField passwordFieldInput;

    private JButton loginButton;
    private JButton canealButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("ConnectForm");
        frame.setContentPane(new ConnectForm().mainPonel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 250);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }



    public JPanel getMainPonel() {
        return mainPonel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }
}
