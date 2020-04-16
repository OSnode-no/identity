# identity

Example of OAuth2 server with Spring Boot

v1 - version with username and password.

v2 - version that shows how to connect to Google and Github for authentication and use their token.

v3 - version that shows how to connect to Google and Github and allow own password. Using own tokens.

## V1 - username password

Got to http://localhost:8080/oauth/authorize?grant_type=authorization_code&response_type=code&client_id=first-client

username: enduser

password: password