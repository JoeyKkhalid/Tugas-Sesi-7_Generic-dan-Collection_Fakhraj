public class Main {
    public static void main(String[] args) {
        Mahasiswa<String, String, Integer> m = new Mahasiswa<>();
        m.setNim("20220040203");
        m.setName("Fakhraj");
        m.setClass(22);

        System.out.println(m.getNim());
        System.out.println(m.getName());
        System.out.println(m.getClassNumber());
    }
}