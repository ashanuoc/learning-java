class Books {
    String title;

    void display(){
        System.out.println("Book title " + title);
    }
        }

public class ForEachLoopExercise {
    public static void main(String[] args) {
        Books[] books = new Books[] {new Books(), new Books()};

        books[0].title = "Game of Thrones";
        books[1].title = "The Hobbit";

        for (Books book : books) {
            book.display();
        }

//        int[] arr = new  int[5];
//        arr[0] = 20;
//        arr[1] = 43;
//        arr[2] = 7;
//        arr[3] = 12;
//        arr[4] = 587;
//
//        for (int i: arr){
//            if (i % 2 ==0){
//                System.out.println(i);
//            }
//        }

//        char[] charArr = new char[] {'a', 's', 'd', 'a', 'e', 'a'};
//
//        int count = 0;
//
//        for (char c: charArr){
//            if (c == 'a'){
//                count++;
//            }
//        }
//        System.out.println("Count = " + count);


//        int [] arr = {1, 5, 20,60};
//        int sum = 0;
//
//        for (int i: arr){
//            sum += i;
//        }
//        System.out.println("Sum = " + sum);
    }
}
