package klasserObjekter;

class AirlineTickets{
    String passengerName;
    String departure ;
    String destination;
    int timeToDeparture;
    static  int numberOfTickets;

    public void ticketInfo(){
        System.out.println("the passenger is named " +passengerName);
        System.out.println("they are travelling to "+ destination);
        System.out.println("the plane leaves in "+ timeToDeparture+ " minutes, you are late.");
    }
}
public class Oppgave06Ø {
    public static void main(String[]args){
        AirlineTickets ticket1 = new AirlineTickets();
        ticket1.passengerName = "Bahar";
        ticket1.departure = "Oslo";
        ticket1.destination = "Bergen";
        ticket1.timeToDeparture = 60;
        AirlineTickets.numberOfTickets ++;
        System.out.println(AirlineTickets.numberOfTickets);

        //Italia
        AirlineTickets ticket2 = new AirlineTickets();
        ticket2.passengerName = "LINE";
        ticket2.departure = "Oslo";
        ticket2.destination = "Milano";
        ticket2.timeToDeparture = 180;
        AirlineTickets.numberOfTickets ++;
        System.out.println(AirlineTickets.numberOfTickets);

        //Hamburg
        AirlineTickets ticket3 = new AirlineTickets();
        ticket3.passengerName = "PER";
        ticket3.departure = "OSLO";
        ticket3.destination = "Hamburg";
        ticket3.timeToDeparture = 90;
        AirlineTickets.numberOfTickets ++;
        System.out.println(AirlineTickets.numberOfTickets);
    }
}