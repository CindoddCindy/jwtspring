package com.springjwt.jwtspring.security.services;

import com.springjwt.jwtspring.models.User;
import com.springjwt.jwtspring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
  @Autowired
  UserRepository userRepository;

  @Override
  @Transactional
  public UserDetails loadUserByUsername(String firstname) throws UsernameNotFoundException {
    User user = userRepository.findByFirstname(firstname)
        .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + firstname));

    return UserDetailsImpl.build(user);
  }

}
