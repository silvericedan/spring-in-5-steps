package com.silvericedan.spring.basics.springin5steps.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;


//When we want to have a class make a new prototype, we can use ConfigurableBeanFactory.SCOPE_PROTOTYPE
//But in this case, because JdbcConnection is a dependency of PersonDAO, then it doesnt make a new instance.
//To solve that, we use proxyMode to make the new instances of JdbcConnection
@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class JdbcConnection {
    public JdbcConnection() {
        System.out.println("JDBC CONNECTION");
    }
}
