package com.usermgt.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;

@RestController
@Slf4j
public class SwaggerController {

    @RequestMapping(value = "swagger.html", method = RequestMethod.GET)
    public void getSwagger(HttpServletResponse httpResponse) {
        httpResponse.setStatus(HttpStatus.NOT_FOUND.value());
    }
}