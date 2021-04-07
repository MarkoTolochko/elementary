package lesson7.dependencyInversion;

public class MobileClient implements MobileDataAccessable {
    @Override
    public void fetchData() {

    }

    @Override
    public boolean isCallNow() {
        return false;
    }
}
