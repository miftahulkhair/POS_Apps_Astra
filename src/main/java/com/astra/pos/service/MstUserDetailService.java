package com.astra.pos.service;

import com.astra.pos.model.MstRole;
import com.astra.pos.model.MstUser;
import com.astra.pos.repository.MstUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

public class MstUserDetailService {
    @Autowired
    private MstUserRepository mstUserRepository;

//    @Transactional(readOnly = true)
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        MstUser user = mstUserRepository.findByUsername(username);
//
//        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
//        for (MstRole role : user.getRole()){
//            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
//        }
//
//        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
//    }
}
