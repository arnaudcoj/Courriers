/**
 * TP Courriers
 * @author Pierre Graux
 * @author Arnaud Cojez
 */
package mails.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Class defining the AllTests
 */
@RunWith(Suite.class)
@SuiteClasses({ BankAccountTest.class, CityTest.class, InhabitantTest.class, MoneyTest.class, AcknowledgmentOfReceiptTest.class })
public class AllTests {

}
