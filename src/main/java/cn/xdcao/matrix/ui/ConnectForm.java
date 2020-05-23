package cn.xdcao.matrix.ui;

import javax.swing.*;

/**
 * The type Connect form.
 *
 * @author xd.cao
 * @version 1.0.0
 * @ClassName ConnectForm.java
 * @Description ConnectForm
 * @date 2020年03月06日 22:01:00
 */
public class ConnectForm {
    private JPanel mainPanel;

    private JLabel hostFiled;
    private JTextField hosttextFieldInput;
    private JLabel userFiled;
    private JTextField usertextFieldInput;
    private JLabel pWFiled;
    private JPasswordField passwordFieldInput;
    private JButton loginButton;
    private JButton canalButton;


    /**
     * Gets main panel.
     *
     * @return the main panel
     */
    public JPanel initCenter() {
        return mainPanel;
    }

    /**
     * Gets main panel.
     *
     * @return the main panel
     */
    public JPanel getMainPanel() {
        return mainPanel;
    }

    /**
     * Gets host filed.
     *
     * @return the host filed
     */
    public JLabel getHostFiled() {
        return hostFiled;
    }

    /**
     * Gets hosttext field input.
     *
     * @return the hosttext field input
     */
    public JTextField getHostextFieldInput() {
        return hosttextFieldInput;
    }

    /**
     * Gets user filed.
     *
     * @return the user filed
     */
    public JLabel getUserFiled() {
        return userFiled;
    }

    /**
     * Gets usertext field input.
     *
     * @return the usertext field input
     */
    public JTextField getUsertextFieldInput() {
        return usertextFieldInput;
    }

    /**
     * Gets w filed.
     *
     * @return the w filed
     */
    public JLabel getpWFiled() {
        return pWFiled;
    }

    /**
     * Gets password field input.
     *
     * @return the password field input
     */
    public JPasswordField getPasswordFieldInput() {
        return passwordFieldInput;
    }

    /**
     * Gets login button.
     *
     * @return the login button
     */
    public JButton getLoginButton() {
        return loginButton;
    }

    /**
     * Gets canal button.
     *
     * @return the canal button
     */
    public JButton getCanalButton() {
        return canalButton;
    }
}
