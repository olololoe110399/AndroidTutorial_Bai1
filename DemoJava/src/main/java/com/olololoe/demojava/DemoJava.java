package com.olololoe.demojava;

import java.util.ArrayList;

public class DemoJava {
  public static void main(String[] args) {
    DemoJava demoJava = new DemoJava();
//    demoJava.declareVariables();
//    demoJava.comparisonOperators();
//    demoJava.ifSwitch();
//    demoJava.whileLoop();
//    demoJava.forLoop();
//    demoJava.array();
//    demoJava.arrayList();
//    demoJava.function();
  }

  private void declareVariables() {
    // Kiểu dữ liệu
    int a;                       // Khai báo biến kiểu int tên là a.
    int b, c, d;                 // Khai báo 3 biến kiểu int tên là b,c,d.
    String name = "Duy";         // Khai báo và khởi tạo biến String tên name với giá trị là Duy
    int numberA = 5, numberB = 7;// Khai báo và khởi tạo biến int
    final double PI = 3.14159;   // Khai báo và khởi tạo hằng số double với giá trị 3.14159
    // Tìm hiểu về từ khóa static trong Java
    // Toán tử trong Java ( Số học, quan hệ )
  }

  private void comparisonOperators() {
    String name1 = "Duy", name2 = "Duy";
    System.out.println(name1 == name2 ? "true" : "false");
    System.out.println(name1.equals(name2) ? "true" : "false");
    // Tìm hiểu == và equals khác gì nhau ?
  }

  private void ifSwitch() {
    // ?:
    int number = 1;
    System.out.println(number == 1 ? "true" : "false");
    // if else
    if (number >= 1) {
      // Điều kiện đúng
      System.out.println("true");
    } else {
      // Điều kiện sai
      System.out.println("false");
    }
    // switch case
    char grade = 'C';

    switch (grade) {
      case 'A':
        System.out.println("A");
        break;
      case 'B':
      case 'C':
        System.out.println("C");
        break;
      case 'D':
        System.out.println("D");
        break;
      case 'F':
        System.out.println("F");
        break;
      default:
        System.out.println("try again ");
    }
    System.out.println("grade is: " + grade);
    // Tìm hiểu continue
  }

  private void whileLoop() {
    int x = 1;
    while (x < 10) {
      System.out.println("x : " + x);
      x++;
    }
  }

  private void forLoop() {
    for (int x = 1; x < 10; x++) {
      System.out.println("x : " + x);
    }
  }

  private void array() {
    int[] a = new int[5];
    a[0] = 10;
    a[1] = 20;
    a[2] = 70;
    a[3] = 40;
    a[4] = 50;
    int lenght = a.length;//length là kích thước mảng
    System.out.println(lenght);
    for (int i = 0; i < a.length; i++)
      System.out.println(a[i]);
    // foreach
    for (int value : a) System.out.println(value);
  }

  private void arrayList() {
    ArrayList<String> arrayList = new ArrayList<>();
    // display the size
    System.out.println("Size : " + arrayList.size());
    // add item
    arrayList.add("C");
    arrayList.add("A");
    arrayList.add("E");
    arrayList.add("B");
    arrayList.add("D");
    arrayList.add("F");
    arrayList.add(1, "A2");
    // display the size
    System.out.println("Size : " + arrayList.size());
    // display the array list
    System.out.println("ArrayList : " + arrayList);
    // display item with position is 2
    System.out.println("item with position is 2: " + arrayList.get(2));
    // display last item
    System.out.println("last item : " + arrayList.get(arrayList.size() - 1));
    // remove item of arrayList
    arrayList.remove("F");
    arrayList.remove(2);
    // display the size
    System.out.println("Size : " + arrayList.size());
    // display the array list
    System.out.println("ArrayList: " + arrayList);
  }

  private void function() {
    int position = 1, numberA = 1, numberB = 2;
    String name = "Duy";
    function1(position, name);
    int sum = function2(numberA, numberB);
    System.out.println("sum: " + sum);
  }

  private void function1(int position, String name) {
    System.out.println("position: " + position + "-" + "name:" + name);
  }

  private int function2(int numberA, int numberB) {
    return numberA + numberB;
  }
}
  