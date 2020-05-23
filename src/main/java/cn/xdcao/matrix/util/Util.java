package cn.xdcao.matrix.util;

import com.intellij.openapi.diagnostic.Logger;
import com.intellij.psi.PsiFile;
/**
 * @author xd.cao
 * @version 1.0.0
 * @date 2020年05月23日 14:36:00
 */
public class Util {
    private static final Logger LOGGER = Logger.getInstance(Util.class);

    public static Logger getLogger(Class<?> clazz) {
        return Logger.getInstance(clazz);
    }


}
