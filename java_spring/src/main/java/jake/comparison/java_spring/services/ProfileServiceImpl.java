package jake.comparison.java_spring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jake.comparison.java_spring.dtos.ProfileDTO;
import jake.comparison.java_spring.models.Profile;
import jake.comparison.java_spring.repositories.ProfileRepository;

@Service
public class ProfileServiceImpl implements ProfileService {
    
    @Autowired
    ProfileRepository profileRepository;

    public ProfileServiceImpl() {
    }

    public ProfileDTO getProfileById(Long id) {
        Optional<Profile> profile = profileRepository.findById(id);
        return profile.isEmpty()? null : new ProfileDTO(profile.get());
    }
}
