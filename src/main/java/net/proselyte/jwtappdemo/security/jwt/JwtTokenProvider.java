package net.proselyte.jwtappdemo.security.jwt;

import net.proselyte.jwtappdemo.model.Role;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JwtTokenProvider {

    public String createToken(String username, List<Role> role){

    }

    public Authentication getAuthentication(String token){

    }

    public String getUsername(String token){

    }

    public booleanvalidateToken(String token){

    }

    private List<String> getRoleNames(List<Role> userRoles){
        
    }
}
