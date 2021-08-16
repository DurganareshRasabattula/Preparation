package inheritance;

/**
 * @author durga on 8/11/2021
 */
public interface SpaceTraveller extends Flyable,Floatable{
    int duration = 10;
    void remoteControl();
}
