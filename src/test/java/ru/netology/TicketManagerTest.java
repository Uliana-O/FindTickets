package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketManagerTest {

    @Test
    public void testSortTickets() {

        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        Ticket ticket1 = new Ticket(1, "SVO", "KZN",  1299, 130);
        Ticket ticket2 = new Ticket(2, "VKO", "LED", 10_475, 135);
        Ticket ticket3 = new Ticket(3, "SVO", "KZN", 5140, 150);
        Ticket ticket4 = new Ticket(4, "AER", "KZN", 8510 , 135);
        Ticket ticket5 = new Ticket(5, "SVO", "KZN", 8070, 140);
        Ticket ticket6 = new Ticket(6, "VKO", "SVX", 5199, 115);
        Ticket ticket7 = new Ticket(7, "DME", "KZN", 9320, 155);
        Ticket ticket8 = new Ticket(8, "VKO", "KZN", 1299, 220);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket8,ticket1,ticket3, ticket5};
        Ticket[] actual = manager.findAll("SVO","KZN");

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testSortTicketsByDuration() {

        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        Ticket ticket1 = new Ticket(1, "SVO", "KZN",  1299, 130);
        Ticket ticket2 = new Ticket(2, "VKO", "LED", 10_475, 135);
        Ticket ticket3 = new Ticket(3, "SVO", "KZN", 5140, 150);
        Ticket ticket4 = new Ticket(4, "AER", "KZN", 8510 , 135);
        Ticket ticket5 = new Ticket(5, "SVO", "KZN", 8070, 140);
        Ticket ticket6 = new Ticket(6, "VKO", "SVX", 5199, 115);
        Ticket ticket7 = new Ticket(7, "DME", "KZN", 9320, 155);
        Ticket ticket8 = new Ticket(8, "VKO", "KZN", 1299, 220);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);


        Ticket[] expected = {ticket7};
        Ticket[] actual = manager.findAll("DME","KZN");

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testShowFewTickets() {

        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        Ticket ticket1 = new Ticket(1, "SVO", "KZN",  1299, 130);
        Ticket ticket2 = new Ticket(2, "VKO", "LED", 10_475, 135);
        Ticket ticket3 = new Ticket(3, "SVO", "KZN", 5140, 150);
        Ticket ticket4 = new Ticket(4, "AER", "KZN", 8510 , 135);
        Ticket ticket5 = new Ticket(5, "SVO", "KZN", 8070, 140);
        Ticket ticket6 = new Ticket(6, "VKO", "SVX", 5199, 115);
        Ticket ticket7 = new Ticket(7, "DME", "KZN", 9320, 155);
        Ticket ticket8 = new Ticket(8, "VKO", "KZN", 1299, 220);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);


        Ticket[] expected = {ticket1,ticket3, ticket5};
        Ticket[] actual = manager.findAll("SVO","KZN");

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testShowNoTickets() {

        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        Ticket ticket1 = new Ticket(1, "SVO", "KZN",  1299, 130);
        Ticket ticket2 = new Ticket(2, "VKO", "LED", 10_475, 135);
        Ticket ticket3 = new Ticket(3, "SVO", "KZN", 5140, 150);
        Ticket ticket4 = new Ticket(4, "AER", "KZN", 8510 , 135);
        Ticket ticket5 = new Ticket(5, "SVO", "KZN", 8070, 140);
        Ticket ticket6 = new Ticket(6, "VKO", "SVX", 5199, 115);
        Ticket ticket7 = new Ticket(7, "DME", "KZN", 9320, 155);
        Ticket ticket8 = new Ticket(8, "VKO", "KZN", 1299, 220);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);


        Ticket[] expected = { };
        Ticket[] actual = manager.findAll("SVX","KZN");

        Assertions.assertArrayEquals(expected, actual);

}
}


