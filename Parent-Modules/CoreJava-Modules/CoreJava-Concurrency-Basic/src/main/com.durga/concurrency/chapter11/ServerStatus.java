package concurrency.chapter11;

import concurrency.annotation.GuardedBy;
import concurrency.annotation.ThreadSafe;

import java.util.Set;



/**
 * 11-6 对锁进行分解
 */
@ThreadSafe
public class ServerStatus {

    @GuardedBy("this")
    private final Set<String> users;

    @GuardedBy("this")
    private final Set<String> queries;

    public ServerStatus(Set<String> users, Set<String> queries) {
        this.users = users;
        this.queries = queries;
    }

    public synchronized void addUser(String u) {
        users.add(u);
    }

    public synchronized void addQuery(String q) {
        queries.add(q);
    }

    public synchronized void removeUser(String u) {
        users.remove(u);
    }

    public synchronized void removeQuery(String q) {
        queries.remove(q);
    }
}
