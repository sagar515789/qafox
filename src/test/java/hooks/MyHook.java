package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class MyHook 
{
	@Before
	public void setup(Scenario  scenario)
	{
		System.out.println("execution started  *"+scenario.getName());
		System.out.println("browser launched");
	}
	@After
	public void teardown(Scenario  scenario)
	{
		System.out.println("execution ended  *"+scenario.getName());
		System.out.println("browser closed");
	}
	@BeforeStep
	public void hookkstep()
	{
		System.out.println("before step");
	}
	@AfterStep
	public void hookkstep2()
	{
		System.out.println("after step");
	}

}
