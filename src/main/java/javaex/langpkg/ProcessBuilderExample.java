package javaex.langpkg;

import java.io.File;
import java.io.IOException;

public class ProcessBuilderExample {
    public static void main(String[] args) {
        ProcessBuilder processBuilder = new ProcessBuilder();

        // Set the command to run
        processBuilder.command("notepad", "Hello, World!");

        // Redirect the standard output to a file

        // Redirect the error stream to discard
        processBuilder.redirectError(ProcessBuilder.Redirect.DISCARD);

        try {
            // Start the process
            Process process = processBuilder.start();

            // Wait for the process to complete
            processBuilder.redirectOutput(ProcessBuilder.Redirect.to(new File("output.txt")));

            int exitCode = process.waitFor();
            System.out.println("Process exited with code: " + exitCode);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
