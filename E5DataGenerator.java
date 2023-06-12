package LabE12Exercise5;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * This program demonstrate writing data using DataOutputStream.
 * 
 * 
 * @author fasbmr
 *
 */

public class E5DataGenerator {

      public static void main(String[] args) {
		// Declare output file 
		String outFile = "DailyRainfall.txt";
		
		// Data declaration
		String dailyrainfall[] = {"Day 1", "Day 2", "Day 3", "Day 4", "Day 5", "Day 6"};
        double rainfall[] = {0.0, 6.0, 19.0, 1.0, 0.0, 61.0};
		
		try {
			// to read data
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(outFile));
			
			dos.writeUTF("Simpang Ampat");
			dos.writeUTF("Alor Gajah");
			// Process data
			for (int index = 0; index < dailyrainfall.length; index++) {
				
				// Write data into data stream
				dos.writeUTF(dailyrainfall[index]);
				dos.writeDouble(rainfall[index]);
				
				// Flush for each writing
				dos.flush();
			}
			
			// Close stream
			dos.close();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		
		// Indicate end of program - Could be successful
		System.out.println("End of program. Check out " + outFile); 
	}
}
