////package lesson_11.homework_02;
////
////import lesson_11.scanner.UserInput;
////
////public class NumbersInBlock {
////    public static void main(String[] args) {
////
////        UserInput userInput= new UserInput();
////
////        int userInt = userInput.inputInteger("Please enter integer number:");
////
////        boolean isSimple = true;
////
////        int delitel = 1;
////
////        for (int i = 2; i < (userInt / 2) ; i++) {
////            if (userInt % i == 0){
////                isSimple = false;
////                delitel = i;
////                break;
////
////            }
////        }
////
////        if (isSimple) {
////            System.out.println("Number" + userInt + "is simple.");
////        } else  {
////            System.out.println("Number" + userInt +" is not simple.");
////            System.out.println("First divisor =" + delitel);
////        }
//    }
//}
