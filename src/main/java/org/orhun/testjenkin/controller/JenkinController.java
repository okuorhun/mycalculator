package org.orhun.testjenkin.controller;

import org.orhun.testjenkin.model.Result;
import org.orhun.testjenkin.service.JenkenServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class JenkinController {

    private final JenkenServer jenkenServer;

    public JenkinController(JenkenServer jenkenServer) {
        this.jenkenServer = jenkenServer;
    }

    @GetMapping("/add")
    public Result add(@RequestParam int a, @RequestParam int b) {
        System.out.println("add, murat" );
        return jenkenServer.add(a,b);
    }

    @GetMapping("/sub")
    public Result sub(@RequestParam int a, @RequestParam int b) {
        System.out.println("add, murat" );
        return jenkenServer.sub(a,b);
    }
}
