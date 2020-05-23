package cn.xdcao.matrix.entity;

/**
 * @author xd.cao
 * @version 1.0.0
 * @ClassName: Message.java
 * @Description: message entity
 * @date 2020年05月23日 10:51:00
 */

public class Message extends Throwable {
    private Boolean isShowAndGet;

    public Message(Boolean isShowAndGet) {
        this.isShowAndGet = isShowAndGet;
    }

    public Message() {
    }

    public void setShowAndGet(Boolean showAndGet) {
        isShowAndGet = showAndGet;
    }

    public Boolean getShowAndGet() {
        return isShowAndGet;
    }

    @Override
    public String toString() {
        return "Message{" +
                "isShowAndGet=" + isShowAndGet +
                '}';
    }
}
