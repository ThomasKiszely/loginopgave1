import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] user;
        user = new String[] {"admin", "Thomas", "Emma", "Mark"};
        String[] pass;
        pass = new String[]{"admin", "fetaost", "phoebe", "John"};

        for (int i = 0; i < 4; i++) {
            if (i > 0 && i < 3) {
                System.out.println("Try again") ;
            }
            else if (i == 3) {
                System.out.println("Goodbye") ;
                break ;
            }

            System.out.println("Please enter username");
            String userName = input.nextLine();
            System.out.println("Please enter password");
            String passWord = input.nextLine();

            int u = checkUserName(user, userName);
            int p = checkPassWord(pass, passWord);

            //System.out.println(u);
            //System.out.println(p);

            if (u == p) {
                long[] ans = welcome() ;
                if (ans[0] < 10) {
                    System.out.println("Welcome to SecureServer - the most secure in serving. Time is now " + ans[1] + ":0" + ans[0]) ;
                } else {
                    System.out.println("Welcome to SecureServer - the most secure in serving. Time is now " + ans[1] + ":" + ans[0]) ;
                } break;
            } else {
                System.out.println("Wrong username or password") ;

            }
        }
    }

    public static int checkUserName(String[] list, String key) {
        for (int i = 0 ; i < list.length ; i++) {
            if (key.equals(list[i])) {
                //System.out.println("Welcome no " + i);
                return i;
            }
        }
        return -1 ;

    }

    public static int checkPassWord(String[] pass, String passWord) {
        for (int i = 0 ; i < pass.length ; i++) {
            if (passWord.equals(pass[i])) {
                return i;
            }
        }
        return -2 ;
    }
    public static long[] welcome() {
        long[] ans = new long[2] ;
        long totalMilliseconds = System.currentTimeMillis() ;
        long totalSeconds = totalMilliseconds / 1000 ;
        long totalMinutes = totalSeconds / 60 ;
        long currentMinutes = totalMinutes % 60 ;
        long totalHours = totalMinutes / 60 ;
        ans[1] = (totalHours % 24) + 2 ;

        ans[0] = currentMinutes ;

        return ans ;
    }
}