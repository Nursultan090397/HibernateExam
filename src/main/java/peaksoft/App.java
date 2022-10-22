package peaksoft;

import peaksoft.models.Client;
import peaksoft.service.ClientService;

public class App
{
    public static void main( String[] args ) {
        ClientService clientService = new ClientService();
        Client client1 = new Client(
                "Nursultan",
                "Osorov",
                "+996 990 09 03 97",
                "osrov97@mail.ru",
                "1234"

        );
        Client client2 = new Client(
                "Nurgazy",
                "Baetov",
                "+996 990 09 03 97",
                "baetov@mail.ru",
                "081262"

        );
        clientService.register(client1);
        clientService.register(client2);

        System.out.println(clientService.login("osrov97@mail.ru", "1234"));
        System.out.println(clientService.login("baetov@mail.ru", "081262"));

        clientService.findAll().forEach(System.out::println);

    }
}
