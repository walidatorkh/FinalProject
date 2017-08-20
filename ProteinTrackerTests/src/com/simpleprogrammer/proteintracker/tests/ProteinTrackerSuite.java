package com.simpleprogrammer.proteintracker.tests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.simpleprogrammer.proteintracker.TrackingService;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	HelloJunitTest.class,
	TrackingService.class
})
public class ProteinTrackerSuite {

}
