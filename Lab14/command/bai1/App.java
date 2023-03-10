package designpattern.command.bai1;

public class App {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        Computer computer2 = new Computer();

        Switch myswitch = new Switch();

        RestartCommand restartCommand1 = new RestartCommand(computer1);
        ShutdownCommand shutdownCommand1 = new ShutdownCommand(computer1);

        RestartCommand restartCommand2 = new RestartCommand(computer2);
        ShutdownCommand shutdownCommand2 = new ShutdownCommand(computer2);

        myswitch.storeAndExecute(restartCommand1);
        myswitch.storeAndExecute(shutdownCommand2);
        System.out.println();

        myswitch.executeAllCommands();
    }
}
