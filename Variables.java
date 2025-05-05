public class Variables {

    void showInterest() {

        double amount;

        double interest;
//percentage

        amount = 1200.00;

        System.out.println("amount: " + amount);

        interest = 3.0;

        amount = amount * (100 + interest) / 100;

        System.out.println("after a year: " + amount);

        amount = amount * (100 + interest) / 100;

        System.out.println("after 2 years: " + amount);
    }

        public static void main (String[] args){

            new Variables().showInterest();
        }
    }

