package net.proselyte.jwtappdemo.security.jwt;

import net.proselyte.jwtappdemo.model.Status;
import net.proselyte.jwtappdemo.model.User;

public final class JwtUserFactory {

    public JwtUserFactory(){

    }

    public static JwtUser create(User user){
        return new JwtUser(
                user.getId(),
                user.getUsername(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getPassword(),
                null,
                user.getStatus().equals(Status.ACTIVE),
                user.getUpdated()
        );
    }
}
