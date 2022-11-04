import com.techelevator.DiveTable;

import java.util.Scanner;

public class DiveTableProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What was your depth? ");
        int depth = input.nextInt();
        input.nextLine();

        System.out.print("What was your bottom time? ");
        int bottomTime = input.nextInt();
        input.nextLine();

        System.out.print("What was your surface interval? ");
        int surfaceInterval = input.nextInt();
        input.nextLine();

        DiveTable diveTable = new DiveTable(depth, bottomTime, surfaceInterval);
        char pressureGroup = diveTable.calculatePressureGroup();
        System.out.println("Your pressure group is now: " + pressureGroup);
    }
}
