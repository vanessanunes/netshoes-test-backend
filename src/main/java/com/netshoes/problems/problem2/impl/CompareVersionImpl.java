package com.netshoes.problems.problem2.impl;

// Nao alterar o nome dessa classe!
public class CompareVersionImpl {

    // Nao alterar a assinatura desse metodo
    public static int compareVersion(String version1, String version2) {
        // TODO sua implementacao! Fique a vontade para criar suas classes/interfaces caso julgue necessario.

    	while (version1.endsWith("0")) {
			version1.substring(version1.length());
		}
    	while (version2.endsWith("0")) {
			version2.substring(version2.length());
		}
    	
    	version1 = version1.replace(".", "");
		version2 = version2.replace(".", "");
    	
    	if (version1.equals(version2)) {
    		return 0;
    	}
    	
    	if (Long.parseLong(version1) > Long.parseLong(version2)) {
    		return 1;
    	}
    	
    	if (Long.parseLong(version1) < Long.parseLong(version2)) {
    		return -1;
    	}
    	
    	
    	
    	return 4;
    	
    }
}
