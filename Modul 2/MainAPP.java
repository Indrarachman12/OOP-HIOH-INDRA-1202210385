public class MainAPP {
    public static void main(String[] args) {
        // Deklarasi
        Perangkat perangkat1 = new Perangkat("Adata",4,(float)1.90);
        Laptop laptop1 = new Laptop("Seagate", 8, (float)3.60, false);
        Handphone handphone1 = new Handphone("Vgen",12,(float)4.60,false);

        perangkat1.informasi();
        System.out.println();
        laptop1.informasi();
        laptop1.bukaGame("E football 2023");
        laptop1.kirimEmail("indra@student.telkomuniversity.com");
        laptop1.kirimEmail("indra@gmail.com","indra@student.telkomuniversity.com");

        System.out.println();
        handphone1.informasi();
        handphone1.telfon(62884556);
        handphone1.kirimSMS(62884556, 62844444);
    }
}
