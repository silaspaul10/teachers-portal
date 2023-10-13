package k22ug;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FInal_project {

    public static void main(String[] args) {

        //Initial details..
        String[] userName = {"Teacher 1", "Teacher 2"};
        String[] passwordKey = {"111", "222"};

        //Declaration of variables ..
        int desireOption = 0;
        int choiceMarks = 0;
        int choiceAttend = 0;
        int choiceMarksView = 0;
        int choiceAttendView = 0;
        int tries = 0;

        while (true) {

            //login console...
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Username: ");
            String email = input.nextLine().trim();
            System.out.print("Enter Password Key: ");
            String password = input.next();
            if ((email.equals(userName[0])) && (password.equals(passwordKey[0]))) {
                String[] studentNames = {"Student 1  ", "Student 2", "Student 3", "Student 4  ", "Student 5  ", "Student 6  "};
                do {
                    System.out.println("**PROGRAMMING FUNDAMENTAL TEACHER PORTAL**");
                    System.out.println("Welcome Teacher 1!");
                    System.out.println("Enter number to perform corresponding opeartion");
                    System.out.println("1: Insert marks");
                    System.out.println("2: Insert attendance");
                    System.out.println("3: View marks");
                    System.out.println("4: View attendance");
                    System.out.println("5: To log out");

                    desireOption = input.nextInt();

                    switch (desireOption) {
                        case 1:
                            do {
                                //To insert marks respectivley..

                                System.out.println("* Insert Marks **");
                                System.out.println("1: Enter Quiz 1 marks.");
                                System.out.println("2: Enter Quiz 2 marks.");
                                System.out.println("3: Enter Mid marks.");
                                System.out.println("4: Enter Terminal marks.");
                                System.out.println("5: Exit.");
                                System.out.println("Select respective choice: ");
                                choiceMarks = input.nextInt();

                                switch (choiceMarks) {
                                    case 1:
                                        //to write Quiz-1 marks..
                                        String fileName = "pfQuiz_1.txt";
                                        String type = "Quizzes:";
                                        String marksTotal = "   20        ";
                                        int marks[] = new int[studentNames.length];
                                        initializerQuiz(marks);
                                        fileWriterMarks(fileName, type, marksTotal, marks);
                                        break;

                                    case 2:
                                        //to write Quiz-2 marks..
                                        fileName = "pfQuiz_2.txt";
                                        type = "Quizzes:";
                                        marksTotal = "   20        ";
                                        marks = new int[studentNames.length];
                                        initializerQuiz(marks);
                                        fileWriterMarks(fileName, type, marksTotal, marks);

                                        break;
                                    case 3:
                                        //to write Mids marks..
                                        fileName = "pfMid.txt";
                                        type = "Mids:";
                                        marksTotal = "   30        ";
                                        marks = new int[studentNames.length];
                                        initializerMid(marks);
                                        fileWriterMarks(fileName, type, marksTotal, marks);
                                        break;

