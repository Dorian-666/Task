public class Computer {

    CPU cpu;

    Storage storage;

    Model model;

    public Computer(CPU givenCpu, Storage givenStorage, Model givenModel) {
        cpu = givenCpu;
        storage = givenStorage;
        model = givenModel;
    }

    void showSpecifications() {
        System.out.println("Cpu -> Model:" + cpu.model + " Year:" + cpu.yearCpu + " Generation:" + cpu.generation + " Speed:" + cpu.speedCpu);
        System.out.println("Storage -> Ram:" + storage.ram + " Rom:" + storage.rom);
        System.out.println("Model -> Corporation:" + model.corporation + " ComputerModel:" + model.computerModel + " Year:" + model.yearModel);
    }

}
