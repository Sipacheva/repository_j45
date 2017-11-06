package ru.stqa.pft.adressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.adressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.initContactCreation();
    app.fillContactForm(new ContactData("Firstname1", "Middlename1", "Lastname1", "Nickname", "+7(555)3332245", "test@test"));
    app.submitContactCreation();
  }
}
