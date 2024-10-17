package FunctionalProgramming;
import java.io.*;
import java.net.*;

class countAge {
    public static void main(String[] args) {
        // Set the user agent property for the HTTP connection
        System.setProperty("http.agent", "Chrome");

        // Challenge Token
        String challengeToken = "h4w7fkyc1";

        try {
            // Create the URL object
            URL url = new URL("https://coderbyte.com/api/challenge/json/age-counting");
            // Open the connection
            URLConnection connection = url.openConnection();
            // Get the input stream from the connection
            InputStream inputStream = connection.getInputStream();
            // Create a BufferedReader to read the response
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder response = new StringBuilder();
            String line;

            // Read the response line by line
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            // Process the JSON response to count ages
            int ageCount = countAges(response.toString());

            // Format the final output
            String finalOutput = ageCount + ":" + new StringBuilder(challengeToken).reverse().toString();
            System.out.println(finalOutput);
        } catch (IOException ioEx) {
            System.out.println("IOException: " + ioEx.getMessage());
        }
    }

    private static int countAges(String jsonResponse) {
        // Extract the "data" field from the JSON response
        String data = jsonResponse.split("\"data\":\"")[1].split("\"")[0];

        // Split the data into key-age pairs
        String[] items = data.split(", ");
        int count = 0;

        // Count how many ages are greater than or equal to 50
        for (String item : items) {
            if (item.contains("age=")) {
                String agePart = item.split("age=")[1];
                int age = Integer.parseInt(agePart);
                if (age >= 50) {
                    count++;
                }
            }
        }

        return count;
    }
}
