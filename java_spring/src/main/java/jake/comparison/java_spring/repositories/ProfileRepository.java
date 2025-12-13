package jake.comparison.java_spring.repositories;

import org.springframework.stereotype.Repository;

import jake.comparison.java_spring.models.Profile;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
    
}
