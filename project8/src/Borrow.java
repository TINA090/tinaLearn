import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Borrow{

    List<String> bookList = Arrays.asList(new String[]{"巴黎圣母院","雷雨","百年孤独"});

    public static void main(String[] args) {
        Borrow b = new Borrow();
        b.showTip1();
    }

    public void showTip1() {
        System.out.println("请选择：1按书籍名查找 or 2按书籍序号查找");
        try {
            int option = new Scanner(System.in).nextInt();
            if (option == 1) {
                this.findByBookName();
            } else if (option == 2){
                this.findByBookIndex();
            } else {
                throw new NumberExceedException();
            }
        } catch (BookNoExistsException e) {
            System.out.println("没有这本书");
            this.showTip1();
        } catch (IndexExceedException e) {
            System.out.println("序号超出");
            this.showTip1();
        } catch (NumberExceedException e) {
            System.out.println("请输入1或2");
            this.showTip1();
        }  catch (InputMismatchException e) {
            System.out.println("请输入数字");
            this.showTip1();
        }

    }

    private void findByBookIndex() {
        System.out.println("请输入书籍序号");
        int bookIndex = new Scanner(System.in).nextInt();
        if(bookIndex < 0 || bookIndex > bookList.size()) {
            throw new IndexExceedException();
        } else {
            System.out.println("查找成功");
        }
    }

    private void findByBookName() {
        System.out.println("请输入书籍名称");
        String bookName = new Scanner(System.in).nextLine();
        if (bookList.contains(bookName)) {
            System.out.println("查找成功");
        } else {
            throw new BookNoExistsException();
        }
    }

}

class BookNoExistsException extends RuntimeException {

}
class IndexExceedException extends RuntimeException {

}
class NumberExceedException extends RuntimeException {

}
