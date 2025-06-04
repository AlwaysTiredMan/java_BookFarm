import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        class User {
            String id, pw;
        }
        class Book {
            String title, author, sellerId;
            int price;
        }

        Scanner sc = new Scanner(System.in);
        ArrayList<User> ArrUser = new ArrayList<>();
        ArrayList<Book> ArrBook = new ArrayList<>();
        User LoginUser = null;

        while (true) {
            if (LoginUser == null) {
                System.out.println("\n1. 회원가입 2. 로그인 0. 종료");
                int sel = sc.nextInt();
                sc.nextLine();
                if (sel == 1) {
                    System.out.print("아이디: ");
                    String id = sc.nextLine();
                    System.out.print("비밀번호: ");
                    String pw = sc.nextLine();
                    User u = new User();
                    u.id = id;
                    u.pw = pw;
                    ArrUser.add(u);
                    System.out.println("회원가입 완료!");
                } else if (sel == 2) {
                    System.out.print("아이디: ");
                    String id = sc.nextLine();
                    System.out.print("비밀번호: ");
                    String pw = sc.nextLine();
                    boolean test = false;
                    for (User u : ArrUser) {
                        if ((u.id.equals(id) && u.pw.equals(pw))) {
                            LoginUser = u;
                            test = true;
                            break;
                        }
                    }
                    if (test) System.out.println("로그인 성공!");
                    else System.out.println("로그인 실패!");

                } else if (sel == 0) {
                    System.out.println("프로그램 종료");
                    break;
                }
            }
        }
    }
}