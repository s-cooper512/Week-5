public class Main {
    public static void main(String[] args) {
        //Question 1
        int num1 = 0;

        if (num1 > 0) {
            System.out.println("Positive");
        } else if (num1 < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        //Question 2
        for (int i = 1; i <= 100; i ++) {
            if (i % 2 == 0 && i % 3 != 0) {
                System.out.println("Smeagol");
            } else if (i % 2 != 0 && i % 3 == 0) {
                System.out.println("Gandalf");
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("LOTR");
            } else {
                System.out.println(i);
            }
        }

        //Question 3
        int j = 0;
        int total = 0;

        while (j <= 10) {
            total += j;
            j++;
        }
        System.out.println(total);

        //Question 4
        int evenNums = 0;

        do {
            if (evenNums % 2 == 0) {
                System.out.println(evenNums);
            }
            evenNums++;
        } while (evenNums <= 100);

        //Question 5
        int month = 10;

        switch (month) {
            case 1:
                System.out.println("January");
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("February");
                System.out.println("Winter");
                break;
            case 3:
                System.out.println("March");
                System.out.println("Spring");
                break;
            case 4:
                System.out.println("April");
                System.out.println("Spring");
                break;
            case 5:
                System.out.println("May");
                System.out.println("Spring");
                break;
            case 6:
                System.out.println("June");
                System.out.println("Summer");
                break;
            case 7:
                System.out.println("July");
                System.out.println("Summer");
                break;
            case 8:
                System.out.println("August");
                System.out.println("Summer");
                break;
            case 9:
                System.out.println("September");
                System.out.println("Autumn");
                break;
            case 10:
                System.out.println("October");
                System.out.println("Autumn");
                break;
            case 11:
                System.out.println("November");
                System.out.println("Autumn");
                break;
            case 12:
                System.out.println("December");
                System.out.println("Winter");
                break;
        }
    }
}