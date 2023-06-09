package com.rhinox.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 替换HttpServlet,根据请求的最后一段路径来进行方法分发
 */

public class BaseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 获取请求路径
        String uri = req.getRequestURI(); // brand-case/brand/selectAll
        // 2. 获取最后一条路径，方法名
        int index = uri.lastIndexOf('/');
        String methodName = uri.substring(index + 1); // selectAll
        // System.out.println(methodName);
        // 2. 执行方法
        // 2.1 获取BrandServlet / UserServlet 字节码对象Class
        // (谁调用我（this 所在方法），我代表谁)
        // this : BaseServlet ? UserServlet : BrandServlet
        Class<? extends BaseServlet> cls = this.getClass();
        // 2.2 获取方法method对象
        try {
            Method method = cls.getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            // 2.3 执行方法
            method.invoke(this, req, resp);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
