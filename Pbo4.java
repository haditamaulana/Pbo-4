
class BangunDatar {
}

class Segitiga extends BangunDatar {
    double alas;
    double tinggi;
    double sisi;

    Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    double luas() {
        double s = (this.alas + this.tinggi + this.sisi) / 2;
        return Math.sqrt(s * (s - this.alas) * (s - this.tinggi) * (s - this.sisi));
    }
}

class SegitigaSikuSiku extends Segitiga {
    SegitigaSikuSiku(double alas, double tinggi) {
        super(alas, tinggi);
        this.sisi = Math.sqrt(alas * alas + tinggi * tinggi);
    }
}

class SegitigaSamaKaki extends Segitiga {
    SegitigaSamaKaki(double alas, double tinggi) {
        super(alas, tinggi);
        this.sisi = Math.sqrt((alas / 2) * (alas / 2) + tinggi * tinggi);
    }
}

class SegitigaSamaSisi extends Segitiga {
    SegitigaSamaSisi(double sisi) {
        super(sisi, sisi);
        this.sisi = sisi;
    }
}

class SegitigaSembarang extends Segitiga {
    SegitigaSembarang(double alas, double tinggi, double sisi) {
        super(alas, tinggi);
        this.sisi = sisi;
    }
}

class Persegi extends BangunDatar {
    double sisi;

    Persegi(double sisi) {
        this.sisi = sisi;
    }

    double luas() {
        return this.sisi * this.sisi;
    }
}

class Lingkaran extends BangunDatar {
    double jariJari;

    Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    double luas() {
        return Math.PI * this.jariJari * this.jariJari;
    }
}

public class Pbo4 {
    public static void main(String[] args) {
        // Membuat instance Bangun Datar
        SegitigaSikuSiku segitigaSiku = new SegitigaSikuSiku(3, 4);
        SegitigaSamaKaki segitigaSamaKaki = new SegitigaSamaKaki(4, 4);
        SegitigaSamaSisi segitigaSamaSisi = new SegitigaSamaSisi(5);
        SegitigaSembarang segitigaSembarang = new SegitigaSembarang(6, 7, 8);

        Persegi persegi = new Persegi(5);
        Lingkaran lingkaran = new Lingkaran(7);

        // Menghitung luas
        System.out.println("Luas Segitiga Siku-Siku: " + segitigaSiku.luas());
        System.out.println("Luas Segitiga Sama Kaki: " + segitigaSamaKaki.luas());
        System.out.println("Luas Segitiga Sama Sisi: " + segitigaSamaSisi.luas());
        System.out.println("Luas Segitiga Sembarang: " + segitigaSembarang.luas());
        System.out.println("Luas Persegi: " + persegi.luas());
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
    }
}

