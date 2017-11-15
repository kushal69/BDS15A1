package com

object Company {
  def main(arg : Array[String]){
    var dept: Department = new Department();
    
    println("Employee : " + dept.empName);
    println("Department : " + dept.deptName);
  }
}