package com.boba.listener.attribute;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * 监听attribute
 */
public class MyListener implements ServletRequestListener, ServletRequestAttributeListener {

    /**
     * 新增(setAttribute())时调用
     *
     * @param servletRequestAttributeEvent
     */
    @Override
    public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        System.out.println("attributeAdded: " + servletRequestAttributeEvent.getName() + ": " + servletRequestAttributeEvent.getValue());
    }

    /**
     * 删除时调用
     *
     * @param servletRequestAttributeEvent
     */
    @Override
    public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        System.out.println("attributeRemoved: " + servletRequestAttributeEvent.getName() + ": " + servletRequestAttributeEvent.getValue());
    }

    /**
     * 修改时调用
     *
     * @param servletRequestAttributeEvent
     */
    @Override
    public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        System.out.println("attributeReplaced: " + servletRequestAttributeEvent.getName() + ": " + servletRequestAttributeEvent.getValue());
    }

    /**
     * 销毁时调用
     *
     * @param servletRequestEvent
     */
    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {

    }

    /**
     * 初始化时调用
     *
     * @param servletRequestEvent
     */
    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {

    }
}
