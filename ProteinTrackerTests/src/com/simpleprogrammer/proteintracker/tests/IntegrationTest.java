package com.simpleprogrammer.proteintracker.tests;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.simpleprogrammer.proteintracker.InvalidGoalException;
import com.simpleprogrammer.proteintracker.TrackingService;

public class IntegrationTest {
	
	private Voice voice;
	
	@Before
	public void setUp() throws IOException {
		voice = new voice("This is a new voice", bamargeracky@gmail.com, bamargeracky, ga20021986ksks);
	}

	@Test
	public void GoalMetShouldSendNotification() throws IOException, InvalidGoalException
	{
		
		TrackingService service = new TrackingService(new SMSNotifier("This is a message", bamargeracky@gmail.com, bamargeracky, ga20021986ksks);
				service.setGoal(50);
		service.addProtein(51);
		
		assertTrue(voice.getSMS().contains("goal met"));
		
	}
	
	@After
	public void tearDown() throws IOException {
		for(SMSThread thread: voice.getSMSThread())
		{
			voice.deleteMessage(thread.getId());
		}
		
	}
}
