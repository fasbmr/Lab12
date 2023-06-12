package LabE12Exercises7;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * This program demonstrate writing data using FileWriter.
 * 
 * 
 * @author fasbmr
 *
 */
public class E7DataGenerator {

	public static void main( String args[]) throws IOException {
			// Declare output file 
			String sourceFile = "rainfall.txt";
			
			try {
				// Construct Writer 
				Writer writer1 = new FileWriter(sourceFile);
				
				// rainfall data
				writer1.write("2223023,Sg. Duyong,Melaka Tengah,43.0,26.0,26.0,0.0,21.5,0.0\n");
				writer1.write("2322006,Melaka Pindah,Alor Gajah,2.0,18.5,2.5,0.0,5.0,0.5\n");
		        writer1.write("2222002,Durian Tunggal,Alor Gajah,37.0,6.0,9.0,0.0,5.0,4.0\n");
		         
				writer1.close();
				
			} catch (FileNotFoundException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Succesfully created. End of execution. Check out "+ sourceFile);		
	}
}
