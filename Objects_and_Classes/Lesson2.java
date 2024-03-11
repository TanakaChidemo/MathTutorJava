public class Lesson2 {

    public static int multBy7(int a){
        int ans = a * 7;
        return ans;
     }
     public static void main(String[] args) {
        int num1 = 11;
        double num2 = 11;
        int answer;
        answer = multBy7(num1);
        System.out.println("The result is " + answer);
        if(numsAreEqual(num1, num2)){
            System.out.println("The numbers are equal");
        } else {
            System.out.println("The numbers are not equal");
        }
     }
     
     public static boolean numsAreEqual(int x, double y){
        if(x == y){
            return true;
        } else {
            return false;
        }
     }
}