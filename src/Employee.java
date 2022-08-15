public class Employee {
    String adSoyad;
    double maas;
    int calismaSaati;
    int baslangicYili;
    double tax;
    int fazladanCalisma;
    double bonusUcret;
    double toplamMaas;
    double maasArttir;
    double vergiVeBomusla;
    int suankiYil = 2021;

    Employee(String adSoyad,double maas,int calismaSaati,int baslangicYili){
        this.adSoyad = adSoyad;
        this.maas = maas;
        this.calismaSaati = calismaSaati;
        this.baslangicYili = baslangicYili;
    }

    public void tax(){
        if(this.maas<1000 && this.maas>0){
            this.tax = 0;
        }
        else if(this.maas>1000){
            this.tax = maas *0.03;
        }
        System.out.println("Vergi : "+this.tax);
    }
    public void bonus(){
        if(this.calismaSaati>40){
            this.fazladanCalisma = this.calismaSaati-40;
            this.bonusUcret = fazladanCalisma *30;
            System.out.println("Bonus : "+this.bonusUcret);
        }
    }
    public void maasArttir(){
        if(this.suankiYil-this.baslangicYili<10 && this.suankiYil-this.baslangicYili>0){
            this.maasArttir = this.maasArttir*0.05;
            System.out.println("Maas Artisi : "+this.maasArttir);
        }
        else if(this.suankiYil-this.baslangicYili>9 && this.suankiYil-this.baslangicYili<20){
            this.maasArttir = this.maasArttir*0.10;
            System.out.println("Maas Artisi : "+this.maasArttir);
        }
        else if(this.suankiYil-this.baslangicYili>19){
            this.maasArttir = this.maas*0.15;
            System.out.println("Maas Artisi : "+this.maasArttir);
        }
    }
    public void vergiveBonusla(){
        this.vergiVeBomusla = (this.maas+this.bonusUcret)-this.tax;
        System.out.println("Vergi ve bonuslarla birlikte maas : "+ this.vergiVeBomusla);
    }
    public void toplamMaas(){
        this.toplamMaas = (this.maas+this.bonusUcret+this.maasArttir)-this.tax;
        System.out.println("Toplam maas : "+this.toplamMaas);
    }
    public void toPrint(){
        System.out.println("Ad Soyad : "+this.adSoyad);
        System.out.println("Maasi : "+this.maas);
        System.out.println("calismaSaati : "+this.calismaSaati);
        System.out.println("Baslangic Yili : "+this.baslangicYili);
        tax();
        bonus();
        maasArttir();
        vergiveBonusla();
        toplamMaas();
    }
}
