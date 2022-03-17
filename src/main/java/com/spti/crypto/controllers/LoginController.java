package com.spti.crypto.controllers;

import com.spti.crypto.entities.User;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api/login/")
public class LoginController {

    @PostMapping(value = "/url/{email}/{password}")
    public ResponseEntity<Boolean> LoginWithUrl(
        @PathVariable(name = "") String email,
        @PathVariable(name = "password") String password
    ) {
        return ResponseEntity.ok().body(true);
    }

    @GetMapping(value = "/params")
    public ResponseEntity<Boolean> LoginWithParams(
        @RequestParam(name = "email") String email,
        @RequestParam(name = "password") String password
    ) {
        return ResponseEntity.ok().body(true);
    }

    @PostMapping(value = "/body")
    public ResponseEntity<Boolean> LoginWithBody(@RequestBody User user) {
        return ResponseEntity.ok().body(true);
    }
}
