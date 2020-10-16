package src.com.sample.sampleProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Autowired
	SampleDataDAO objDao;
	
	@GetMapping("/loadDemo")
	public String getLoadData() {
		objDao.getEmpData();
		return "Loaded Demo Controller Class successfully";
	}

}
