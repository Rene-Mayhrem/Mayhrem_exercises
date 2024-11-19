public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Solution sol = new Solution();
        System.out.println(sol.timeConversion("12:45:45PM"));
    }
}

class Solution {
    public String timeConversion(String time) {
        // HH:MM:SSPM
        // IF 12 - PM - KEEPS THE SAME
        // IF 01 PM TO 11 PM -> CHANGE FORMAT
        // IF 01 AM TO 11 AM -> KEEPS THE SAME
        // IF 12 AM - CHANGE TO 00

        //? HH:MM:SS IF NEEDED TO KEEP THE SAME
        //? :MM:SS IF HOUR CHANGES
        //? AM TO DECIDE
        String timePeriod = time.substring(time.length() - 2);
        String staticTime = time.substring(2, time.length() - 2);

        


        String convertedTime = time.substring(2, time.length() - 2);
        String timeStatus = time.substring(time.length() - 2);
        String hourStamp = time.substring(0, 2);
        if (timeStatus.equals("PM")) {
            String hour = "";
            switch (hourStamp) {
                case "01":
                    hour = "13";
                    break;
                case "02":
                    hour = "14";
                    break;
                case "03":
                    hour = "15";
                    break;
                case "04":
                    hour = "16";
                    break;
                case "05":
                    hour = "17";
                    break;
                case "06":
                    hour = "18";
                    break;
                case "07":
                    hour = "19";
                    break;
                case "08":
                    hour = "20";
                    break;
                case "09":
                    hour = "21";
                    break;
                case "10":
                    hour = "22";
                    break;
                case "11":
                    hour = "23";
                    break;
                default:
                    return hourStamp + convertedTime;
            }
            return convertedTime = hour + convertedTime;
        }
        if (hourStamp.equals("12")) {
            return "00" + convertedTime;
        }
        return hourStamp + convertedTime;
    }
}