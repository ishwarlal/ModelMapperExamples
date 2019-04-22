package strategies.loose;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

import strategies.IExample;
import strategies.models.Employee;
import strategies.models.EmployeeDTO;
import strategies.models.Util;

public class LooseStrategyExample implements IExample {
	public void executeExample() {
		Employee e = Util.getDefaultEmployeeData();
		EmployeeDTO e2 = new EmployeeDTO();
		
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		mapper.map(e, e2);
		
		System.out.println("-----Actual Employee---");
		System.out.println(e);
		System.out.println("-----Mapped Employee---");
		System.out.println(e2);
	}
}
