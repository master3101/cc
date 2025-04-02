import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.*;
public class MD5Example
{
	public static void main(String[] args)
	{
		String inputString;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.print("Enter any text:");
			inputString=br.readLine();
			MessageDigest md=MessageDigest.getInstance("MD5");
			byte[] hashBytes=md.digest(inputString.getBytes());
			
			StringBuilder hexStringBuilder=new StringBuilder();
			for(byte hashByte: hashBytes) {
			hexStringBuilder.append(String.format("%02x",hashByte));

}
		System.out.println("MD5 Hash: "+hexStringBuilder.toString());
		}
		catch(Exception e)
	{
		e.printStackTrace();
	}
	}
}