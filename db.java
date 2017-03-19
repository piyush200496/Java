package r110214045.piyushmishra;
import java.sql.*;  
public class db {  
	static Connection c;
	db(Connection con)
	{c=con;}
	
	public static boolean validate(String name){  
	//boolean status=false;  
	try{  
	//Class.forName("oracle.jdbc.driver.OracleDriver");  
	PreparedStatement ps=c.prepareStatement(  
	"select * from userdb where name=?");  
	ps.setString(1,name);  
	 ResultSet status=ps.executeQuery();  
	if(status.next())
	{return false;		
	}
	else
	{return true;
	}
	}
	catch(Exception e){}
	return false;
	}
	
	public static void insert(String[] inputdetails){
	try{	
		Statement s=c.createStatement();
		boolean status1=s.execute("insert into userdb(name,password) values('"+inputdetails[0]+"','"+inputdetails[1]+"')");
	
	}catch(Exception e){System.out.println(e);}  
	}
public static void check(String[] inputdetails)
{
	try{
		PreparedStatement p=c.prepareStatement("select password from userdb where name=?");
		p.setString(1, inputdetails[0]);
		ResultSet r=p.executeQuery();
		if(r.next())
		{if(inputdetails[1].equals(r.getString("password")))
		 System.out.println("valid user");
		 else{System.out.println("wrong password");}
		}
		else{System.out.println("Wrong user name");
		}
		}catch(Exception e){}
}
public static void fetchuser()
{try{Statement s=c.createStatement();
     ResultSet r=s.executeQuery("Select name from userdb");
     while(r.next())
     {
    	aesencrypt.decrypt(r.getString("name")); 
     }
	
}catch(Exception e)
{System.out.println(e);
}
}
public static void showdb()
{try{Statement s1=c.createStatement();
     ResultSet r1=s1.executeQuery("Select * from userdb");
     while(r1.next())
     {
    	System.out.println("name:"+r1.getString("name")+" "+"passowrd:"+r1.getString("password")); 
     }
	
}catch(Exception e)
{System.out.println(e);
}
}
}