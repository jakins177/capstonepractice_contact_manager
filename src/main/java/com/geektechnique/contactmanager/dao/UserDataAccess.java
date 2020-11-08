package com.geektechnique.contactmanager.dao;

import org.springframework.stereotype.Repository;

import com.geektechnique.contactmanager.model.ContactManagerDB;
import com.geektechnique.contactmanager.model.User;

@Repository("contactManagerPsql")


public class UserDataAccess implements UserDao {
ContactManagerDB realDB = new ContactManagerDB();
	
    @Override
    public int insertUser(User user) {
        realDB.createUserRecord(user.getEmail(), user.getPassword());
        return 0;
    }

}
