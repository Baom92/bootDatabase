/**
 *
 * @Bignon
 */
package com.bootcamp;

import com.bootcamp.jpa.entities.User;
import com.bootcamp.jpa.repositories.UserRepository;
import java.sql.SQLException;
import java.util.List;
import org.testng.annotations.Test;

public class UserTest {
    UserRepository userRepository = new UserRepository(AppConstants.PERSISTENCE_UNIT);
    
    @Test
    public void create() throws SQLException{
     User user = new User();
     user.setLogin("user000");
     user.setPwd("pass000");     
     userRepository.create(user);
     
     user.setLogin("user001");
     user.setPwd("pass001");
     userRepository.create(user);
     
     user.setLogin("user002");
     user.setPwd("pass002");
     userRepository.create(user);
     
    }
    
     public void update() throws SQLException{
     User user = userRepository.findByPropertyUnique("id", 3);
     user.setLogin("user003modifie");
     userRepository.update(user);
    }
     
    public void delete() throws SQLException{
     User user = userRepository.findByPropertyUnique("id", 2);
     userRepository.delete(user);
    }
    
     public void findall() throws SQLException{
     List<User> users = userRepository.findAll();
    }
}
