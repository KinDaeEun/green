package pro;

import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Ex01 {
	public static void main(String[] args) {
		AbstractApplicationContext ac= new GenericXmlApplicationContext("/pro/pro.xml");
		PropertyBean pb = ac.getBean(PropertyBean.class);
		Properties addrs = pb.getAddrs();
		Set<Object> set = addrs.keySet();
		for(Object key:set) {
			System.out.println(key+" : "+addrs.get(key));
		}
		
		ac.close();
	}
}
