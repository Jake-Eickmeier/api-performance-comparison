package jake.comparison.java_spring.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jake.comparison.java_spring.services.PizzaBucketService;

@RestController
public class BucketController {
    
    @Autowired
    private PizzaBucketService pizzaBucketService;

    public BucketController() {
    }

    @GetMapping("/buckets")
    public Map<String, double[]> getAllPizzas() {
        return Map.of("buckets", pizzaBucketService.getBuckets());
    }

}
