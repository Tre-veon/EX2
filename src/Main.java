public class Main {
    public static void main(String[] args) {
        //Treveon Aponte
        //Lab 2
        String[] days = {"Sunday", "Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int[] tempHigh = {45, 29, 10, 22, 41, 28,33};
        int[] precipitation = { 95, 60, 25, 5, 0 , 75 ,90};


        for (int i = 0; i < days.length; i++) {
            if (tempHigh[i] <=32&&precipitation[i] >50) {
                System.out.println(days[i]);
            }

        }
    }
}
