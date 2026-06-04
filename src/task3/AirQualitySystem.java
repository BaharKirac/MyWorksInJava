package task3;

public class AirQualitySystem {

        // Hava kalitesini döndüren metod
        public String airQualityStatus(int measure) {

            // Ölçüme göre hava kalitesi belirleniyor
            if (measure <= 12) {
                return "God";
            }
            else if (measure <= 35) {
                return "Moderat";
            }
            else if (measure <= 55) {
                return "Usunn";
            }
            else if (measure <= 150) {
                return "Veldig usunn";
            }
            else {
                return "Farlig";
            }
        }

        // Uyarı gerekli mi kontrol ediyor
        public boolean warn(int measure, String month) {

            // Kış ayları
            if ((month.equals("desember")
                    || month.equals("januar")
                    || month.equals("februar"))
                    && measure > 30) {

                return true;
            }

            // Yaz ayları
            else if ((month.equals("juni")
                    || month.equals("juli")
                    || month.equals("august"))
                    && measure > 50) {

                return true;
            }

            // İlkbahar ve sonbahar
            else if (measure > 40) {
                return true;
            }

            // Diğer durumlarda uyarı yok
            return false;
        }

        // Hava kalitesine göre öneri döndürür
        public String getWarning(String airQuality) {

            // Hava kalitesine göre mesaj döndürülüyor
            if (airQuality.equals("Farlig")) {
                return "Stans all biltrafikk og informer befolkningen";
            }

            else if (airQuality.equals("Veldig usunn")) {
                return "Begrens bilkjøring og vurder hjemmekontor";
            }

            else if (airQuality.equals("Usunn")) {
                return "Informer befolkningen og anbefal redusert aktivitet ute";
            }

            else if (airQuality.equals("Moderat")) {
                return "Informer befolkningen";
            }

            else {
                return "Ingen spesielle tiltak";
            }
        }
    }

