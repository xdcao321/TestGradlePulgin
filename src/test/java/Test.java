import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * @author xd.cao
 * @version 1.0.0
 * @date 2020年05月23日 11:39:00
 */
public class Test {



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
         * The entry point of application.
         *
         * @param args the input arguments
         */
    public static void main(String[] args) {
        // 显示应用 GUI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGui();
            }
        });
    }

        /**{
         * 创建并显示GUI。出于线程安全的考虑，
         * 这个方法在事件调用线程中调用。
         */
    private static void createAndShowGui() {

        // ui
        JFrame frame = new JFrame("ConnectForm");
        // 创建及设置窗口
        frame.setContentPane(new Test().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 250);
        frame.setResizable(false);
        // 显示窗口
        frame.pack();
        frame.setVisible(true);
    }

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
        public JTextField getHosttextFieldInput() {
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
