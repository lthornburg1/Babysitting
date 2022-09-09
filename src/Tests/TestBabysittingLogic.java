package Tests;
import model.BabysittingCustomers;
import model.BabysittingEmployees;
import model.BabysittingSchedule;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author lthor - lthornburg1
 * CIS175 - Fall 2022
 * Sep 8, 2022
 */
public class TestBabysittingLogic {
	BabysittingEmployees babyEmp = new BabysittingEmployees();
	BabysittingCustomers babyCust = new BabysittingCustomers();
	BabysittingSchedule babySch = new BabysittingSchedule();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateRate() {
		babyEmp.setRate(12.00);
		babyCust.setHoursNeeded(4);
		double dailyRate = babySch.calculateRate(babyEmp, babyCust); 
		assertEquals(48, dailyRate, 0.0);
	}
	
	

}