package com.sda.georgeivascu.petclinic;

import com.sda.georgeivascu.petclinic.controller.VetController;
import com.sda.georgeivascu.petclinic.repository.VetRepositoryImpl;
import com.sda.georgeivascu.petclinic.service.VetServiceImpl;
import com.sda.georgeivascu.petclinic.utils.SessionManager;
import com.sda.georgeivascu.petclinic.utils.UserOption;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        SessionManager.getSessionFactory();
        VetController vetController = new VetController(new VetServiceImpl(new VetRepositoryImpl()));
        UserOption userOption;
        Scanner scanner = new Scanner(System.in);
        do{
            UserOption.displayAllOptions();
            System.out.println("Please select an option: ");
            int numericOption = scanner.nextInt();
            userOption = UserOption.findByNumericOption(numericOption);
            try {
                UserOption.displayAllOptions();
                System.out.println("Please select an option: ");
                numericOption = Integer.parseInt(scanner.nextLine().trim());
                userOption = UserOption.findByNumericOption(numericOption);
            }catch (NumberFormatException e){
                userOption = UserOption.UNKNOWN;
            }
            switch (userOption){
                case ADD_VET:
                    vetController.createVet();
                    break;
                case VIEW_ALL_VETS:
                    vetController.showAllVets();
                    break;
                case VIEW_VET_BY_ID:
                    vetController.showVetById();
                    break;
                case UNKNOWN:
                    System.err.println("!INVALID OPTION SELECTED!");
                    break;
                case EXIT:
                    System.out.println("Bye!");
                    break;
            }
        }while (userOption != UserOption.EXIT);
        SessionManager.shutDown();
    }
}