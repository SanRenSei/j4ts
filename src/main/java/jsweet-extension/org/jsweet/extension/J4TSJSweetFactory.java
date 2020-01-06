package org.jsweet.extension;

import org.jsweet.transpiler.JSweetFactory;
import org.jsweet.transpiler.JavaCompilationComponents.JavaCompilerOptions;

public class J4TSJSweetFactory extends JSweetFactory {
	
	public JavaCompilerOptions finalizeJavaCompilerOptions(JavaCompilerOptions options) {
//		System.out.println("POUET");
		options.put("--module-source-path", "src/main/java");
		options.put("-d", "target/PLULULU");
//		options.put("--illegal-access=permit");
		options.put("--add-modules", "java.emul");
		options.put("--patch-module", "java.base=src/main/java/java.base");
		options.put("--add-exports", "java.base/java.lang=java.base");
		options.put("--add-exports", "org.jsweet.core.es6/jsweet.lang=java.base");
		options.put("--add-reads", "org.jsweet.core.es6=java.base");
		options.put("--add-reads", "java.base=ALL-UNNAMED");
		options.put("--add-reads", "java.base=org.jsweet.core.es6");
		options.put("--add-reads", "java.base=java.emul");
		options.put("--add-reads", "java.emul=java.base");
		
		options.put("--add-exports", "java.base/java.util=java.emul");
		options.put("--add-exports", "java.base/java.lang=java.emul");
		
		options.put("--add-exports", "org.jsweet.core.es6/jsweet.util=java.base");
		options.put("--add-reads", "org.jsweet.core.es6=java.base");
			
		return super.finalizeJavaCompilerOptions(options);
	}
}
