package ru.stqa.pft.adressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Firstname1", "Middlename1", "Lastname1", "Nickname", "+7(555)3332245", "test@test", "test1"), true);
    app.getContactHelper().submitContactCreation();
  }
}
