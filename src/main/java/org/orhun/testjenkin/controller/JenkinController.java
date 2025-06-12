package org.orhun.testjenkin.controller;

import org.orhun.testjenkin.model.Result;
import org.orhun.testjenkin.service.JenkenServer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class JenkinController {

    private final JenkenServer jenkenServer;

    public JenkinController(JenkenServer jenkenServer) {
        this.jenkenServer = jenkenServer;
    }

    @GetMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    public Result add(@RequestParam int a, @RequestParam int b) {
        System.out.println("add, murat" );
        return jenkenServer.add(a,b);
    }

    @GetMapping("/sub")
    @ResponseStatus(HttpStatus.OK)
    public Result sub(@RequestParam int a, @RequestParam int b) {
        System.out.println("sub, murat" );
        return jenkenServer.sub(a,b);
    }
}
