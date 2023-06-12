package LabE12Exercises6;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * This program demonstrate reading data using DataInputStream.
 * 
 * 
 * @author fasbmr 
 *
 */

public class E6DataReader {
	public static void main(String[] args) {
		
		// Declare output file 
		String sourceFile = "DailyRainfall.txt";
		String line = "-------------------------------------";
	
		System.out.println(line);
		System.out.println("Reading data from " + sourceFile);
		System.out.println("Rainfall Data for 6 days");
		System.out.println(line + "\n");
		
		try {
			// to read data
			DataInputStream data = new DataInputStream(new FileInputStream(sourceFile));
            
	         while (data.available() > 0) {
	                String StationID = data.readUTF();
	                String StationName = data.readUTF();
	                String DistrictName = data.readUTF();
	                float[] DRainfall = new float[6];
	                
	                for (int i = 0; i < 6; i++) {
	                	DRainfall[i] = data.readFloat();
	                }
	                
	                // rainfall data
	                System.out.println("Station ID    : " + StationID);
	                System.out.println("Station Name  : " + StationName);
	                System.out.println("District Name : " + DistrictName);
	                System.out.println("\n");
	                for (int i = 0; i < 6; i++) {
	    				System.out.println("Day " + (i + 1) + " : " + DRainfall[i]);
	    				
	                }
          
	                // average rainfall
	                float averagerainfall = calculateAverage(DRainfall);
	                System.out.print("\nAverage rainfall for 6 days : ");
	                System.out.printf("%.1f",averagerainfall);
	                
	                System.out.println("\n");
	   			    System.out.println(line + "\n");
	            }
			// Close stream
			data.close();
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		// Indicate end of program - Could be successful
		System.out.println("End of program.");
		
	}

	private static float calculateAverage(float[] rainfallData) {
		// TODO Auto-generated method stub
		float total = 0;
        for (float rainfall : rainfallData) {
        	total += rainfall;
        }
        return total / rainfallData.length;
	}
}
