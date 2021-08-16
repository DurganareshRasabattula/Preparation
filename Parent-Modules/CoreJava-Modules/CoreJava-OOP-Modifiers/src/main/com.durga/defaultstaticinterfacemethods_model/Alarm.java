package defaultstaticinterfacemethods_model;

/**
 * @author durga on 8/12/2021
 */
public interface Alarm {
    default String turnAlarmOn() {
        return "Turning the alarm on.";
    }

    default String turnAlarmOff() {
        return "Turning the alarm off.";
    }
}
