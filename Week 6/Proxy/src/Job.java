
public interface Job {
	
	String getCodeName();
	String getLocation();
	String getTarget();
	String getIntel();
	int getBudget();
	int getAgentCode();
	
	
	void setCodeName(String codeName);
	void setLocation(String location);
	void setTarget(String target);
	void setIntel(String intel);
	void setBudget(int budget);
	void setAgentCode(int agentCode);

}
