package com.payments.schoolgateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/merchandise")
public class MerchandiseController {

    @RequestMapping("/listing")
    public List<String> listAll(){
        return Arrays.asList("Shirts", "Trousers", "Caps", "Shoes", "Jackets");
    }
}
