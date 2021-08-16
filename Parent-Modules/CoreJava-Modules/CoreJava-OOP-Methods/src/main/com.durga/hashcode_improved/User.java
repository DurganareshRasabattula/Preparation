package hashcode_improved;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author durga on 8/12/2021
 */
public class User {
    private final Logger logger = LoggerFactory.getLogger(User.class);
    private long id;
    private String name;
    private String email;

    public User(long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (this.getClass() != o.getClass())
            return false;
        User user = (User) o;
        return id == user.id && (name.equals(user.name) && email.equals(user.email));
    }

    @Override
    public int hashCode() {
        return (int) id * name.hashCode() * email.hashCode();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
