package taskuu;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;



public class base {


        static Properties pr = new Properties();
	
		public static String getlaunch(String key) throws Exception {
		FileInputStream fs = new FileInputStream("D:\\Testing Program\\task-3\\file.properties");
		pr.load(fs);
		
		String value = pr.get(key).toString();
		
		if(StringUtils.isEmpty(value)) {
			throw new Exception(key);
		}
		return value;
           }
		}
