
public class JobImpl implements Job{
	
	String codeName;
	String location;
	String target;
	String intel;
	int budget;
	int agentCode;

	@Override
	public String getCodeName() {
		// TODO Auto-generated method stub
		return codeName;
	}

	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return location;
	}

	@Override
	public String getTarget() {
		// TODO Auto-generated method stub
		return target;
	}

	@Override
	public String getIntel() {
		// TODO Auto-generated method stub
		return intel;
	}

	@Override
	public int getBudget() {
		// TODO Auto-generated method stub
		return budget;
	}

	@Override
	public void setCodeName(String codeName) {
		this.codeName = codeName;
		
	}

	@Override
	public void setLocation(String location) {
		this.location = location;
		
	}

	@Override
	public void setTarget(String target) {
		this.target = target;
		
	}

	@Override
	public void setIntel(String intel) {
		this.intel = intel;
		
	}

	@Override
	public void setBudget(int budget) {
		this.budget = budget;
		
	}

	@Override
	public int getAgentCode() {
		// TODO Auto-generated method stub
		return agentCode;
	}

	@Override
	public void setAgentCode(int agentCode) {
		this.agentCode = agentCode;
		
	}
	
	

}
