import java.lang.reflect.Proxy;
import java.util.HashMap;

public class Main {
	
	HashMap<String, Job> jobs = new HashMap<String, Job>();

	public static void main(String[] args) {
		Main newJobs = new Main();
		//newJobs.missionOne();
		
		//comment the above mission to run the below mission with different exceptions
		newJobs.missionTwo();

	}
	
	
	public void missionOne() {
		
		//JOB One available for the taking 
		Job jobOne = new JobImpl();
		jobOne.setCodeName("Elephant");
		jobOne.setLocation("London");
		jobOne.setTarget("James Bond");
		jobOne.setIntel("British male, 35 YO, Brown hair, blue eyes");
		jobOne.setBudget(10000);
		//jobOne.setAgentCode(5555);
		

			System.out.println("JOB ONE");
			System.out.println("CodeName: " + jobOne.getCodeName() + ", Location: " + jobOne.getLocation());
			Job job1= getSpyMaster(jobOne);
			Job job2 = getSpy(jobOne);
			job2.setAgentCode(1007);
			System.out.println("Agent Code: "+jobOne.getAgentCode());
			job1.getAgentCode();
			job1.setAgentCode(4343);
	}
	
public void missionTwo() {
		
		//JOB Two for the taking 
		Job jobTwo = new JobImpl();
		jobTwo.setCodeName("Rhino");
		jobTwo.setLocation("Moscow");
		jobTwo.setTarget("Nuke Missle Silo");
		jobTwo.setIntel("Launch codes in red binder, 2nd level in safe");
		jobTwo.setBudget(55000);
		//jobTwo.setAgentCode(5555);
		
	
			System.out.println("JOB ONE");
			System.out.println("CodeName: " + jobTwo.getCodeName() + ", Location: " + jobTwo.getLocation());
			Job job1= getSpyMaster(jobTwo);
			Job job2 = getSpy(jobTwo);
			job2.setAgentCode(1007);
			job2.setBudget(99999999);

	}
	
	Job getSpyMaster(Job job) {
		return (Job) Proxy.newProxyInstance(job.getClass().getClassLoader(), job.getClass().getInterfaces(), new SpyMaster(job));
	}
	
	Job getSpy(Job job) {
		return (Job) Proxy.newProxyInstance(job.getClass().getClassLoader(), job.getClass().getInterfaces(), new Spy(job));
	}

}