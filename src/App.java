public class App {
    public static void main(String[] args) throws Exception {
        final String[] dates = new String[]{"01/01/2023", "21/02/2023", "17/04/2023", "21/04/2023", "01/05/2023", "08/06/2023", "07/09/2023","12/10/2023", "02/11/2023",  "15/11/2023", "25/12/2023"};
        final String[] dateNames = new String[]{"Confraternização mundial", "Carnaval", "Páscoa", "Tiradentes", "Dia do trabalho", "Corpus Christi", "Independência do Brasil", "Nossa Senhora Aparecida", "Finados", "Proclamação da República", "Natal"};

        Holidays brasilianHolidays = new Holidays(dates, dateNames);

        brasilianHolidays.printAllHolidays();
        System.out.println("");
        System.out.println(brasilianHolidays.returnHoliday("01/01/2023"));
        System.out.println("");        
        System.out.println(brasilianHolidays.returnHoliday("12/10/2023"));
        System.out.println("");
        System.out.println(brasilianHolidays.returnHoliday("02/01/2023"));
    }
}
