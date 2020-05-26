package org.jeecg.config.filterConfig;


import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns="/*",filterName="workFilter", asyncSupported = true)
public class FilterConfig implements Filter {
    private final static org.slf4j.Logger logger= LoggerFactory.getLogger(FilterConfig.class);
    @Override
    public void init(javax.servlet.FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info("进入过滤器:workFilter");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        System.out.println("页面请求地址 :"+request.getRequestURI());
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
