package org.softlabz.ui;

import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class HelloBeanTest {

    @Test
    public void testSayHello() {
        HelloBean helloBean = new HelloBean();
        assertEquals("Hello world!!!", helloBean.getSayHi());
    }

    @Test
    public void testSayHelloCreation() {
        HelloBean helloBean = new HelloBean();
        assertNotNull(helloBean.getSayHi());
    }

    @Test
    public void testTime() {
        HelloBean helloBean = new HelloBean();
        String time = new Date().toString();
        assertEquals(time, helloBean.getTime());
    }

    @Test
    public void testTimeCreation() {
        HelloBean helloBean = new HelloBean();
        String time = new Date().toString();
        assertEquals(time, helloBean.getTime());
    }
}