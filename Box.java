package practice;

public class Box<T> {
    public T t;

    public T get(){
        return t;
    }

    public void setT(T t){
        this.t = t;
    }
}
