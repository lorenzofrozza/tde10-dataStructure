package Queue.ex01;

import java.util.Queue;

public class ServiceQueue {

    public static void main(String[] args) {
        serviceClient();

    }
    public static void serviceClient(){
        Client c1 = new Client("Ana", 5);
        Client c2 = new Client("Pedro", 3);
        Client c3 = new Client("Joao", 8);
        Client c4 = new Client("Miguel", 15);

        //adding
        GenericQueue<Client> queue= new GenericQueue<>(100);
        queue.push(c1);
        queue.push(c2);
        queue.push(c3);
        queue.push(c4);

        double totalTimeSpent = 0;
        int totalClients = 0;


        //serving clients
        while (!queue.isEmpty()){
            Client client = queue.pop();
            System.out.println("Name: " + client.getName() + ", Service time: " + client.getTime());
            totalTimeSpent += client.getTime();
            totalClients++;
        }

        System.out.println("\nTotal time spent: "+totalTimeSpent +" minutes"+"\nTotal clients served: "+totalClients);
    }
}