package com.ultimo;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest extends FunctionalTestCase {

	// mavenFlow returns Hello Maven
    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
        runFlowAndExpect("mavenFlow", "Hello World");
    }
    
 // run maven-config.xml when testing
    @Override
    protected String getConfigFile() {
        return "mavenproject.xml";
    }
}
