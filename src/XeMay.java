public class XeMay extends Xe {
    String dongCo;

    public XeMay() {
    }

    public XeMay(String dongCo) {
        this.dongCo = dongCo;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "dongCo='" + dongCo + '\'' +
                ", mauSac='" + mauSac + '\'' +
                ", banhXe='" + banhXe + '\'' +
                '}';
    }
}

    public static void main(String[] args) {
        XeMay xeMay = new XeMay("343");
        System.out.println(XeMay);
    }
    }