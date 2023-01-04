public class passwordCrack {
    public static long cracker(long password){
        for (long i =0 ; ; i++  ){
            if (password == i){

                System.out.println("Hacked your password is bellow  ");
                return i ;
            }

        }

    }
    public static void main(String[] args) {

        long pass = 23453265543456789765434567898765456789765;
        System.out.println(cracker(pass));
        
    }
}
