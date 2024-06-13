package com.example.major.service;

import com.example.major.model.CustomUserDetail;
import com.example.major.model.User;
import com.example.major.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findUserByEmailId(email);
        user.orElseThrow(() -> new UsernameNotFoundException("Any User with this email id was not found"));
        return user.map(CustomUserDetail::new).get();
    }
}
