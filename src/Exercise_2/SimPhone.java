package Exercise_2;

public class SimPhone {
    String numberPhone;
    double credit;
    Chiamata[] ultimeChiamate;
    int callCounter;

    public SimPhone(String numberPhone) {
        this.numberPhone = numberPhone;
        this.credit = 0.0;
        this.ultimeChiamate = new Chiamata[5];
        this.callCounter = 0;

    }
}
