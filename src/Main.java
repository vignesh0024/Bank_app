public class Main {
    public static void main(String[] args) {
         System.out.println("My first intellij");
         RBIInterface RBImain;

         RBImain = new YesBank(0000,"Good");
         String result = RBImain.depositmoney(0000,"Good",2000);
        System.out.println(result);
    }
}