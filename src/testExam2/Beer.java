package testExam2;

import java.util.ArrayList;

public class Beer {

    private String name;
    private int alcoholPercentage;
    private double price;

    public Beer(String name) {
        this.name = name;
    }

    public int setAlcoholPercentage(int alcoholPercentage) {
        try {
            if (alcoholPercentage < 0) {
                throw new Exception("Alkohol procent er under nul");
            } else if (alcoholPercentage > 100) {
                throw new Exception("Alkohol procent er over hundred");
            } else this.alcoholPercentage = alcoholPercentage;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return alcoholPercentage;
    }

    public double getPrice() {
        return price;
    }

    public double setPrice(double price) {
        try {
            if (price < 0) {
                throw new Exception("pris er under nul");
            }
            this.price = price;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return price;
    }

    public static void main(String[] args) {
        Beer beer1 = new Beer("Carlsberg");
        Beer beer2 = new Beer("Tuborg");
        Beer beer3 = new Beer("1664");
        Beer beer4 = new Beer("To øl");
        beer1.setAlcoholPercentage(50);
        beer1.setPrice(20.00);
        beer2.setPrice(10.00);
        beer3.setPrice(10.00);
        beer4.setPrice(20.00);

        ArrayList<Beer> beerlist = new ArrayList<>();
        beerlist.add(beer1);
        beerlist.add(beer2);
        beerlist.add(beer3);
        beerlist.add(beer4);

        double calculateTotal = 0;

        for (int i = 0; i < beerlist.size(); i++) {
            calculateTotal += beerlist.get(i).getPrice();
        }
        double beregnetGennemsnit = calculateTotal / beerlist.size();
        System.out.println(beregnetGennemsnit);


//        beer2.setAlcoholPercentage(104);
    }


}
