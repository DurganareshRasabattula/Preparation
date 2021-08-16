package hashcode_naive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author durga on 8/12/2021
 */
public class User {
    private final Logger logger = LoggerFactory.getLogger(User.class);
    private final long id;
    private final String name;
    private final String email;

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
        return 1;
    }
}
