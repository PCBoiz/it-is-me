package javacore

public class Implement implements javacore.Interface {

    @Override
    public String diBo() {
        System.out.println("test");
        return null;
    }
        @Override
    public String diChoi() {
            System.out.println("test");
            return null;
        }

        @Override
    public String log(String str) {
            return javacore.Interface.super.log(str);
        }
}
