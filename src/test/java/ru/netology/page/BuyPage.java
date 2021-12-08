package ru.netology.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataHelper;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BuyPage {
    private SelenideElement numberCardField = $("input.input__control");
    private SelenideElement monthField = $$("input.input__control").get(1);
    private SelenideElement yearField = $$("input.input__control").get(2);
    private SelenideElement ownerField = $$("input.input__control").get(3);
    private SelenideElement codeField = $$("input.input__control").get(4);

    public void notificationPage(DataHelper.PurchaseInfo purchaseInfo) {
        numberCardField.setValue(purchaseInfo.getCardNumber());
        monthField.setValue(purchaseInfo.getMonth());
        yearField.setValue(purchaseInfo.getYear());
        ownerField.setValue(purchaseInfo.getOwner());
        codeField.setValue(purchaseInfo.getCode());
    }
}