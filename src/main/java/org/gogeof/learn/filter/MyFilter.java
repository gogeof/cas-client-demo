package org.gogeof.learn.filter;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String initParam = filterConfig.getInitParameter("ref");     // 取得初始化参数
        System.out.println("** 过滤器初始化，初始化参数 = " + initParam);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("** 执行doFilter()方法之前。");
        filterChain.doFilter(servletRequest, servletResponse);         // 将请求继续传递
        System.out.println("** 执行doFilter()方法之后。");
    }

    @Override
    public void destroy() {
        System.out.println("** 过滤器销毁。");
    }
}
