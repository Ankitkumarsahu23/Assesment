import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class PIItest {

	public static void main(String[] args) throws Exception {
		BufferedReader b = new BufferedReader(new FileReader("testfile.txt"));
		 String str = b.readLine();
		 
		 while((str = b.readLine())!= null) {
			 
			 StringTokenizer stn = new StringTokenizer(str);
			 String Roll_No = stn.nextToken();
			 String Email = stn.nextToken();
			 String Aadhar_No = stn.nextToken();
			 String  Mobile_No = stn.nextToken();
			 			 
			 System.out.println("Roll_No - " + Roll_No);
			 System.out.println("Email id - " + Email);
			 System.out.println("Aadhar_No - " + Aadhar_No);
			 System.out.println("Mobile_No - " + Mobile_No);
			 System.out.println("***********************" );
		 }

	}

}
