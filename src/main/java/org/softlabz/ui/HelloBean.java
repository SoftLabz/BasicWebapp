package org.softlabz.ui;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.Date;

@ManagedBean
@SessionScoped
public class HelloBean {
    private String sayHi;
    private String time;

    public HelloBean() {
        sayHi = "Hello world!!!";
        time = new Date().toString();
    }

    public String getSayHi() {
        return sayHi;
    }

    public void setSayHi(String sayHi) {
        this.sayHi = sayHi;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
