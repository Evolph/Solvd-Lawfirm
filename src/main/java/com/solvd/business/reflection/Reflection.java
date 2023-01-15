package com.solvd.business.reflection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.lang.reflect.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflection {

private static final Logger LOGGER = LogManager.getLogger(Reflection.class);

public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    Class<?> caseFileClass = Class.forName("com.solvd.business.lawfirm.CaseFile");
    Object caseFile = caseFileClass.getConstructor(int.class, String.class, String.class, int.class, int.class, int.class, int.class).newInstance(1000, "Client's Case", "FELONY", 300, 1, 600, 500);

    LOGGER.info(String.format(
            "Parent class of %s is %s", caseFileClass.getSimpleName(), caseFileClass.getSuperclass().getSimpleName()
    ));
    LOGGER.info("\n*******Fields*******\n");
    for(Field field : caseFileClass.getDeclaredFields()){
        LOGGER.info(field.getName() + " is a " + Modifier.toString(field.getModifiers()) + " field of the " + field.getType() + " type.");
    }

    LOGGER.info("\n*******Methods*******\n");
    for(Method method: caseFileClass.getDeclaredMethods()){
        LOGGER.info(method.getName() + " is a method with the " + Modifier.toString(method.getModifiers()) + " modifier and it's parameter types are: " + Arrays.toString((method.getParameterTypes())));
    }

    LOGGER.info("\n*******Usage of edit method*******\n");
    caseFileClass.getMethod("edit", int.class, String.class, String.class, int.class, int.class, int.class).invoke(caseFile, 3, "Sergey's Case", "INHERITANCE", 100, 2, 501);
    LOGGER.info("Edited casefile: ");
    LOGGER.info("ID: " + caseFileClass.getMethod("getId").invoke(caseFile));
    LOGGER.info("Name: " + caseFileClass.getMethod("getName").invoke(caseFile));
    LOGGER.info("Description: " + caseFileClass.getMethod("getDescription").invoke(caseFile));
    LOGGER.info("Lawyer's ID: " + caseFileClass.getMethod("getLawyer").invoke(caseFile));
    LOGGER.info("Client's ID: " + caseFileClass.getMethod("getClient").invoke(caseFile));
    LOGGER.info("Paralegal's ID: " + caseFileClass.getMethod("getParalegal").invoke(caseFile));


}
}
