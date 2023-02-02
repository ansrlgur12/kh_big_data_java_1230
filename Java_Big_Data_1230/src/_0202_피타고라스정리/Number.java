package _0202_피타고라스정리;

public class Number {
    int a;
    int b;
    int c;

    public Number(int a, int b, int c) {
        if (a < b) {
            if (a < c) {
                if (b < c) {
                    this.a = a;
                    this.b = b;
                    this.c = c;
                } else {
                    this.a = a;
                    this.b = c;
                    this.c = b;
                }
            } else {
                this.a = c;
                this.b = a;
                this.c = b;
            }
        } else {
            if (b < c) {
                if (a < c) {
                    this.a = b;
                    this.b = a;
                    this.c = c;
                } else {
                    this.a = b;
                    this.b = c;
                    this.c = a;
                }
            } else {
                this.a = c;
                this.b = b;
                this.c = a;
            }
        }
    }
}
