import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        class User {
            String id, pw;
        }
        class Book {
            String title, author;
            int price;

        }
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();
        User currentUser = null;

        while (true) {

            if (currentUser == null) {
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
                    users.add(u);
                    System.out.println("회원가입 완료!");
                } else if (sel == 2) {
                    System.out.print("아이디: ");
                    String id = sc.nextLine();
                    System.out.print("비밀번호: ");
                    String pw = sc.nextLine();
                    boolean found = false;
                    for (User u : users) {
                        if (u.id.equals(id) && u.pw.equals(pw)) {
                            currentUser = u;
                            found = true;
                            break;
                        }
                    }
                    if (found) System.out.println("로그인 성공!");
                    else System.out.println("로그인 실패!");
                } else if (sel == 0) {
                    System.out.println("프로그램 종료");
                    break;
                }
            } else {
                System.out.println("\n1. 교재 등록 2. 교재 목록 보기 3. 로그아웃");
                int sel = sc.nextInt();
                sc.nextLine();
                if (sel == 1) {
                    Book b = new Book();
                    System.out.print("책 제목: ");
                    b.title = sc.nextLine();
                    System.out.print("저자: ");
                    b.author = sc.nextLine();
                    System.out.print("가격: ");
                    b.price = sc.nextInt();
                }
            }
        }
    }
}

