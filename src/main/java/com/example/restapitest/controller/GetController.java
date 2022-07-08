package com.example.restapitest.controller;

import com.example.restapitest.model.InfoVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

@RestController
@RequestMapping("/api")
public class GetController {

    @RequestMapping(method = RequestMethod.GET, path = "/getRequestApi")
    public String getRequestApi() {
        return "getRequestApi";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/anotherGetApi")
    public String anotherGetApi(@RequestParam String id, @RequestParam String name) {
        return "id = "+ id +" , 이름은 " + name;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/usedModelGetApi")
    public InfoVO usedModelGetApi(InfoVO infoVO) {
        return infoVO;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/usedModelStringGetApi")
    public String usedModelStringGetApi(InfoVO infoVO) {
        return "id = " + infoVO.getId() + ", name =" + infoVO.getName();
    }
}
