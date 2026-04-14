import java.util.ArrayList;
import java.util.List;

public class TrainManagementApp {
    public static void main(String[] args) {
        // Application prints welcome message
        System.out.println("=== Train Consist Management App ===");

        // Train consist is initialized using ArrayList
        List<String> trainConsist = new ArrayList<>();

        // Initial bogie count is displayed
        System.out.println("Initial bogie count: " + trainConsist.size());
    }
}