package cn.xdcao.matrix.action;

import cn.xdcao.matrix.ui.ConnectDialog;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

/**
 * @author xd.cao
 * @version 1.0.0
 * @ClassName Connect3DE.java
 * @Description TODO
 * @createTime 2020年03月06日 12:53:00
 */
public class Connect3DE extends  AnAction  {

    private static final Logger logger = Logger.getInstance(Connect3DE.class);

    /**
     * Implement this method to provide your action handler.
     *
     * @param e Carries information on the invocation place
     */
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        boolean b = new ConnectDialog().showAndGet();
        System.out.println(b);

    }
}
