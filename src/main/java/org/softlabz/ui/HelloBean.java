package org.softlabz.ui;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HelloBean {
    private String sayHi;

    public HelloBean() {
        sayHi = "Hello world!";
    }

    public String getSayHi() {
        return sayHi;
    }

    public void setSayHi(String sayHi) {
        this.sayHi = sayHi;
    }
}
