package com.aeskilson.bytecode.poc;

/**
 * @author Aleksander Eskilson
 */
public class Main {
  public static void main(String[] args) {
    VarObject v = new VarObject();
    v.run();

    ArrObject a = new ArrObject();
    a.run();

    final long vlStartTime = System.currentTimeMillis();
    VarObjectLarge vl = new VarObjectLarge();
    vl.run();
    final long vlEndTime = System.currentTimeMillis();

    final long alStartTime = System.currentTimeMillis();
    ArrObjectLarge al = new ArrObjectLarge();
    al.run();
    final long alEndTime = System.currentTimeMillis();

    System.out.println("Variable execution time (ms): " + (vlEndTime - vlStartTime));
    System.out.println("Array execution time (ms): " + (alEndTime - alStartTime));
  }
}
