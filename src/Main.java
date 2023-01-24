import java.util.*;

public class Main {
    public static void main(String[] args) {

                // creating a scanner object
        Scanner scanner = new Scanner(System.in);

                // Declaring a new ArrayList
        HashMap<String, String> info = new HashMap<>();

                // setting a condition for the loop
        boolean process = true;

        while (process){
            System.out.println("'c' to Create, 'r' to Read, 'u' to Update, 'd' to Delete or press 'q' to quit");

                    // takes input from the keyboard
            String register = scanner.nextLine();

                    // If input is 'q' it breaks, to compare strings I have used .equals()
            if (register.equals("q")) process = false;

                    // checking the conditions using switch
            switch (register) {
                case "c" -> {
                    System.out.println("Add a name: ");
                    String addName = scanner.nextLine();
                    System.out.println("Add a phone: ");
                    String addPhone = scanner.nextLine();
                    info.put(addName, addPhone);
                }
                case "r" -> {
                    System.out.println("Enter a name: ");
                    String search = scanner.nextLine();
                    String searchGet = info.get(search);
                    System.out.println(searchGet);
                }
                case "u" -> {
                    System.out.println("Update info for: ");
                    String updateName = scanner.nextLine();
                    System.out.println("Update phone to: ");
                    String updatePhone = scanner.nextLine();
                    info.replace(updateName, updatePhone);
                }
                case "d" -> {
                    System.out.println("Remove a contact: ");
                    String removeName = scanner.nextLine();
                    info.remove(removeName);
                }
                default -> process = false;
            }
        }
                // checking the size of a Hashmap using .size()
        System.out.println("We have " + info.size() +  (info.size() == 1 ? " name!" : " names!"));

                // Hashmaps are unordered
                // You can sort an ArrayList using Collections.sort()
                // Collections.sort(info);

                // printing out the list
//        System.out.println(info);

                // Or loop through using foreach
        for (String i : info.keySet()){
            System.out.println("Name: "+i+" - Phone: "+info.get(i));
        }

                // making sure to close the scanner
        scanner.close();
    }

}
