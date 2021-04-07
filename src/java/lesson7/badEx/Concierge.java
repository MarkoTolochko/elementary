package lesson7.badEx;

public class Concierge {
    private String personality;

    public Concierge(String personality) {
        this.personality = personality;
    }

    public void greet(){
        if (personality.equals("ceo")){
            System.out.println("Goof day, sir");
        }
        else if (personality.equals("friend")){
            System.out.println("Hi");
        }
        else if (personality.equals("family")){
            System.out.println("how are you darling");
        }
    }
}
class ConciergeApp{
    public static void main(String[] args) {
        Concierge concierge = new Concierge("ceo");
        concierge.greet();
    }
}

