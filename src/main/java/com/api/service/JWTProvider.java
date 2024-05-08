package com.api.service;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;



@Component 
public class JWTProvider { 
	
	@Value("${security.access-key}") 
	private String accessKey="32uZ7KxDHO8Ij7VRh3pjj3B52tCSz27xdn1cLt4s"; 
	
	@Value("${security.secret-key}") 
	private String secretKey="aEKB4waqXNy33KHnfhao2lx5AwG6SzTMVDI83XfF"; 
	
	public String createToken() { 
		final Algorithm algorithm = Algorithm.HMAC256(secretKey); 
		return JWT.create() .withClaim("access_key", accessKey) .withClaim("nonce", UUID.randomUUID().toString()) .sign(algorithm); 
	} 

}

