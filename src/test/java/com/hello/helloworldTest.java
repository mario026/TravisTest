package com.hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class helloworldTest {

    private helloworld hello = new helloworld();

    @Test
    public void greeterSaysHello() {
        assertThat(hello.Helloword(), containsString("Helloworld"));
    }

}