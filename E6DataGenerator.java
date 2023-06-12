package LabE12Exercises6;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * This program demonstrate writing data using DataOutputStream.
 * 
 * 
 * @author fasbmr 
 *
 */

public class E6DataGenerator {
	
	public static void main(String[] args) {
		
		// Declare output file 
		String outFile = "DailyRainfall.txt";
		
		// Data declaration
		try {
			// to read data
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
	
			dos.writeUTF("2225044");
			dos.writeUTF("Chohong");
			dos.writeUTF("Jasin");
			dos.writeFloat(39.0F);
			dos.writeFloat(14.5F);
			dos.writeFloat(24.5F);
			dos.writeFloat(0.5F);
			dos.writeFloat(3.5F);
			dos.writeFloat(0.0F);
					
			dos.writeUTF("2222033");
			dos.writeUTF("Batu Hampar");
			dos.writeUTF("Melaka Tengah");
   			dos.writeFloat(30.0F);
			dos.writeFloat(11.5F);
			dos.writeFloat(22.0F);
			dos.writeFloat(0.0F);
        	dos.writeFloat(21.5F);
        	dos.writeFloat(0.0F);
			
            // Flush for each writing
         	dos.flush();  			
			// Close stream
			dos.close();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
		// Indicate end of program - Could be successful
		System.out.println("Successfully created. End of program. Check out " + outFile); 
	}
}
