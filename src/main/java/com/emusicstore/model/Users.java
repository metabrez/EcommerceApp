package com.emusicstore.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Collection;

/**
 * Created by shams on 4/19/2017.
 */
@Entity
public class Users {

    @Id
    @GeneratedValue
    private int usersId;
    private String userName;
    private String password;
    private boolean enabled;
    private int customerId;

    public Users() {
    }

    public Users(String userName, String password, boolean enabled, int customerId) {
        this.userName = userName;
        this.password = password;
        this.enabled = enabled;
        this.customerId = customerId;
    }

    public int getUsersId() {
        return usersId;
    }

    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
