package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping("/lxb")
    public String pring(){
      return   "你好，雷小表";
    }

    @GetMapping("findOne")
    public String FindPersonById(){

        return null;
    }
    @GetMapping("findAll")
    public String FindAll(){

       return null;

    }
}
