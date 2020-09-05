package com.osa.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	//Hook
@Before
public void startScenaniro() {
	System.out.println("++++++++Starting Scenario+++++++++++");
}
@After
public void endScenaniro() {
	System.out.println("---------Ending Scenario-------------");
}
}
