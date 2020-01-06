package org.jsweet.extension;

import org.jsweet.transpiler.JSweetFactory;
import org.jsweet.transpiler.JavaCompilationComponents.JavaCompilerOptions;

public class J4TSJSweetFactory extends JSweetFactory {
	
	public JavaCompilerOptions finalizeJavaCompilerOptions(JavaCompilerOptions options) {
		System.out.println("POUET");
//		options.put("--module-source-path", "src/main/java");
		options.put("--patch-module", "java.base=src/main/java");
		options.put("--add-exports", "java.base/java.lang=ALL-UNNAMED");
		options.put("--add-opens", "java.base/java.lang=ALL-UNNAMED");
			
		return super.finalizeJavaCompilerOptions(options);
	}
}
