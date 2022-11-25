public class Human {

    String name;
    String surname;
    private double weight;
    private double height;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Human(String name, String surname, double weight, double height) {
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
    }

    public void imb(){
        double a;
        a= weight/(Math.pow(height,height));
        if(a < 16){
            System.out.println(" " + name + " "+ surname + " "+ "у вас наблюдается выраженный дефицит массы тела, истощение организма");
        }
        else if (16< a && a <= 19){
            System.out.println(" " + name + " "+ surname + " "+ "у вас масса тела недостаточна, имеется дефицит");
        }
        else if (19< a && a <=25){
            System.out.println(" " + name + " "+ surname + " "+ "у вас вес находится в пределах нормы");
        }
        else if (25 < a && a <= 30){
            System.out.println(" " + name + " "+ surname + " "+ "у вас имеется лишний вес, наблюдается стадия предожирения");
        }
        else if (30 < a && a <= 35){
            System.out.println(" " + name + " "+ surname + " "+ "у вас ожирение 1 типа");
        }
        else if (35 < a && a <= 40){
            System.out.println(" " + name + " "+ surname + " "+ "у вас ожирение 2 типа");
        }
        else if (a > 40){
            System.out.println(" " + name + " "+ surname + " "+ "у вас ожирение 3 типа");
        }
    }
}
