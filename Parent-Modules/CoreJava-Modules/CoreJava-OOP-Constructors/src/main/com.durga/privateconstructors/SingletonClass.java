package privateconstructors;

/**
 * @author durga on 8/11/2021
 */
public class SingletonClass {
    private static SingletonClass INSTANCE;
    private String info = "Initial info class";

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonClass();
        }

        return INSTANCE;
    }

    public static SingletonClass getINSTANCE() {
        return INSTANCE;
    }

    public static void setINSTANCE(SingletonClass iNSTANCE) {
        INSTANCE = iNSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
