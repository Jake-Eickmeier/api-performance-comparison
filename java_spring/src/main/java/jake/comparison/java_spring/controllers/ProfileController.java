package jake.comparison.java_spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import jake.comparison.java_spring.dtos.ProfileDTO;
import jake.comparison.java_spring.services.ProfileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class ProfileController {

    @Autowired
    ProfileService profileService;

    ProfileController() {}

    @GetMapping("/profile/{id}")
    public ProfileDTO getMethodName(@PathVariable Long id) {
        return profileService.getProfileById(id);
    }
    
    
}
