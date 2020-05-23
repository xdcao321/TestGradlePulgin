package cn.xdcao.matrix.action;

import cn.xdcao.matrix.entity.Message;
import cn.xdcao.matrix.icon.MatrixIcons;
import cn.xdcao.matrix.ui.ConnectDialog;
import cn.xdcao.matrix.util.Util;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.util.IconLoader;
import com.intellij.pom.Navigatable;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;

/**
 * @author xd.cao
 * @version 1.0.0
 * @ClassName Connect3DE.java
 * @Description connect 3de
 * @date 2020年03月06日 12:53:00
 */
public class Connect3DE extends AnAction {

    private static final Logger logger = Util.getLogger(Connect3DE.class);


    /**
     * This default constructor is used by the IntelliJ Platform framework to
     * instantiate this class based on plugin.xml declarations. Only needed in PopupDialogAction
     * class because a second constructor is overridden.
     * @see AnAction#AnAction()
     */
    public Connect3DE() {
        // Set the menu item name.
        //super("Test _Boxes");
        // Set the menu item name, description and icon.
        super("Connect to 3DE", "EasyJPO", MatrixIcons.CONNECT_ICON);
    }

    /**
     * This constructor is used to support dynamically added menu actions.
     * It sets the text, description to be displayed for the menu item.
     * Otherwise, the default AnAction constructor is used by the IntelliJ Platform.
     * @param text  The text to be displayed as a menu item.
     * @param description  The description of the menu item.
     * @param icon  The icon to be used with the menu item.
     */
    public Connect3DE(@Nullable String text, @Nullable String description, @Nullable Icon icon) {
        super(text, description, icon);
    }

    /**
     * Gives the user feedback when the dynamic action menu is chosen.
     * Pops a simple message dialog. See the psi_demo plugin for an
     * example of how to use AnActionEvent to access data.
     * @param event Event received when the associated menu item is chosen.
     */
    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {

        //获取当前在操作的工程上下文
        Project currentProject = event.getProject();


        try {


        } catch (Exception exception) {
            exception.printStackTrace();
        }

        ConnectDialog connectDialog = new ConnectDialog(currentProject);
        connectDialog.setResizable(false);
        boolean isShow = connectDialog.showAndGet();

        if(!isShow){
            String title = connectDialog.getTitle();
            int exitCode = connectDialog.getExitCode();

            System.out.println(title);
            System.out.println(exitCode);
        }



    }
    /**
     * Determines whether this menu item is available for the current context.
     * Requires a project to be open.
     * @param e Event received when the associated group-id menu is chosen.
     */
    @Override
    public void update(@NotNull AnActionEvent e) {
        // Set the availability based on whether a project is open
        Project project = e.getProject();
        e.getPresentation().setEnabledAndVisible(project != null);
    }
}
