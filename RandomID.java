import java.util.Random;



public class RandomID {

    public static void main(String[] args) {

        Random rand = new Random();

        String[] orderIDs = new String[10];



        for (int i = 0; i < orderIDs.length; i++) {

            char prefix = (char)(rand.nextInt(5) + 'A');



            int number = rand.nextInt(999) + 1;

            String suffix = String.format("%03d", number);



            orderIDs[i] = prefix + suffix;

        }



        for (String orderID : orderIDs) {

            System.out.println(orderID);

        }

    }

}
