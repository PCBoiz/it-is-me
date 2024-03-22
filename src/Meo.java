public class Meo extends DongVat {
    String tapTinh;


    public Meo(String tapTinh) {
        this.tapTinh = tapTinh;
    }

    @Override
    public String toString() {
        return "Meo{" +
                "tapTinh='" + tapTinh + '\'' +
                ", chan='" + chan + '\'' +
                ", mat='" + mat + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Meo Meo = new Meo("San moi");
        System.out.println(Meo);
    }
}
