package Harshasirprograms;

import org.apache.commons.codec.binary.Base64;

public class PasswordEncodingDecoding
{
	public static void main(String[] args) 
	{
		String str="hello" ;
		byte[] bytesEncoded = Base64.encodeBase64(str.getBytes());
		System.out.println(new String(bytesEncoded));

		byte[] decodedValue = Base64.decodeBase64(bytesEncoded);
		System.out.println(new String(decodedValue));
	}
}