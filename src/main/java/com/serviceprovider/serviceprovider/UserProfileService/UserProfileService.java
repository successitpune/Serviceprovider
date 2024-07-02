package com.serviceprovider.serviceprovider.UserProfileService;

import com.serviceprovider.serviceprovider.UserProfile.UserProfile;
import com.serviceprovider.serviceprovider.UserProfileRepository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserProfileService {

        @Autowired
        private UserProfileRepository userProfileRepository;

        public UserProfile saveUserProfile(UserProfile userProfile) {
            return userProfileRepository.save(userProfile);
        }

        public Optional<UserProfile> getUserProfileById(Long id) {
            return userProfileRepository.findById(id);
        }

        public List<UserProfile> getAllUserProfiles() {
            return userProfileRepository.findAll();
        }

        public void deleteUserProfile(Long id) {
            userProfileRepository.deleteById(id);
        }

    }


