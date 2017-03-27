package mvcproject;

import java.util.HashMap;

public class loginservice {
static HashMap <String,String> users=new HashMap();
	public loginservice(){
users.put("abc","ahmed");	
users.put("xyz","piyush");
users.put("pqr","ali");
	}
	public boolean authenticate(String userID, String passwd)
{if (passwd==null || passwd.trim()=="")
{return false;
}
return true;
}
public static user getuserdetails(String userid){
user o=new user();
o.setUsename(users.get(userid));
o.setUserid(userid);
return o;	 
}
}
