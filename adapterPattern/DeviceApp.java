package adapterPattern;
import java.util.Scanner;

public class DeviceApp {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        Laptop laptop = new Laptop();
        LaptopAdapter laptopAdapter = new LaptopAdapter(laptop);
        Refrigerator refrigerator = new Refrigerator();
        RefrigeratorAdapter refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        Smartphone smartphone = new Smartphone();
        SmartphoneAdapter smartphoneAdapter = new SmartphoneAdapter(smartphone);
        int loop = 0;

        while (loop != 4) {
            System.out.println("\tMAIN MENU\n" +
                    "\t1. Laptop.\n" +
                    "\t2. Refrigerator.\n" +
                    "\t3. Smartphone.\n" +
                    "\t4. Exit.\n");
            System.out.print("Select an electronic device to operate: ");
            int choice = enter.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println(laptopAdapter.plugIn());
                    System.out.println();
                    break;

                case 2:
                    System.out.println(refrigeratorAdapter.plugIn());
                    System.out.println();
                    break;

                case 3:
                    System.out.println(smartphoneAdapter.plugIn());
                    System.out.println();
                    break;

                case 4:
                    loop = choice;
                    System.out.println("Exiting program...\n");
                    break;

                default:
                    System.out.println("Invalid option...\n");
                    break;
            }

        }

    }

}
