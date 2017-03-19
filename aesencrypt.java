package r110214045.piyushmishra;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

	public class aesencrypt
	{		public static int count=0;
			static SecretKey myDesKey;
	public static void decrypt(String un) throws IOException{
		try{
			
			Cipher desCipher;

		    // Create the cipher
		    desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

		

		    // Initialize the same cipher for decryption
		    desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
//		    byte[] encBytes = new sun.misc.BASE64Decoder().decodeBuffer(un);
//	        byte[] plainTxtBytes = desCipher.doFinal(encBytes);
//	        System.out.println(new String(plainTxtBytes,"UTF-8"));
		    byte[] nametext = un.getBytes();
	    byte[] passtextDecrypted = desCipher.doFinal(nametext);

       System.out.println("Name : " + new String(passtextDecrypted,"UTF-8"));
		    
		}catch(NoSuchAlgorithmException e){
			e.printStackTrace();
		}catch(NoSuchPaddingException e){
			e.printStackTrace();
		}catch(InvalidKeyException e){
			e.printStackTrace();
		}catch(IllegalBlockSizeException e){
			e.printStackTrace();
		}catch(BadPaddingException e){
			e.printStackTrace();
		}

		
		
		
		
		
		
	}
		public static String[] x(String n, String p){
			String[] details=new String[2];
			try{
				
				  KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
				 
				//  SecretKey saved=myDesKey;
				  Cipher desCipher;

			    // Create the cipher
			    desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

			    // Initialize the cipher for encryption
			    if(count==0)
			    { myDesKey = keygenerator.generateKey();
			    	desCipher.init(Cipher.ENCRYPT_MODE,myDesKey);
			    			    count++;}
			    else
			    desCipher.init(Cipher.ENCRYPT_MODE,myDesKey);

			    //sensitive information
			    byte[] nametext = n.getBytes();
			    byte[] passtext = p.getBytes();

			    //System.out.println("Text [Byte Format] : " + text);
			    //System.out.println("Text : " + new String(text));

			    // Encrypt the text
			    byte[] nametextEncrypted = desCipher.doFinal(nametext);
			    byte[] passtextEncrypted = desCipher.doFinal(passtext);
                
			    //System.out.println("Text Encryted : " + textEncrypted);
			    details[0]=new String(nametextEncrypted);
			    details[1]=new String(passtextEncrypted);


			    // Initialize the same cipher for decryption
			//    desCipher.init(Cipher.DECRYPT_MODE, myDesKey);

			    // Decrypt the text
		//	    byte[] nametextDecrypted = desCipher.doFinal(nametextEncrypted);
		//	    byte[] passtextDecrypted = desCipher.doFinal(nametextEncrypted);

			    //System.out.println("Text Decryted : " + new String(textDecrypted));
			   
			}catch(NoSuchAlgorithmException e){
				e.printStackTrace();
			}catch(NoSuchPaddingException e){
				e.printStackTrace();
			}catch(InvalidKeyException e){
				e.printStackTrace();
			}catch(IllegalBlockSizeException e){
				e.printStackTrace();
			}catch(BadPaddingException e){
				e.printStackTrace();
			}
			 return details;
		}
	}

