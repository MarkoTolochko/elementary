package lesson7.badEx;

public class MobileClient {

    private  DataAccess dataAccess = new DataAccess();
    public void fetchData(){
        if (dataAccess.access()){
            System.out.println("Here is your data");
        }
    }
}
