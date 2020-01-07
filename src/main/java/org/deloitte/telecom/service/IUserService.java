package org.deloitte.telecom.service;

import org.deloitte.telecom.entities.MobUser;

public interface IUserService 
{
  	boolean credentialsCorrect(String mobileno, String password);

	MobUser findUserByMobileno(String mobileno);

}
