
    import java.util.*;
    public class Main {
        public static void main(String[] args) throws java.io.IOException {
            char ch;
            Scanner sc = new Scanner(System.in);
            System.out.println("введите символ:");
            ch = (char) System.in.read();


            do {
                ch = (char) System.in.read();



                System.out.println(ch);


            }while (ch != '.') ;
            if (ch==' ')
            System.out.println(" пробелов "+ch);
        }
    }
