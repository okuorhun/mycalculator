package org.orhun.testjenkin.service;

import org.junit.jupiter.api.Test;
import org.orhun.testjenkin.model.Result;
import  static org.junit.jupiter.api.Assertions.assertEquals;

public class AddServiceTest {
    @Test
    public void addIntegers(){
        JenkenServer server = new JenkenServer();
        Result result = server.add(2,3);
        assertEquals(result.getResult(),5);
    }
}
