package com.general.springboot.springbootexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConfigController {

    @Autowired
    private CurrencyServiceConfiguration config;

    @RequestMapping("/currency-configuration")
    public CurrencyServiceConfiguration  getConfig()
    {
        return config;
    }
}
