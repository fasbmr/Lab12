package LabE12Exercises7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * This program demonstrate reading data using FileReader.
 * 
 * 
 * @author fasbmr 
 *
 */
public class E7DataReader {
    public static void main(String[] args) {
    	try (BufferedReader reader = new BufferedReader(new FileReader("rainfall.txt"))) {
            String line;
            String frame = "-------------------------------------";
            
            System.out.println(frame);
    		System.out.println("Reading of 6 days rainfall data");
    		System.out.println(frame + "\n");
            
            
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                int StationID = Integer.parseInt(data[0]);
                String StationName = data[1];
                String DistrictName = data[2];
                double[] DRainfall = new double[6];

                for (int i = 0; i < 6; i++) {
                	DRainfall[i] = Double.parseDouble(data[i + 3]);
                }

                // rainfall data
                System.out.println("Station ID    : " + StationID);
                System.out.println("Station Name  : " + StationName);
                System.out.println("District Name : " + DistrictName + "\n");
               
                for (int days = 0; days < 6; days++) {
                    System.out.println("Day " + (days + 1) + ": " + DRainfall[days]);
                }
                // average rainfall
                double averageRainfall = calculateAverage(DRainfall);
                System.out.println("\nAverage 6 days of Rainfall : " + averageRainfall);
                System.out.println("--------------------------------------------------\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    	// Indicate end of program - Could be successful
         System.out.println("End of program.");
    }

		private static double calculateAverage(double[] rainfallData) {
			   double total = 0;
		        for (double rainfall : rainfallData) {
		        	total += rainfall;
		        }
		        return total / rainfallData.length;
		    }
		}

	    
	  
	
