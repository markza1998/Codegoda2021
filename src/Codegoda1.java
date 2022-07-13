import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Codegoda1 {
    void codegodaFirstQuestion(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String days = in.nextLine();
            String[] checkDays = days.split(" ");
            int getCheckIn = map.get(checkDays[0]) == null ? 0 : map.get(checkDays[0]);
            int getCheckOut = map.get(checkDays[1]) == null ? 0 : map.get(checkDays[1]);
            map.put(checkDays[0], getCheckIn + 1);
            map.put(checkDays[1], getCheckOut - 1);
        }
        int maximum = 0;
        String maximumDay = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maximum) {
                maximum = entry.getValue();
                maximumDay = entry.getKey();
            }
        }
        System.out.println(maximumDay);
    }
}
