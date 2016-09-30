package ir.moke.webservice.soap;

/**
 * Created by Mahdi Sheikh Hosseini on 9/28/16.
 */
public class PersonService {
    public PersonService() {
        System.out.println("Run WebService ...");
    }

    public String getName(String name) {
        return "Your name is : " + name ;
    }

    public String getFamily(String family) {
        return "Your name is : " + family ;
    }
}
