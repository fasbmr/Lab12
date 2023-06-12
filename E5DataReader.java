package LabE12Exercise5;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * This program demonstrate reading data using DataInputStream.
 * 
 * 
 * @author fasbmr 
 *
 */

public class E5DataReader {
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
			DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));

			// Variables for processing byte-based data
			double rainfallData = 0;
			double totalrainfallData = 0;
			int noOfRecords = 0;
			String date = "";
			
			String stationName = dis.readUTF();
            String districtName = dis.readUTF();
			
			// rainfall data
            System.out.println("Station Name  : " + stationName);
            System.out.println("District Name : " + districtName);
            System.out.println("\n");
			
			// Process data 
			while(dis.available() > 0) {
				// Read data
				date = dis.readUTF();
				rainfallData = dis.readDouble();
				System.out.println( date + " : " + rainfallData);
				
				// Calculate total utilization
				totalrainfallData += rainfallData;
				noOfRecords ++;
			}
			
			// Close stream
			dis.close();
			
			// Calculate average rainfall
			double averagerainfall = 	totalrainfallData / noOfRecords;
			String formattedAverage = String.format("%.1f", averagerainfall);
			System.out.print("\nAverage rainfall for " + noOfRecords 
					+ " days : " + formattedAverage + "%");
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
		System.out.println("\n");
		System.out.println(line + "\n");
		
		// Indicate end of program - Could be successful
		System.out.println("End of program.");
		
	}
}
