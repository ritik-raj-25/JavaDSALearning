package Basics;

public class SystemProperties {
    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        String javaVersion = System.getProperty("java.version");
        System.out.println("OS: "+os);
        System.out.println("Java version: "+javaVersion);
    }
}
