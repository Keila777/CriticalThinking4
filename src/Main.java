import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
final int NUM_GRADES = 10;
double sum = 0;
double max = Double.MIN_VALUE;
double min = Double.MAX_VALUE;
System.out.println("Enter" + NUM_GRADES + "grades:");
for (int i = 1; i <=NUM_GRADES; i++) {
    System.out.println("Enter grade" + i + ": ");
    double grade = sc.nextDouble();
    sum = sum + grade;
    if (grade > max) {
        max = grade;
        if (grade < min) {
            min = grade;

        }
    }
double average = sum / NUM_GRADES;
    System.out.println("Average: " + average);
    System.out.println("Maximum: " + max);
    System.out.println("Minimum: " + min);
    }
    }
        {
    }
}