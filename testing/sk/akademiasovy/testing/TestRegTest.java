package sk.akademiasovy.testing;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestRegTest extends TestReg {

    @Test
    public void validation()throws Exception{
    TestReg IP1 = new TestReg();

    assertTrue(IP1.validate("0.0.1"));
    assertTrue(IP1.validate("127.0.0.1"));

}

}