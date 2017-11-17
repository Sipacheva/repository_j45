package ru.stqa.pft.adressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getNavigationHelper().gotoHomePage();
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Firstname1", "Middlename1",
              "Lastname1", "Nickname", "+7(555)3332245", "test@test", "test1"), true);
    }
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Firstname2", "Middlename2", "Lastname2", "Nickname2", "+7(555)3332242", null, null), false);
    app.getContactHelper().submitContactModification();
  }

}
