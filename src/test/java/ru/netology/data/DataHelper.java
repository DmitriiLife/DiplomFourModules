package ru.netology.data;

import lombok.Value;

public class DataHelper {
    private DataHelper() {
    }

//    public static class Purchase {
//        public static Purchase generateInfo(String locale) {
//            Faker faker = new Faker(new Locale(locale));
//            return new PurchaseInfo(
//                    "1111222233334444",
//                    faker.date().between().getMonth(),
//                    faker.name().fullName(),
//                    faker.phoneNumber().phoneNumber());
//        }
//    }

    @Value
    public static class PurchaseInfo {
        private String cardNumber;
        private String month;
        private String year;
        private String owner;
        private String code;
    }

    public static PurchaseInfo getPurchaseInfoApproved() {
        return new PurchaseInfo(
                "1111222233334444",
                "12",
                "23",
                "Ivanov",
                "123");
    }

    public static PurchaseInfo getPurchaseInfoDeclined() {
        return new PurchaseInfo(
                "5555666677778888",
                "11",
                "22",
                "Petrov",
                "321");
    }
}
