package exercise6;

public class Car {

    private int weight;
    private Trailer trailer;
    private int totalWeight;
    private boolean carTooHeavy = false;


    public Car (int weight){
        this.weight = weight;
        totalWeight();
    }

    public Car (int weight, Trailer trailer){
        this.weight = weight;
        this.trailer = trailer;
        totalWeight();
    }

    private void totalWeight (){
        if (trailer != null){
        totalWeight = weight + trailer.getWeight();
    }
        else totalWeight = weight;

        if (totalWeight > 3500){
            carTooHeavy = true;
            System.out.println("Weight too heavy and trailer cannot be attached.");
        }
        else if (trailer == null){
            System.out.println("no trailer to be attached");
        }
        else System.out.println("Trailer has been attached");
    }

}
