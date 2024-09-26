public class methodOverl {
   public static void city(){
        System.out.println("I am living in indore");
    }
    public static void city(String nameOfCity ){
        System.out.println(nameOfCity);
    }
    public static void main(String[] args) {
        city();
        city("Gwalior");
}
}