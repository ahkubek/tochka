
    import java.util.*;
    public class Main {
        public static void main(String[] args) throws java.io.IOException {
            char ch;
            int space=0;
            Scanner sc = new Scanner(System.in);
            System.out.println("введите символ:");
            ch = (char) System.in.read();


            do {
                ch = (char) System.in.read();



                System.out.println(ch);
                if (ch==' '){
                    space++;
                }


            }while (ch != '.') ;
            System.out.println("количество пробелов "+space);


        }
    }
