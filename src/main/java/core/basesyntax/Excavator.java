package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Truck started its work!");
    }

    @Override
    public void stopWorked() {
        System.out.println("Excavator started its work!");
    }
}
