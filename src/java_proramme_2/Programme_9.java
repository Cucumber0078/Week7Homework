package java_proramme_2;



import java.util.Scanner;


    public class Programme_9 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the uppercase string : ");
            String uppercase = scanner.nextLine();
            Programme_9 t = new Programme_9();
            t.convertUppercaseToLowerCase(uppercase);

            scanner.close();
        }


        public void convertUppercaseToLowerCase(String text) {
            System.out.println("The Lowercase value is = " + text.toLowerCase());
        }

    }


