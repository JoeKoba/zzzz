package com.zaurtregulov.spring.rest;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Замена web.xml: прописывание DispatcherServlet
 * */
public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    //прописываем зависимость на MyConfiguration (applicationContext)
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{MyConfig.class};
    }

    //указываем на url '/'
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
