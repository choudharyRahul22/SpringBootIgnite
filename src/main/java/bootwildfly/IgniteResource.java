package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IgniteResource {

	// Change POM before deploying to OSE
	// Deleted index.html file : running fine /load_data_to_ignite
	
    @RequestMapping("load_data_to_ignite")
    public String loadDataToIgnite(){
    	
        return ("Loading data to Ignite !");
    }
    
    
    @RequestMapping("read_data_from_ignite")
    public String readDataFromIgnite(){
    	
        return ("Reading data from Ignite !");
    }
}