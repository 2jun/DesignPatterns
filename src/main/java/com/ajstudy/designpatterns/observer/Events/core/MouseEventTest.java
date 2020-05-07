package com.ajstudy.designpatterns.observer.Events.core;

/**
 * @ClassName: MouseEventTest
 * @Author: aiJun
 * @Description: TODO
 * @date: 2020-01-03  17:32
 */
public class MouseEventTest {
    public static void main(String[] args) {
        MouseEventCallback callback = new MouseEventCallback();
//注册事件
        Mouse mouse = new Mouse();
        mouse.addLisenter(MouseEventType.ON_CLICK, callback);
        mouse.addLisenter(MouseEventType.ON_MOVE, callback);
        mouse.addLisenter(MouseEventType.ON_WHEEL, callback);
        mouse.addLisenter(MouseEventType.ON_OVER, callback);
//调用方法
        mouse.click();
//失焦事件
        mouse.blur();
    }

}
