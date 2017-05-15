package cmps;

import java.io.IOException;

public class cm {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Process p = Runtime.getRuntime().exec("getmac /fo csv /nh");
	    java.io.BufferedReader in = new java.io.BufferedReader(new  java.io.InputStreamReader(p.getInputStream()));
	    String line;
	    line = in.readLine();        
	    String[] result = line.split(",");

	    System.out.println(result[0].replace('"', ' ').trim());

	}

}
