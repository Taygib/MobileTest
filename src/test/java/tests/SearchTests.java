package tests;


import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class SearchTests extends TastBase {
    @Test
    void successfulSearchTest() {


        $(accessibilityId("Search Wikipedia")).click();

        $(id("org.wikipedia.alpha:id/search_src_text")).setValue("Java");

        //org.wikipedia.alpha:id/search_container


        $$("org.wikipedia.alpha:id/page_list_item_title")
                .shouldHave(sizeGreaterThan(0));


    }
}
