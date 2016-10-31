void celNFah (String unit,double temp) {
  if (unit.equals("F")) {
    System.out.println((temp-32)/1.8+"C");
  }
  else {
    System.out.println(temp*1.8+32.0+"F");
  }
}