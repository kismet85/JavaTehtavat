import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CSVReader {
    private final static String FILE_URL = "https://users.metropolia.fi/~jarkkov/temploki.csv";

    public static void main(String[] args) {
        BufferedReader bufferedstream = null;

        try {
            URL url = new URL(FILE_URL);
            InputStreamReader inputStreamReader = new InputStreamReader(url.openStream());
            bufferedstream = new BufferedReader(inputStreamReader);

            String line;
            String[] columnNames = new String[0];
            boolean header = true;
            double totalTemperature = 0;
            int count = 0;

            while ((line = bufferedstream.readLine()) != null) {
                if (header) {
                    // first row of the file contains names of columns
                    columnNames = line.split(";");
                    header = false;
                } else {
                    // process data lines
                    String[] columns = line.split(";");
                    // just print data lines with column names
                    String[] dateTimeParts = columns[0].split(" ");
                    String dateStr = dateTimeParts[0]; // Extracting "25.10.2023"
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
                    Date date = dateFormat.parse(dateStr);
                    if (isFirstDayOfJanuary2023(date)) {
                        System.out.println("Päivämäärä: " + dateStr + ". Lämpötila paikassa " + columnNames[1] + " on " + columns[1] + " Celsius");
                        String ulkoTaloTempStr = columns[1].replace(",", ".");
                        totalTemperature += Double.parseDouble(ulkoTaloTempStr);
                        count++;

                    }
                }
            }
            System.out.println("Lämpötilojen keskiarvo on: " + (totalTemperature / count));
        } catch (IOException e) {
            // Error output, will print to console even in case of output redirection
            System.err.println(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                // we will close the stream only if we were able to open it
                if (bufferedstream != null)
                    bufferedstream.close();
            } catch (IOException e) {
                System.err.println("Error while closing the stream");
            }
        }
    }
    private static boolean isFirstDayOfJanuary2023(Date date) {
        return date.getDate() == 1 && date.getMonth() == 0 && date.getYear() == 123;
    }
}
