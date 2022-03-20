package FRS;


public class MainRun {

    public static void main(String[] args) {
        Ticket regularTicket = new RegularTicket("5758907", "Chennai",
                "Mumbai", "DepartureDateTime", "ArrivalDateTime",
                "56", 10000, false, null, null, "meal");

        Ticket touristTicket = new TouristTicket("6797468", "India", "France",
                "DepartureDateTime", "ArrivalDateTIme",
                "67", 30000, false, null, null,
                "Hotel Maladian", new String[]{""});

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }

}
