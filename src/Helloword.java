import java.util.Scanner;

public class Helloword {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        System.out.println("informe o nome da mulher  mais gostosa do mundo ");
        String name = scann.nextLine();
        System.out.println("informe a idade dela ");
    
        int age = scann.nextInt();
        System.out.println( "Nome dela" + name + "e a idade " + age + "anos");
        scann.close();


        
    }
    
}
