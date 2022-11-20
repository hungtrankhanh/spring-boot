//package com.example.demo.service;
//
//import com.example.demo.model.Customer;
//import com.example.demo.repository.CustomerRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class EazyBankUserDetail implements UserDetailsService {
//    @Autowired
//    private CustomerRepository customerRepository;
//
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        String user_name, password = null;
//        List<GrantedAuthority> authorityList;
//        List<Customer> customerList = customerRepository.findByEmail(username);
//        if(customerList.isEmpty()) {
//            throw new UsernameNotFoundException("User is not found for " + username);
//        } else {
//            var customer = customerList.get(0);
//            user_name = customer.getEmail();
//            password = customer.getPwd();
//            authorityList = new ArrayList<>();
//            authorityList.add(new SimpleGrantedAuthority(customer.getUserRole()));
//        }
//        return new User(user_name,password,authorityList);
//    }
//}
