package ru.netology.test;

import lombok.val;
import org.junit.jupiter.api.Test;
import ru.netology.data.DataHelper;
import ru.netology.page.StartPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class ServiceTest {

    @Test
    void paymentApprovedСard() {
        val purchaseInfo = DataHelper.getPurchaseInfoApproved();
        val startPage = open("http://localhost:8080", StartPage.class);
        val buyPage = startPage.buyPage();
        buyPage.notificationPage(purchaseInfo);
        $$("button.button_view_extra").find(exactText("Продолжить")).click();
        $(withText("Успешно")).shouldBe(visible, Duration.ofSeconds(7));
    }

    @Test
    void paymentDeclinedСard() {
        val purchaseInfo = DataHelper.getPurchaseInfoDeclined();
        val startPage = open("http://localhost:8080", StartPage.class);
        val buyPage = startPage.buyPage();
        buyPage.notificationPage(purchaseInfo);
        $$("button.button_view_extra").find(exactText("Продолжить")).click();
        $(withText("Успешно")).shouldBe(visible, Duration.ofSeconds(13));
    }
}