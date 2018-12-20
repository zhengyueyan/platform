package com.zyy.config;


import org.apache.shiro.authc.AuthenticationToken;

/**
 * token
 *
 */
public class ShiroToken implements AuthenticationToken {
    private String token;

    public ShiroToken(String token){
        this.token = token;
    }

    @Override
    public String getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
