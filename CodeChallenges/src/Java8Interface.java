public interface Java8Interface {

    // regular abstract method java7 or lower, just signature no body
    void method1(String str);

    //default method with body definition, can be overriding
    default void Simplelog(String str){
        System.out.println("Simple login::"+str);
    }

    //static method, ready to use, is not possible to override
    static boolean isNull(String str) {
        System.out.println("Interface Null Check");
        return str == null ? true : "".equals(str) ? true : false;
    }

}
