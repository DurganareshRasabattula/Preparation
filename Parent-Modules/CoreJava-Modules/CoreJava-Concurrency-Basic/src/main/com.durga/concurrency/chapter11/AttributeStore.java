package concurrency.chapter11;

import concurrency.annotation.CouldBeHappier;
import concurrency.annotation.GuardedBy;
import concurrency.annotation.ThreadSafe;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;



/**
 * 11-4 将一个锁不必要的持有过长时间
 */
@ThreadSafe
@CouldBeHappier
public class AttributeStore {

    @GuardedBy("this")
    private final Map<String, String> attributes = new HashMap<>();

    public synchronized boolean userLocationMatches(String name, String regexp) {
        String key = "users." + name + ".location";
        String location = attributes.get(key);
        if (location == null) {
            return false;
        }
        return Pattern.matches(regexp, location);
    }
}
