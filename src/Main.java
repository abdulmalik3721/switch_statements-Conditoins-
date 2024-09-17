public class Main {
    public static void main(String[] args) {

//printDayOfTheWeek(3);
        pritnWeekDay(0);
    }

    public static void printDayOfTheWeek(int day){
        String dayOfWeek =switch(day){
            case 0 -> {yield "sunday";}
            case 1 -> {yield "monday";}
            case 2 -> {yield "tuesday";}
            case 3 -> {yield "wednesday";}
            case 4 -> {yield "thursday";}
            case 5 -> {yield "friday";}
            case 6 -> {yield "saturday";}
            default -> "invalid day";

        };
        System.out.println(day + " stands for " + dayOfWeek);
    }

    public static void pritnWeekDay(int day){
        String dayOfWeek = "Invalid day";
        if(day==0){
            dayOfWeek="sunday";
        }
        else if(day==1){
            dayOfWeek="Monday";
        }
        else if(day==2){
            dayOfWeek="Tuesday";
        }
        else if(day==3){
            dayOfWeek="Wednesday";
        }
        else if(day==4){
            dayOfWeek="Thursday";
        }
        else if(day==5){
            dayOfWeek="Friday";
        }
        else if(day==6){
            dayOfWeek="Satruday";
        }
        System.out.println(day + " stands for " + dayOfWeek);

    }
}

