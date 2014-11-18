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
@SuiteClasses({ AcknowledgmentOfReceiptTest.class, BankAccountTest.class,
		CityTest.class, InhabitantTest.class, MoneyTest.class,
		RenderCityTest.class, StringBuilderTest.class })
public class AllTests {

}
