import java.util.*;
public class DateUtil {
    public static boolean isLeapYear(int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            if (year % 4 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year >= 1 && year <= 9999) {
            if (month >= 1 && month <= 12) {
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                    if (day >= 1 && day <= 31) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (month == 2) {
                    if (isLeapYear(year) == true) {
                        if (day >= 1 && day <= 29) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (isLeapYear(year) == false) {
                        if (day >= 1 && day <= 28) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                } else {
                    if (day >= 1 && day <= 30) {
                        return true;
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        return false;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int output = 0;
        if ((year / 100) % 4 == 0) {
            output += 6;
        }
        if ((year / 100) % 4 == 3) {
            output += 0;
        }
        if ((year / 100) % 4 == 2) {
            output += 2;
        }
        if ((year / 100) % 4 == 1) {
            output += 4;
        }
        output += (year % 100) + ((year % 100) / 4) + day;
        if (month == 1) {
            if (isLeapYear(year) == true) {
                output += 6;
            } else {
                output += 0;
            }
        }
        if (month == 2) {
            if (isLeapYear(year) == true) {
                output += 3;
            } else {
                output += 2;
            }
        }
        if (month == 3 || month == 11) {
            output += 3;
        }
        if (month == 4 || month == 7) {
            output += 6;
        }
        if (month == 5) {
            output += 1;
        }
        if (month == 6) {
            output += 4;
        }
        if (month == 8) {
            output += 2;
        }
        if (month == 9 || month == 12) {
            output += 5;
        }
        return output % 7;
    }

    public static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    public static String[] dayWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public static String toString(int year, int month, int day) {
        int dayOfWeek = getDayOfWeek(year, month, day);
        return dayWeek[dayOfWeek] + " " + day + " " + strMonths[month-1] + " " + year;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input year: ");
        int year = in.nextInt();
        System.out.print("Input month: ");
        int month = in.nextInt();
        System.out.print("Input day: ");
        int day = in.nextInt();
        if(isValidDate(year, month, day) == true)
        {
            System.out.print(toString(year, month, day));
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}
