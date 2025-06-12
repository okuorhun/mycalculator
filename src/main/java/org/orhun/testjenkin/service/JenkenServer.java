package org.orhun.testjenkin.service;


import org.orhun.testjenkin.model.Result;
import org.springframework.stereotype.Service;

@Service
public class JenkenServer {
    public Result add(int a, int b) {
        return  new Result( a+ b);
    }

    public Result sub(int a, int b) {
        return  new Result( a - b);
    }
}
