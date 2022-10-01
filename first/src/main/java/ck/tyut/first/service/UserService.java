package ck.tyut.first.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ck.tyut.first.domain.User;
import ck.tyut.first.mapper.UserMapper;

@Service
public class UserService{
   @Autowired
   private UserMapper userMapper;
   
   public User getUser(String userId){
	   return  userMapper.selectByUserId(userId);
   }

   public static void speak(String... words){
       for(String word : words){
           System.out.println("user say : " + word);
       }
   }
}