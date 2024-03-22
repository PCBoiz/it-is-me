package javacore

public interface Interface {
    // Trừu tượng: ẩn giấu bên trong chỉ hiển thị tên
    // Chỉ kế thừa đc Interface khác
    public String diBo();

    String diChoi();

    default String log(String str){
        return null;
    }


}
