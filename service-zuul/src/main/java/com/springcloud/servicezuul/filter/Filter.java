package com.springcloud.servicezuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class Filter extends ZuulFilter {
    private static Logger log = LoggerFactory.getLogger(Filter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        System.out.println("ZuuFilter");
        RequestContext requstContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requstContext.getRequest();
        log.info(String.format("%s>>>%s", request.getMethod(), request.getRequestURI().toString()));
        Object accessToken = request.getParameter("token");
        if (accessToken == null) {
            log.warn("token is empty");
            requstContext.setSendZuulResponse(false);
            requstContext.setResponseStatusCode(401);
            try {
                requstContext.getResponse().getWriter().write("token is empty");
            } catch (Exception e) {
            }
        }
        log.info("ok");
        return null;
    }
}
