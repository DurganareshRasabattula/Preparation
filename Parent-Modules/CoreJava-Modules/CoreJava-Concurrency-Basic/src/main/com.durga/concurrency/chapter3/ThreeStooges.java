package concurrency.chapter3;

import concurrency.annotation.Immutable;

import java.util.HashSet;
import java.util.Set;



/**
 * 3-11 在可变对象的基础上构建的不可变类
 */
@Immutable
public class ThreeStooges {

    private final Set<String> stooges = new HashSet<>();
    
    public ThreeStooges() {
	stooges.add("cat");
	stooges.add("dog");
	stooges.add("pig");
    }
    
    public boolean isStooges(String name) {
	return stooges.contains(name);
    }
}
