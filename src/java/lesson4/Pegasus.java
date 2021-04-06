package lesson4;

public class Pegasus extends Hourse {
    private double wingsQuantity;

    public Pegasus(double wingsQuantity, int legsQuantity) {
        this.wingsQuantity = wingsQuantity;
        this.legsQuantity1 = legsQuantity;
    }

    public void fly(){
        System.out.println("I can fly");
    }

    public String getColor(){
        return super.color;
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }

    @Override
    public String toString() {
        return "Pegasus{" +
                "wingsQuantity=" + wingsQuantity +
                ", legsQuantity1=" + legsQuantity1 +
                ", color='" + color + '\'' +
                ", height=" + height +
                '}';
    }
}
