package Problem_Solving;
import java.util.Scanner;

public class George_and_Accommodation_prob16 {
    // here we have a hotel to show which room can be re allocated by persons
    // inputs     2 rooms
    // 1st room =    1 person     2 cap    count
    // 2nd room =    3 person     3 cap    not count
    // output      1
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter rooms numbers");
        int room = sc.nextInt();
        int count = 0;
        // we make this loop to take no of inputs equal to no of rooms the user had entered it
        for (int lines_room = 1; lines_room <= room; lines_room++){
            System.out.println("Enter the no of persons in each room");
            int person_no = sc.nextInt();
            System.out.println("Enter the capacity for each room");
            int room_cap = sc.nextInt();
            if (person_no < room_cap){
                count++;
            }
            // to show the count in each iteration
            System.out.println(count);
        }
        System.out.println("the result is  =  " + count);
    }
}
