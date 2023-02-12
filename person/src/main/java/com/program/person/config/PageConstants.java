package com.program.person.config;

public class PageConstants {
    /** -pages */
    public static final String REGISTRATION_PAGE = "/registration";
    public static final String LOGIN_PAGE = "/login";
    public static final String GREETING = "/greeting";

    /** -auth api */
    public static final String SIGNUP = "/api/auth/signup";
    public static final String SIGNIN = "/api/auth/signin";
    public static final String LOGOUT = "/api/auth/logout";

    /** -js and css */
    public static final String CSS = "/css/**";
    public static final String JS = "/js/**";

    /** -user data */
    public static final String CURRENT_USERNAME = "/persons/current/username";
    public static final String CURRENT_USER = "/persons/private/user";

}
