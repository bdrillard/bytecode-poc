package com.aeskilson.bytecode.poc;

/**
 * @author Aleksander Eskilson
 */
public class ArrObject {
  int[] iVars = new int[4];
  String[] sVars = new String[4];

  NestedClass n = new NestedClass();

  public void init() {
    for (int i = 0; i < iVars.length; i++) {
      iVars[i] = 0;
    }

    for (int i = 0; i < sVars.length; i++) {
      sVars[i] = null;
    }
  }

  public void apply() {
    iVars[0] = 1;
    iVars[1] = 1;
    iVars[2] = 1;
    iVars[3] = 1;

    sVars[0] = "foo";
    sVars[1] = "foo";
    sVars[2] = "foo";
    sVars[3] = "foo";

    n.apply1();
    n.apply2();
  }

  public void run() {
    init();
    apply();

    System.out.println(iVars[3]);
    System.out.println(sVars[3]);
  }

  public class NestedClass {
    public void apply1() {
      iVars[0] = 2;
      iVars[1] = 2;
      iVars[2] = 2;
      iVars[3] = 2;

      sVars[0] = "bar";
      sVars[1] = "bar";
      sVars[2] = "bar";
      sVars[3] = "bar";
    }

    public void apply2() {
      iVars[3] = iVars[0]
          + iVars[1]
          + iVars[2]
          + iVars[3];
      sVars[3] = sVars[0]
          + sVars[1]
          + sVars[2]
          + sVars[3];
    }
  }
}
