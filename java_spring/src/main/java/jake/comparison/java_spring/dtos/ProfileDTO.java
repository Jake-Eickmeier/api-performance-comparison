package jake.comparison.java_spring.dtos;

import jake.comparison.java_spring.models.Profile;

public record ProfileDTO (

    Long id,
    String firstName,
    String lastName) {

    public ProfileDTO(Profile profile) {
        this(profile.getId(), profile.getFirstName(), profile.getLastName());
    }

    public Profile toProfile(ProfileDTO profileDTO) {
        return new Profile(firstName, lastName);
    }
}
