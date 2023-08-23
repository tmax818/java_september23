package tyler.loginreg.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import tyler.loginreg.models.LoginUser;
import tyler.loginreg.models.User;
import tyler.loginreg.repositories.UserRepository;
    

    
@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    // TO-DO: Write register and login methods!
    public User register(User newUser, BindingResult result) {
    	// TO-DO - Reject values or register if no errors:
        //! Reject if email is taken (present in database)
        if(userRegistered(newUser.getEmail())){
            result.rejectValue("email", "Email", "Invalid Credentials");
            return null;
        }
        //! Reject if password doesn't match confirmation
        if(!newUser.getPassword().equals(newUser.getConfirm())){
            result.rejectValue("password", "Password", "passwords must match");
        }
        //! Return null if result has errors
        if(result.hasErrors()){
            return null;
        }
        //! Hash and set password, save user to database
        String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
        newUser.setPassword(hashed);
        return userRepository.save(newUser);
    }

    // This method will be called from the controller
    // whenever a user submits a login form.
    public User login(LoginUser newLoginObject, BindingResult result) {
        // TO-DO: Additional validations!
        // TO-DO - Reject values:
        
    	// Find user in the DB by email
        // Reject if NOT present
        if(!userRegistered(newLoginObject.getEmail())){
            result.rejectValue("email", "NoEmail", "Invalid Credentials");
            return null;
        }
        User user = this.findUserByEmail(newLoginObject.getEmail());
        // Reject if BCrypt password match fails
        if(!BCrypt.checkpw(newLoginObject.getPassword(), user.getPassword())){
            result.rejectValue("password", "Password", "Invalid Credentials");

        }

        // Return null if result has errors
        if(result.hasErrors()){
            return null;
        }
        // Otherwise, return the user object
        return user;
    }


    private boolean userRegistered(String email){
        Optional<User> user = userRepository.findByEmail(email);
        return user.isPresent(); 
    }
    
    private User findUserByEmail(String email){
        Optional<User> user = userRepository.findByEmail(email);
        return user.orElse(null);

    }
}

