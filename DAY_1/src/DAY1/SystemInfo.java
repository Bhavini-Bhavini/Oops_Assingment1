package DAY1;
public class SystemInfo {
    public static void main(String[] args) {
        String javaVersion = System.getProperty("java.version");
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String architecture = System.getProperty("os.arch"); 
        String workingDir = System.getProperty("user.dir");   

        System.out.println("SYSTEM INFORMATION");
        System.out.println("Java Version: " + javaVersion);
        System.out.println("Operating System: " + osName);
        System.out.println("User Name: " + userName);
        System.out.println("Architecture: " + architecture);
        System.out.println("Working Directory: " + workingDir);
    }
}
