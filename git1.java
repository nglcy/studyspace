package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {

    @RequestMapping(value="hello",method = RequestMethod.GET)
    public String hello(@RequestParam(value="ids")List<Integer> ids, @RequestParam("name")String name){

        for (Integer id : ids) {
            System.out.println(id+"====================="+name);

            int i = 0 ;
            System.out.println(id+i);
        }
        return  "heollo word springboot";
    }


}
