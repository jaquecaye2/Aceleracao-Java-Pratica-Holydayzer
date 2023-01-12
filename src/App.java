import java.util.List;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws Exception {
        
        Holidays holidays = new Holidays();

        String date = "15/11/2023";

        System.out.println("");

        System.out.println("Buscando feriado para o dia " + date + "...");
        TimeUnit.MILLISECONDS.sleep(1000);
        
        System.out.println("Resultado: " + holidays.findHoliday(date));
        
        System.out.println("");
        TimeUnit.MILLISECONDS.sleep(500);

        System.out.println("Buscando feriados nacionais em 2023...");
        TimeUnit.MILLISECONDS.sleep(1000);
        
        List<String> allHolidays = holidays.getAllHolidays();
        for (int i = 0; i < allHolidays.size(); i++){
            System.out.println(allHolidays.get(i));
            TimeUnit.MILLISECONDS.sleep(500);
        }

        System.out.println("");
    }
}
