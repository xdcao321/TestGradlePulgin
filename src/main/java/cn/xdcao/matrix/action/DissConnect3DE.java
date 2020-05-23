package cn.xdcao.matrix.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

/**
 * @author xd.cao
 * @version 1.0.0
 * @ClassName Connect3DE.java
 * @Description TODO
 * @date 2020年03月06日 12:53:00
 */
public class DissConnect3DE extends AnAction {
    /**
     * Implement this method to provide your action handler.
     *
     * @param e Carries information on the invocation place
     */
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {

        Project project = e.getData(PlatformDataKeys.PROJECT);

        if (project == null) {
            return;
        }

        String txt = Messages.showInputDialog(project,
                "What is your name?",
                "Input Your Name",
                Messages.getQuestionIcon());
        //显示对话框
        Messages.showMessageDialog(project,
                "Hello, " + txt + "!\n I am glad to see you.",
                "Information", Messages.getInformationIcon());

    }
}
