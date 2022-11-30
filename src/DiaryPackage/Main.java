package DiaryPackage;

import java.util.Scanner;

public class Main {
    private static Diary diary;
    private static Scanner keyboardInput = new Scanner(System.in);

    public static void main(String[] args) {

        begin();
        displayDiaryMenu();
    }

    private static void begin() {
        String mainMain = """
                Welcome to My Diary!!!
                Let's set it up
                """;
        print(mainMain);
        String userName = input("Enter your name: ");
        String password = input("Enter your password: ");
        Diary diary = new Diary(userName, password);
        print("Diary create for"+ userName);
    }

    private static void displayDiaryMenu() {
        String mainMain = """
                Press:
                1 --> Unlock Diary
                2 --> Lock Diary
                3 --> exit
                """;
        String userInput = input(mainMain);
        switch (Integer.parseInt(userInput)){
            case 1-> unlockDiary();
            case 2-> lockDiary();
            case 3-> exitApplication();
            default -> {
                System.out.println("Enter a valid number");
                displayDiaryMenu();
            }
        }
    }

    private static void exitApplication() {
        print("Thanks for using our application");
        System.exit(0);
    }

    private static void lockDiary() {
        diary.lock();
        print("Diary has been locked");
        displayDiaryMenu();
    }

    private static void unlockDiary() {
        String password = input("Enter correct password");
        diary.unlockWith(password);
        if (diary.isLocked()) {
            print("Wrong Password");
            displayDiaryMenu();
        }
        else displayUnlockDiaryMenu();
    }

    private static void displayUnlockDiaryMenu() {
        String diaryMenu = """
                Press 1 --> Create Entry
                Press 2 --> Find Entry By Id
                Press 3 --> get total of entries
                Press 4 --> lock diary
                """;
        String userInput = input(diaryMenu + "Select an option");
        switch (Integer.parseInt(userInput)){
            case 1 -> unlockDiary();
            case 2 ->lockDiary();
            case 3 -> getTotalNumberOfEntries();
            case 4 -> exitApplication();
            default -> {
                print("Enter a valid number.");
                displayUnlockDiaryMenu();
            }
        }
    }

    public static void getTotalNumberOfEntries() {
        int totalNumberOfEntries = diary.numberOfEntries();
        print("The total number of entries is"+ totalNumberOfEntries);
        displayUnlockDiaryMenu();
    }

    private static String input(String prompt) {
        print(prompt);
        System.exit(0);
        return keyboardInput.nextLine();
    }

    private static void print(String prompt) {
        System.out.println(prompt);
    }

    private static void findById() {
        String id = input ("Enter the id for the entry you want to find");
        Entry foundEntry = diary.findEntryWithId(Integer.parseInt(id));
        print(foundEntry.toString());
        displayDiaryMenu();
    }

    private static void createEntry(){
        String title = input("Enter title of the entry");
        String message = input("Enter the message for the entry");
        diary.write(title,message);
        print("Written successfully");
        displayUnlockDiaryMenu();

    }

}
