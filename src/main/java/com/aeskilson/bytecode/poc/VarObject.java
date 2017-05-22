package com.aeskilson.bytecode.poc;

/**
 * @author Aleksander Eskilson
 */
public class VarObject {
  int iVar1;
  int iVar2;
  int iVar3;
  int iVar4;

  String sVar1;
  String sVar2;
  String sVar3;
  String sVar4;

  NestedClass n = new NestedClass();

  public void init() {
    iVar1 = 0;
    iVar2 = 0;
    iVar3 = 0;
    iVar4 = 0;

    sVar1 = null;
    sVar2 = null;
    sVar3 = null;
    sVar4 = null;
  }

  public void apply() {
    iVar1 = 1;
    iVar2 = 1;
    iVar3 = 1;
    iVar4 = 1;


    sVar1 = "foo";
    sVar2 = "foo";
    sVar3 = "foo";
    sVar4 = "foo";

    n.apply1();
    n.apply2();
  }

  public void run() {
    init();
    apply();

    System.out.println(iVar4);
    System.out.println(sVar4);
  }

  public class NestedClass {
    public void apply1() {
      iVar1 = 2;
      iVar2 = 2;
      iVar3 = 2;
      iVar4 = 2;

      sVar1 = "bar";
      sVar2 = "bar";
      sVar3 = "bar";
      sVar4 = "bar";
    }

    public void apply2() {
      iVar4 = iVar1
          + iVar2
          + iVar3
          + iVar4;
      sVar4 = sVar1
          + sVar2
          + sVar3
          + sVar4;
    }
  }
}
