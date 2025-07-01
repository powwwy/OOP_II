public class Array1 {

    public static void main(String[] args) {

        String[] orderIds = {"A124","A267","B345","C345","D123","E187","F378","B193", "C534", "A345", "A15", "B177"};



        for (String item : orderIds) {

            if (item.startsWith("A")) {

                System.out.println(item);

            }

        }

    }

}
