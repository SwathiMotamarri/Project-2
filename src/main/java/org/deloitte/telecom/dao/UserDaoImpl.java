package org.deloitte.telecom.dao;

import org.deloitte.telecom.entities.MobUser;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDaoImpl implements IUserDao
{

    private Map<String, MobUser>store=new HashMap<>();

    public UserDaoImpl(){
        store.put("9032301002",new MobUser("Swathi","abcd", "9032301002",2000));
        store.put("9441607400",new MobUser("Sailaja","abcd", "9441607400",3000));

    }

    @Override
    public boolean credentialsCorrect(String mobileno ,String password){
        MobUser user=store.get(mobileno);
        if(user==null){
            return false;
        }
        return user.getPassword().equals(password);
    }

    @Override
    public MobUser findUserByMobileno(String mobileno){
        MobUser user=store.get(mobileno);
        return user;
    }

}
