import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        Scanner scanner = new Scanner(System.in);
        Homework homework = new Homework();
        homework.setConnection("root", "12345");

        int enter = Integer.parseInt(scanner.nextLine());
        if (enter == 2){
            homework.getVillainsNamesEx2();
        }else if (enter == 3){
            homework.getMinionNamesEx3();
        }else if (enter == 4){
            homework.addMinionEx4();
        }else if (enter == 5){
            homework.changeTownNameCasingEx5();
        }else if (enter == 9){
            homework.increaseAgeStoredProcedureEx9();
        }
    }
}
