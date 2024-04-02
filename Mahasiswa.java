public class Mahasiswa<T, U, V> {
    private T nim;
    private U name;
    private V classNumber;

    public void setNim(T nim) {
        this.nim = nim;
    }

    public void setName(U name) {
        this.name = name;
    }

    public void setClass(V classNumber) {
        this.classNumber = classNumber;
    }

    public T getNim() {
        return nim;
    }

    public U getName() {
        return name;
    }

    public V getClassNumber() {
        return classNumber;
    }
}