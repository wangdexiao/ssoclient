package com.sso.democlient.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TransferResource {

    @Resource
    private OAuth2RestTemplate restTemplate;

    @RequestMapping("/transres")
    public List<String> transResource(){

        List<String> result = (List<String>) restTemplate.getForObject("http://127.0.0.1:9001/product/list", List.class);
        return result;
    }
}
