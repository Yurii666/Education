package start;
//This package is for running in some methods, later used somewhere
public class MyClass {
    private Long id;
    private String name;

    public MyClass(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
@Override
    public boolean equals(Object obj){
    System.out.println("equals is called:" + this + " : " + obj);
        MyClass other =(MyClass) obj;
        return id.equals(other.id) && name.equals(other.name);
    }
    @Override
    public int hashCode(){
        System.out.println("HashCode is called: " + this );
        return id.intValue();
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
