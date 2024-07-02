package com.serviceprovider.serviceprovider.UserProfileRepository;

import com.serviceprovider.serviceprovider.UserProfile.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile,Long> {
}
