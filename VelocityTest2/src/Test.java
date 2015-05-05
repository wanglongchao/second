import java.io.StringWriter;
import java.util.Date;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import entity.Student;


public class Test {

	public static void main(String[] args) {
		VelocityEngine ve = new VelocityEngine();
		ve.init();
		Template t = ve.getTemplate("hello.vm", "utf-8");
		VelocityContext vc = new VelocityContext();
		vc.put("name", "张三");
		vc.put("date", new Date());
		vc.put("student",new Student("王五","上海"));
		StringWriter sw = new StringWriter();
		t.merge(vc, sw);
		System.out.println(sw.toString());

	}

}
