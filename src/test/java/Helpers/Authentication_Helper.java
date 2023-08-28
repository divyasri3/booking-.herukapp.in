package Helpers;

import Http_Request.Authetictaion_Request.Auth_Pojo.Authetication_Pojo;

/*
{
    "username" : "admin",
    "password" : "password123"
}
 */
public class Authentication_Helper {

    public static Authetication_Pojo Generate_Token() {
        Authetication_Pojo auth_Pojo = new Authetication_Pojo();
        auth_Pojo.setPassword("password123");
        auth_Pojo.setUsername("admin");
        return auth_Pojo;
    }
}
