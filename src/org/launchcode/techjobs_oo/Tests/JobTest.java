package org.launchcode.techjobs_oo.Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.CoreCompetency;

import static org.junit.jupiter.api.Assertions.*;

class JobTest {
    Job test_job_one;
    Job test_job_two;
    Job test_job_three;
    Job test_job_four;


    @BeforeEach
    public void setUp() {
        test_job_one = new Job("Bob", new Employer("Hardies"), new Location("Dallas"), new PositionType("NightShift"), new CoreCompetency("Sweeping"));
        test_job_two = new Job("Bob", new Employer("Hardies"), new Location("Dallas"), new PositionType("NightShift"), new CoreCompetency("Sweeping"));
        test_job_three = new Job("Bob", new Employer(), new Location("Dallas"), new PositionType(), new CoreCompetency("Sweeping"));
    }

    @AfterEach
    void tearDown() {
    }
    
    @Tes
    public void testIdShouldIncrement() {
        assertFalse(test_job_one.getId() == test_job_two.getId());
        assertTrue(test_job_two.getId() == test_job_one.getId() + 1);

    }
    @Test
    public void testJobsForEquality() {
        assertFalse(test_job_one.equals(test_job_two));
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("Bob" ,test_job_one.getName());
        assertEquals("Hardies" , test_job_one.getEmployer().getValue());
        assertEquals("Dallas" , test_job_one.getLocation().getValue());
        assertEquals("NightShift" ,test_job_one.getPositionType().getValue());
        assertEquals("Sweeping", test_job_one.getCoreCompetency().getValue());
    }
    @Test
    public void testToStringMethod() {
       String tester = "\n ID: " + test_job_one.getId() + "\n Name: Bob\n Employer: Hardies\n Location: Dallas\n Position Type: NightShift\n Core Competency: Sweeping\n";
       assertEquals(tester, test_job_one.toString());
    }
    @Test
    public void testNullMethod() {
        String tester = "\n ID: " + test_job_three.getId() + "\n Name: Bob\n Employer: Data not available\n Location: Dallas\n Position Type: Data not available\n Core Competency: Sweeping\n";
        assertEquals(tester, test_job_three.toString());

    }
}