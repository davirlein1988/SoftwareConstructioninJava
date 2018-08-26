package week2;

public class Dry {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(leap(916));

    }
    /*
     * Refactor the following method to accomplish DRY
     * 
     */
    public static int dayOfYear(int month, int dayOfMonth, int year) {
        if (month == 2) {
            dayOfMonth += 31;
        } else if (month == 3) {
            dayOfMonth += 59;
        } else if (month == 4) {
            dayOfMonth += 90;
        } else if (month == 5) {
            dayOfMonth += 31 + 28 + 31 + 30;
        } else if (month == 6) {
            dayOfMonth += 31 + 28 + 31 + 30 + 31;
        } else if (month == 7) {
            dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30;
        } else if (month == 8) {
            dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31;
        } else if (month == 9) {
            dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
        } else if (month == 10) {
            dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
        } else if (month == 11) {
            dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
        } else if (month == 12) {
            dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 31;
        }
        return dayOfMonth;
    }

    public static int dayOfYear2(int month, int day, int year) {
        for (int m = 1; m < month; m++) {

        }

        return day;
    }

    /*
     * This method implements bad code practices
     * it would be better implemented with the leap year algorithm
     */
    public static boolean leap(int y) {
        String tmp = String.valueOf(y);
        if(tmp.charAt(2) == '1' || tmp.charAt(2) == '3' || tmp.charAt(2) == 5 || tmp.charAt(2) == '7' || tmp.charAt(2) == '9' ) {
            if (tmp.charAt(3)=='2'||tmp.charAt(3)=='6') return true;
            else
                return  false;

        }else {
            if (tmp.charAt(2) == '0' && tmp.charAt(3) == '0') {
                return false;
            }
            if (tmp.charAt(3)=='0'||tmp.charAt(3)=='4'||tmp.charAt(3)=='8')return true;

        }
        return false;
    }


}
