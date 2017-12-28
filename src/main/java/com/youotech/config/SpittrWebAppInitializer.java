package com.youotech.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected String[] getServletMappings() {//将DispatcherServlet映射到"/"
        return  new String[]{"/"};
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {//指定根类
        return new Class<?>[]{RootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {//指定配置类
        return new Class<?>[]{WebConfig.class};
    }
}
