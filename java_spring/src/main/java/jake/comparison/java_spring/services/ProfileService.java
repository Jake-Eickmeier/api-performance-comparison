package jake.comparison.java_spring.services;

import org.springframework.stereotype.Service;

import jake.comparison.java_spring.dtos.ProfileDTO;

@Service
public interface ProfileService {
    
    public ProfileDTO getProfileById(Long id);
}
