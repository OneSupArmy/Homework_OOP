package homeworkOOP.diagnosticStation;

import homeworkOOP.transport.Bus;
import homeworkOOP.transport.Transport;
import homeworkOOP.utility.TransportTypeException;

import java.util.*;

public abstract class DiagnosticStation {
    private static Queue<Transport> transportQueue = new LinkedList<>();

    public static void addTransportInQueue(Transport transport) {
        if (transport instanceof Bus) {
            try {
                throw new TransportTypeException("Невозможно добавить автобус в очередь");
            } catch (TransportTypeException e) {
                System.out.println(e.getMessage());
            }
        } else if (transportQueue.contains(transport)) {
            System.out.println("Транспортное средство уже в очереди");
        } else {
            transportQueue.add(transport);
        }
    }

    public static void doDiagnostic() {
        transportQueue.poll();
    }

    public static void printTransportQueue() {
        if (transportQueue.isEmpty()) System.out.println("Нет транспортных средств в очереди");
        else for (Transport transport : transportQueue) {System.out.println(transport.toString());}
    }
}
