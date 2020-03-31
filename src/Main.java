public class Main {

    public static void main(String[] args) {

        CPU cpu = new CPU("Intel", 2018, 9, 4.0);
        Storage storage = new Storage(16, 256);
        Model model = new Model("Acer", "Predator", 2018);

        Computer computer = new Computer(cpu, storage, model);

        computer.showSpecifications();

    }

}
