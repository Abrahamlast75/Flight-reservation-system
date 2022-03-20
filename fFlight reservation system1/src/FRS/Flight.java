package FRS;

public class Flight {

        private int capacity;
        private int bookedSeats;
        private String flightNumber;
        private String airline;


        public Flight( int capacity, int bookedSeats, String flightNumber, String airline) {
            this.capacity = capacity;
            this.bookedSeats = bookedSeats;
            this.flightNumber = flightNumber;
            this.airline = airline;
        }

        public int getCapacity()
        {
        return this.capacity ;
        }

        public void setCapacity(int capacity)
        {
        this.capacity = capacity;
        }

        public int getBookedSeats()
        {
        return this.bookedSeats;
        }

        public void setBookedSeats(int bookedSeats)
        {
        this.bookedSeats = bookedSeats;
        }
        public String getFlightNumber() {
            return this.flightNumber;
        }

        public void setFlightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
        }

        public String getAirline()
        {
            return this.airline;
        }

        public void setAirline(String airline)
        {
            this.airline = airline;
        }



        public String getFlightDetails() {
            return "Flight No: " + this.flightNumber + ", Airline: " + this.airline + ", Capacity: " + this.capacity + ", Booked Seats: " + this.bookedSeats;
        }

        public boolean checkAvailability()
        {
            return this.bookedSeats < this.capacity;
        }

        public void incrementBookingCounter()
        {
            ++this.bookedSeats;
        }
    }



