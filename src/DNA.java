public class DNA {

  public static void main(String[] args) {

    StringBuilder builder = new StringBuilder();
    String dna = "";
    String sequence = dna.toUpperCase();
    for(int i=0;i<dna.length();i++){
      char c = dna.charAt(i);
      if(dna.charAt(i) == 'A'){
        builder.append('T');
      }
      if(dna.charAt(i) == 'T'){
        builder.append('A');
      }
      if(dna.charAt(i) == 'C'){
        builder.append('G');
      }
      if(dna.charAt(i) == 'G'){
        builder.append('C');
      }
    }

    System.out.println(builder.toString());
  }

}
