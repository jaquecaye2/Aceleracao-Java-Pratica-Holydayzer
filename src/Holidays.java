import java.util.ArrayList;
import java.util.List;

public class Holidays {
    private String[] dates = {"01/01/2023", "21/02/2023", "17/04/2023", "21/04/2023", "01/05/2023", "08/06/2023", "07/09/2023", "12/10/2023", "02/11/2023", "15/11/2023", "25/12/2023" };

    private String[] holidays = { "Confraternização mundial", "Carnaval", "Páscoa", "Tiradentes", "Dia do trabalho", "Corpus Christi", "Independência do Brasil", "Nossa Senhora Aparecida", "Finados", "Proclamação da República", "Natal" };

    public String findHoliday(String date) {
        for (int i = 0; i < dates.length; i++) {
            if (dates[i] == date) {
                return holidays[i];
            }
        }

        return "Não existe feriado cadastrado na data informada";
    }

    public List<String> getAllHolidays(){
        List<String> holidaysComplete = new ArrayList<>();

        for (int i = 0; i < dates.length; i++){
            holidaysComplete.add(dates[i] + " => " + holidays[i]);
        }

        return holidaysComplete;
    }
}
