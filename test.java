package r110214045.piyushmishra;
import java.util.Scanner;
import java.sql.*;
public class test { static String[] d=new String[2];
	                static String name;
                    static String pass;
                    static String repass;
                    static Scanner r=new Scanner(System.in);
                    public static void register()
	{
		System.out.println("Enter user name");
		name=r.next();
		System.out.println("Enter password");
		pass=r.next();
		System.out.println("Re-enter password");
		repass=r.next();
		boolean valid=false;
		if(pass.equals(repass))
		{valid=db.validate(name);
		 if(!valid)
			 System.out.println("name exists");
		 else{
				d=aesencrypt.x(name,pass);
				db.insert(d);
			}
		}
		else{System.out.println("passwords do not match");
		}
		
	}
                    
                    
    public static void login()
    {System.out.println("Enter user name");
	name=r.next();
	System.out.println("Enter password");
	pass=r.next();
    d=aesencrypt.x(name,pass);
    db.check(d);
    }
    
public static void viewuser()
{ db.fetchuser();
}
public static void showencrypt()
{db.showdb();
	
}
	public static void main(String[] args) throws SQLException {
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?useSSL=false","root","TheDeadman");
db o=new db(con);
		int count=0;
		
System.out.println("Register");
System.out.println("Login");
System.out.println("View Users");
System.out.println("Show data base state (encrypted)");
while(true){
System.out.println("enter option 1-4");
int option=r.nextInt();
switch(option){
case 1: test.register();
        break;
case 2: test.login();
        break;
case 3: test.viewuser();
        break;
case 4: test.showencrypt();
        break;
default: System.out.println("wrong option. Enter again");
       break;
}// end of switch 
}//end of while
}

}
