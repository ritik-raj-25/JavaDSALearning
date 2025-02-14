//Computer, CPU and Memory

package OOPs;

class CPU{
    private String model;
    public CPU(String model) {
        this.model = model;
    }
    public void displayInfo(){
        System.out.println("CPU Model: "+model);
    }
}

class Memory {
    private int size;
    public Memory(int size) {
        this.size = size;
    }
    public void displayInfo(){
        System.out.println("Memory size: "+size+" GB");
    }
}

class Computer {
    private CPU cpu;
    private Memory memory;
    public Computer(String cpuModel, int memorySize) {
        this.cpu = new CPU(cpuModel); //Composition
        this.memory = new Memory(memorySize); //Composition
    }
    public void displayInfo() {
        System.out.println("Computer Info: ");
        cpu.displayInfo();
        memory.displayInfo();
    }
}

public class CompositionExampleTwo {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel i9", 32);
        computer.displayInfo();
    }
}
