package io.alkostylew.springsecurityjpa.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AuthenticationRequest {

    private String username;
    private String password;

}
