public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Solution sol = new Solution();
        sol.timeConversion("12:00:01PM");
    }
}

class Solution {
    public String timeConversion (String time) {
        String convertedTime = "";
        String timeStatus = time.substring(time.length() - 2);
        String[] timeStamp = time.substring(0, time.length() - 2).split(":");
        // for(String currentTime : timeStamp) {
        //     System.out.println(currentTime);
        // }
        if (timeStatus.equals("PM")) {
            String hour = "";
            switch (timeStamp[0]) {
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
                case "12":
                    hour = "00";
                    break;
            }
        }
        System.out.println(timeStatus);
        return null;
    }
}