package com.amol;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean validate(String user, String pass)
	{
		return user.equals("amy")&& pass.equals("pass");
	}
}
