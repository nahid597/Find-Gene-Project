
public class FindingGene
{
    public String findSimpleGene(String dna){
        int startIndex, endIndex;
        startIndex = dna.indexOf("ATG");
        endIndex = dna.indexOf("TAA",startIndex+3);
        while(endIndex != -1){
            if((startIndex-endIndex) % 3 == 0)
                return dna.substring(startIndex,endIndex + 3);
            else
                endIndex = dna.indexOf("TAA",endIndex + 3);
        }      
    return " ";
    }
     
    void part1(){
       String dna = "AGATGAATGATTAATT";
       String gene = findSimpleGene(dna);
       System.out.println("DNA string : " + dna + "\nGene : " + gene);
       
       dna = "AGATGAATTGATTAATT";
       gene = findSimpleGene(dna);
       System.out.println("DNA string : " + dna + "\nGene : " + gene);
       
       dna = "AGATGAATTGATTAATT";
       gene = findSimpleGene(dna);
       System.out.println("DNA string : " + dna + "\nGene : " + gene); 
    }
}
