package tn.insat.jebouquine.servlet3;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import tn.insat.jebouquine.config.WebConfig;

public class JebouquineInitializer extends
AbstractAnnotationConfigDispatcherServletInitializer {


@Override
protected String[] getServletMappings() {
return new String[] { "/" };
}

@Override
protected Class<?>[] getRootConfigClasses() {
return null;
}

@Override
protected Class<?>[] getServletConfigClasses() {
return new Class[] { WebConfig.class };
}


}
