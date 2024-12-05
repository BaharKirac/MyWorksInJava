package løkker;

public class EksempelStrngLøkke {
    public static void main(String[] args) {
        // Öğrencilerin adlarını içeren bir dizi
        String[] students = {"Bjørn", "Line", "Ella", "Per","Hans","Harald","Kong"};
        // For løkke kullanarak adları tek tek yazdırma
        for (int i=0; i<students.length; i++){
            System.out.println("Yoklamadaki ogrenciler "+students[i]);
        }
    }
}
