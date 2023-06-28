package com.example.remoteAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/remote")
public class remoteAPIController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/get")
    public Object getMoviesDetails(){
        String url="https://api.themoviedb.org/3/movie/157336?api_key=524427257dd5216a73500f12b0bb53e4";
        Object responseObject=restTemplate.getForObject(url,Object.class);
        return responseObject;
    }
    @GetMapping("/get-details")
    public Object getCustomeDetails(){
        String url="https://api.themoviedb.org/3/movie/157336?api_key=524427257dd5216a73500f12b0bb53e4";
       MovieResponse responseObject=restTemplate.getForObject(url,MovieResponse.class);
       return responseObject;
    }

}
