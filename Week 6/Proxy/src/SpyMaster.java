import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SpyMaster implements InvocationHandler{
	
	Job job;
	
	public SpyMaster(Job job) {
		this.job = job;
	}
	

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) 
			throws IllegalAccessException {
		
		try {
			
			if (method.getName().startsWith("get")) {
				return method.invoke(job, args);
			}else if(method.getName().equals("setAgentCode")) {
				System.out.println("ERROR: YOu CaN't DO THIS!!");
				throw new IllegalAccessException();
			}
			
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			System.out.println("ERROR: YOu CaN't DO THIS!!");
		}
		
		
		return null;
	}

}
