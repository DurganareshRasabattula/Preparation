package thiskeyword;

/**
 * @author durga on 8/12/2021
 */
public class Keyword {
    private final String name;
    private final int age;

    public Keyword() {
        this("John", 27);
        this.printMessage();
        printInstance(this);
    }

    public Keyword(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printMessage() {
        System.out.println("invoked by this");
    }

    public void printInstance(Keyword thisKeyword) {
        System.out.println(thisKeyword);
    }

    public Keyword getCurrentInstance() {
        return this;
    }

    class ThisInnerClass {

        boolean isInnerClass = true;

        public ThisInnerClass() {
            Keyword thisKeyword = Keyword.this;
            String outerString = Keyword.this.name;
            System.out.println(this.isInnerClass);
        }
    }

    @Override
    public String toString() {
        return "KeywordTest{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
