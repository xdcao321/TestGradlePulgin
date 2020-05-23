package cn.xdcao.matrix.ui;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author xd.cao
 * @version 1.0.0
 * @ClassName ConnectDialog.java
 * @Description 创建对话框
 * @date 2020年03月06日 17:49:00
 */
public class ConnectDialog extends DialogWrapper {

    private ConnectForm connectForm = new ConnectForm();
    /**
     * Creates modal {@code DialogWrapper}. The currently active window will be the dialog's parent.
     *
     * @param project     parent window for the dialog will be calculated based on focused window for the
     *                    specified {@code project}. This parameter can be {@code null}. In this case parent window
     *                    will be suggested based on current focused window.
     * @param canBeParent specifies whether the dialog can be parent for other windows. This parameter is used
     *                    by {@code WindowManager}.
     * @throws IllegalStateException if the dialog is invoked not on the event dispatch thread
     */
    protected ConnectDialog(@Nullable Project project, boolean canBeParent) {
        super(project, canBeParent);
    }

    public ConnectDialog(Project project) {
        super(true);
        init();
        setResizable(false);
        setTitle("Connect to 3de");
    }



    /**
     * Factory method. It creates panel with dialog options. Options panel is located at the
     * center of the dialog's content pane. The implementation can return {@code null}
     * value. In this case there will be no options panel.
     */
    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        return connectForm.initCenter();
    }



    /**
     * 特别说明：不需要展示SouthPanel要重写返回null，否则IDEA将展示默认的"Cancel"和"OK"按钮
     */
    @Override
    protected JComponent createSouthPanel() {

        JButton canalButton = connectForm.getCanalButton();
        canalButton.addActionListener(e -> {

        });

        return null;
    }


}
