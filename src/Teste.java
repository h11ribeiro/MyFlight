public class Teste {
    {
        Scanner in = new Scanner(System.in);
        String nome1, nome2, nome3, primeiro,segundo,terceiro;
        
        System.out.print("Digite um nome: ");
        nome1 = in.nextLine();
        System.out.print("Digite um nome: ");
        nome2 = in.nextLine();
        System.out.print("Digite um nome: ");
        nome3 = in.nextLine();
        
        if (nome1.compareToIgnoreCase(nome2) <0 && nome1.compareToIgnoreCase(nome3) <0){
            primeiro = nome1;
            if (nome2.compareToIgnoreCase(nome3) <0){
                segundo = nome2;
                terceiro = nome3;
             }
            else{
                segundo = nome3;
                terceiro = nome2;
                }
            }    
        else if (nome2.compareToIgnoreCase(nome1) <0 && nome2.compareToIgnoreCase(nome3) <0){
            primeiro = nome2;
            if (nome1.compareToIgnoreCase(nome3) <0){
                segundo = nome1;
                terceiro = nome3;
             }
            else {
                segundo = nome3;
                terceiro = nome1;
             }
         }
        else
            {
            primeiro = nome3;
            if (nome1.compareToIgnoreCase(nome2) <0){
                segundo = nome1;
                terceiro = nome2;
             }
            else {
                segundo = nome2;
                terceiro = nome1;
             }
          }
        
         System.out.println(primeiro);
         System.out.println(segundo);
         System.out.println(terceiro);
    }
 }
 
}
