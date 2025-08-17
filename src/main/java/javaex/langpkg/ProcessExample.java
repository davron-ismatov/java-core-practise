package javaex.langpkg;

public class ProcessExample {

    public static void main(String[] args) {
        ProcessHandle.allProcesses().forEach(process -> {
            System.out.println("Process Id: " + process.pid());
            System.out.println("Direct children: " + process.children());
            System.out.println("Class name: " + process.getClass());
            System.out.println("Command: " + process.info().command());
    });
    }
}
