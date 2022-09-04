# SpringSecurityDemo2
This POC is to learn how to configure Authorization in Spring Security


Follow the Steps provided in SpringSecurityDemo1 -->https://github.com/CodeBenchers006/SpringSecurityDemo1

Add multiple user to AuthenticationManagerBuilder (e.g. Admin, User)

Step 1 --> Override a method configure with object HttpSecurity --> configure(HttpSecurity http)

Step 2 --> add authorization to the roles 
        - http.authorizedRequest() -> enables us to give authorization to the roles
        - antMatchers("<---API Endpoint--->") -> secures an API for a specific role
        - hasRole("<--Role-->") -> enables to access the API mentioned above by a specific role
        - permitAll() -> enables all the role to access the given API
        - and() -> connector
        -httpBasic() -> basic Javascript login form
