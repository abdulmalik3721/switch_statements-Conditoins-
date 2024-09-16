public class Switch {
    public static void main(String[] args) {
      /*  int value = 1;

        if(value==1){
            System.out.println("Value was 1");
        }
        else if(value==2){
            System.out.println("Value was 2");
        }
        else{
            System.out.println("Value was not 1 or 2");
        }*/
        int switchValu=2;
        switch(switchValu){
            case 1:
                System.out.println("value was 1");
                break;
            case 2: case 3: case 4:
                System.out.println("value may be 2 ,3,4");
                System.out.println("but actual value was " + switchValu);
                break;
            default:
                System.out.println("value was not 1 or 2");
                break;

        }

        String month="october";

        System.out.println(month + " is in the " + getQuarter(month) + " quarter");







    }

    public static String getQuarter(String month){
        switch(month){
            case "JANUARY":
            case "FEBRUARY":
                case "MARCH":
                    return "1st";
            case "april":
            case "may":
            case "june":
                return " 2nd";
            case "july":
            case "august":
            case "september":
                return "3rd";
            case "october":
            case "november":
            case "december":
                return "4th";
        }
        return "bad";
    }
}

