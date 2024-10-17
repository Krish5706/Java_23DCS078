class Degree {
    void getDegree() {
        System.out.println("I got a degree");
    }
}

class Undergraduate extends Degree {
    @Override
    void getDegree() {
        System.out.println("I am an Undergraduate");
    }
}

class Postgraduate extends Degree {
    @Override
    void getDegree() {
        System.out.println("I am a Postgraduate");
    }
}

public class P21 {
    public static void main(String[] args) {
        Degree degree = new Degree();
        degree.getDegree(); 

        Undergraduate undergraduate = new Undergraduate();
        undergraduate.getDegree();  

        Postgraduate postgraduate = new Postgraduate();
        postgraduate.getDegree();  
        System.out.println("ID :23DCS078_KRISH PATEL");
    }
}