import java.util.ArrayList;
import java.util.List;

public class Holidays {
  List<Holiday> holidaysList = new ArrayList<Holiday>();

  public Holidays(String[] dates,String[] dateNames) {
    for (int i = 0; i < dates.length; i++) {
      Holiday holiday = new Holiday(dates[i], dateNames[i]);
      this.holidaysList.add(holiday);
    }
  }

  public void addHoliday(Holiday holiday) {
    holidaysList.add(holiday);
  }

  public List<Holiday> returnAllHolidays() {
    return this.holidaysList;
  }

  public void printAllHolidays(){
    for (int i = 0; i < this.holidaysList.size(); i++) {
      Holiday holiday = this.holidaysList.get(i);
      System.out.println(holiday.date + " => " + holiday.name);
    }
  }

  public String returnHoliday(String date) {
    for (int i = 0; i < holidaysList.size(); i++) {
      if(date.equals(holidaysList.get(i).date)) {
        return holidaysList.get(i).name;
      }
    }
    return "There is no holiday on this date";
  };
}
