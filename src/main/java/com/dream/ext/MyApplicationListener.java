package com.dream.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * ApplicationListener:监听容器中发布的事件。事件驱动模型开发；
 *  public interface ApplicationListener<E extends ApplicationEvent> extends EventListener
 *  监听ApplicationEvent及其下面的子事件
 *   步骤:
 *      1).写一个监听器来监听器来监听某个事件(ApplicationEvent 及其子类)
 *      2），把监听器加入到容器
 *      3).只要容器中有相关事件的发布，我们就能监听到这个事件
 *          ContextRefreshedEvent：容器刷新完成（所有bean都完全创建)会发布这个事件;
 *          ContextClosedEvent：容器关闭发布这个事件；
 *      4），发布一个事件
 */
@Component
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {
    //当容器中发布此事件以后，方法触发
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("收到事件: "+applicationEvent);
    }
}
