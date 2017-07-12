package com.gregdferrell.designpatterns.singleton;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class DbSingletonTest {

    final private static Logger LOGGER = LoggerFactory.getLogger(DbSingletonTest.class);

    @Rule
    public TestName testName = new TestName();

    public DbSingletonTest() {
    }

    @Before()
    public void beforeTest() {
        if (LOGGER.isTraceEnabled()) {
            LOGGER.trace("Running Test: " + testName.getMethodName());
        }
    }

    @Test()
    public void testSingletonSameMemAddress() {
        DbSingleton instanceOne = DbSingleton.getInstance();
        DbSingleton instanceTwo = DbSingleton.getInstance();

        assertEquals(instanceOne.toString(), instanceTwo.toString());
    }
}
