public class Random {
    
    public static void main(String[] args){
        
       Random rand = new Random();
        String[] numeParticip = {"Andreea", "Bianca R", "Bianca E", "Emanuel", "Marius"};
        
        System.out.println(numeParticip[rand.nextInt(numeParticip.length)]);
    }
    private int nextInt(int length) {
        return (int)(Math.random() * length);
    }


}
