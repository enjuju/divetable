import com.techelevator.DiveTable;

public class DiveTableProgram {
    public static void main(String[] args) {
        DiveTable diveTable = new DiveTable(35, 10, 60);
        char pressureGroup = diveTable.calculatePressureGroup();
        System.out.println(pressureGroup);
    }
}
