package co.tylermaxwell.beltdemo.service;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import co.tylermaxwell.beltdemo.models.LoginUser;
import co.tylermaxwell.beltdemo.models.User;
import co.tylermaxwell.beltdemo.repositories.UserRepository;

@Service
public class UserService {

    @Autowired UserRepository userRepository;

    // TO-DO: Write register and login methods!
    public User register(User newUser, BindingResult result) {
        // TO-DO: Additional validations!
        // TO-DO - Reject values or register if no errors:
        
        // Reject if email is taken (present in database)
        if(userRepository.findByEmail(newUser.getEmail()).isPresent()){
            result.rejectValue("email", "Unique", "Email is taken");
        } 

        // Reject if password doesn't match confirmation

        if(!newUser.getPassword().equals(newUser.getConfirm())) {
            result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
        }
        
        // Return null if result has errors

        if(result.hasErrors()){
            return null;
        }
    
        // Hash password, 
        
        String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
        System.out.println(hashed);
        
        // set password

        newUser.setPassword(hashed);
        //save user to database

        return userRepository.save(newUser);
    }
    public User login(LoginUser newLoginObject, BindingResult result) {
        // TO-DO: Additional validations!
                // TO-DO - Reject values:      
    	// Find user in the DB by email
        Optional<User> user = userRepository.findByEmail(newLoginObject.getEmail());

        // Reject if NOT present
        if(!user.isPresent()){
            result.rejectValue("email", "loginEmail", "email not found!");
        }else if(!BCrypt.checkpw(newLoginObject.getPassword(), user.get().getPassword())){
            result.rejectValue("password", "logpassword", "invalid credentials");
        }
    
        // Return null if result has errors
        if(result.hasErrors()){
            return null;
        }
        // Otherwise, return the user object
        return user.get();
    }
    
}