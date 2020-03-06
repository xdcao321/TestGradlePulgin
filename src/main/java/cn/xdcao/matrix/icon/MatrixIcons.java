package cn.xdcao.matrix.icon;

import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

/**
 * @author xd.cao
 * @version 1.0.0
 * @ClassName MatrixIcon.java
 * @Description TODO
 * @createTime 2020年03月06日 19:05:00
 */
public class MatrixIcons {

    private static Icon load(String path){
        return IconLoader.getIcon(path,MatrixIcons.class);
    }
    public static final Icon CONNECT_ICON = load("/icons/connect.png");
}
