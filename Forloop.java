public class Forloop {
    public static void main(String[] args) {
        for (int i=0; i<=5; i++)
        {
            System.out.println(i);
        }
        System.out.println("........................");

        for (int i=0; i<=10; i=i+2)
        {
            System.out.println(i);
        }
        System.out.println("........................");

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        System.out.println("........................");

        for (int i=10; i>=1; i--)
        {
            System.out.println(i);
        }

        System.out.println("........................");


        for (int i=0; i<=6; i++)
        {
            for (int j=0; j<i; j++)
            {
                //System.out.print("*");
                System.out.printf("*");
            }
            System.out.println();
        }
        System.out.println("........................");

        for (int i=0; i<=10; i+=2)
        {
            for (int j=0; j<i; j++)
        {
            //System.out.print("*");
            System.out.printf("*");
        }
        System.out.println();
      }
    }
}
