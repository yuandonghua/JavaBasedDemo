package fit.hrkj.annotation.apt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;
import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.Name;
import javax.lang.model.element.TypeElement;

/**
 * APT工具，用来生成映射文件<br>
 * 2019年12月21日下午8:15:38
 * 
 * @author 华软科技
 * @version 1.0
 */
@SupportedSourceVersion(SourceVersion.RELEASE_11) // 指定版本
@SupportedAnnotationTypes({ "Persistent", "Id", "Property" }) // 指定可处理的注解
public class HiberNateAnnotationProcessor extends AbstractProcessor {
	@Override
	public synchronized void init(ProcessingEnvironment processingEnv) {
		// TODO Auto-generated method stub
		super.init(processingEnv);
	}

	// 循环处理每个需要处理的程序对象
	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
		
		// TODO Auto-generated method stub
		// 定义一个文件输出流，用于生成额外的文件
		PrintStream ps = null;
		try {
			
			// 遍历每个被@Persistent修饰的class文件
			for (Element e : roundEnv.getElementsAnnotatedWith(Persistent.class)) {
				// 获取正在处理的类名
				Name clazzName = e.getSimpleName();
				// 获取类定义前的@Persistent注解
				Persistent persistent = e.getAnnotation(Persistent.class);
				// 创建文件输出流
				ps = new PrintStream(new FileOutputStream("../files/"+clazzName + ".hbm.xml"));
				// 执行输出
				ps.println("<?xml version=\"1.0\"?>");
				ps.println("<!DOCTYPE hibernate-mapping PUBLIC>");
				ps.println("    \"-//Hibernate/Hibernate " + "Mapping DTD 3.0//EN\"");
				ps.println("    \"http://www.hibernate.org/dtd/hibernate-mapping-3.0.dtd\"");
				ps.println("<hibernate-mapping>");
				ps.println("    <class name=\"" + e);
				// 输出persistent的table()值
				ps.println("\"table=\"" + persistent.table() + "\">");
				for (Element e2 : e.getEnclosedElements()) {
					// 只处理成员变量上的注解
					if (e2.getKind() == ElementKind.FIELD) {// 1️⃣
						// 获取成员变量定义前的@Id注解
						Id id = e2.getAnnotation(Id.class);// 2️⃣
						// 当@id注解存在时输出<id.../>元素
						if (id != null) {

							ps.println("        <id name=\"" + e2.getSimpleName() + "\" column=\"" + id.column()
									+ "\" type=\"" + id.type() + "\">");
							ps.println("        <generator class=\"" + id.generator() + "\"/>");
							ps.println("        </id>");
						}
						// 获取成员变量定义前的@Property注解
						Property property = e2.getAnnotation(Property.class);// 3️⃣
						// 当@Property注解存在时输出<property.../>元素
						if (property != null) {

							ps.println("        <property name=\"" + e2.getSimpleName() + "\" column=\""
									+ property.column() + "\" type=\"" + property.type() + "\"/>");
						}
					}
				}
				ps.println("    </class>");
				ps.println("</hibernate-mapping>");

			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (ps != null) {
				ps.close();
			}
		}

		return true;
	}

}
