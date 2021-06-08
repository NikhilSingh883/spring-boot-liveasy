package com.example.internship.liveasy.controller;

import com.example.internship.liveasy.entities.Load;
import com.example.internship.liveasy.services.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private LoadService loadService;

    @GetMapping("/home")
    public String home(){

        return "Hey there ,My name is Nikhil";
    }

    @GetMapping("/loads")
    public List<Load> getLoads(){

        return this.loadService.getLoads();
    }

    @GetMapping("/load/{loadId}")
    public Load getLoad(@PathVariable String loadId){

        return this.loadService.getLoad(Long.parseLong(loadId));
    }

    @PostMapping(path="/load",consumes = "application/json")
    public Load addLoad(@RequestBody Load load){

        return this.loadService.addLoad(load);
    }

    @PutMapping(path="/load/{loadId}",consumes = "application/json")
    public Load updateCourse(@PathVariable String loadId,@RequestBody Load load){

        return this.loadService.updateLoad(load);
    }

    @DeleteMapping("/load/{loadId}")
    public ResponseEntity<HttpStatus> deleteLoad(@PathVariable String loadId){

        try{
            this.loadService.deleteLoad(Long.parseLong(loadId));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/load")
    public List<Load> getLoadsByShipperId(@RequestParam(required = true) String shipperId){
        return this.loadService.getLoadByShipperId(Long.parseLong(shipperId));
    }

}
