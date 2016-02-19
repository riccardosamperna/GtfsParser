package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.googlecode.jcsv.annotations.MapToColumn.Default;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface GtfsColumn {
	
	String column();
	
	Class<?> type() default Default.class;
	
	boolean optional() default false;
}
