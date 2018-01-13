package com.hackathon.eureka.loycitizen.vo;

import java.util.Arrays;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
//List of UDAID Aadhar users //useful for xml based user data, Not required now
@JacksonXmlRootElement(localName = "users") public final class Users {
	
	 @JacksonXmlProperty(localName = "user")
    @JacksonXmlElementWrapper(useWrapping  = false)
    private User[] user;
    public Users() {
    }
    public Users(User[] user) {
        this.user = user;
    }
    public User[] getUser() {
        return user;
    }
    public void setUser(User[] user) {
        this.user = user;
    }
    @Override public String toString() {
        return "Users{" +
                "Users=" + Arrays.toString(user) +
                '}';
    }
}
