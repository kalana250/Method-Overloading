public class Host {

    String hosting(String x){
    return x;
    }

    int hosting(int x){
    return x;
    }

    double hosting(double x){
    return x;
    }
    public static void main(String[] args) {
    Host h=new Host();
        System.out.println( h.hosting(100)); // uda method eka return wenawanm print eka danne argument ekath ekka
        System.out.println(h.hosting(90.76));
        System.out.println(h.hosting("Hoster"));
    }
}
