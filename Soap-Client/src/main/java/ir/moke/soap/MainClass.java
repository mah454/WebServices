package ir.moke.soap;

import ir.moke.soap.stubs.person.PersonServiceStub;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;

import java.io.InputStream;
import java.rmi.RemoteException;
import java.util.Scanner;

/**
 * Created by Mahdi Sheikh Hosseini on 9/29/16.
 */
public class MainClass {
    public static void main(String[] args) throws AxisFault {
        System.out.println("Welcome \n" +
                "You can use this services : \n\n" +
                "1) Person Information Service\n" +
                "2) Calculator Service");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter service [Usage : number of service] : ");
        String userInput = scanner.next();
        System.out.println(userInput);


    }

    public static void getPersonService(String name) {
        try {
            PersonServiceStub stub = new PersonServiceStub();
            PersonServiceStub.GetName request = new PersonServiceStub.GetName();
            request.setArgs0(name);
            PersonServiceStub.GetNameResponse response = stub.getName(request);
            System.out.println(response.get_return());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
