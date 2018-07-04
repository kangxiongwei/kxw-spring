package org.kxw.springboot.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Create by kangxiongwei on 2018/7/4 上午8:11
 */
public class AuthFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("进入了AuthFilter");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
